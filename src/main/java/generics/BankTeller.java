package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import net.mindview.util.Generator;

/**
 * 
 * @ClassName: BankTeller
 * @Description: 15.5 匿名内部类 泛型还可以应用于内部类以及匿名内部类，例：匿名内部类实现了Generator接口
 * @author lishuaibing
 * @date 2019年11月27日 下午3:15:52
 *
 */
class Customer {
	private static long count = 0;
	private final long id = count++;

	private Customer() {

	}

	public String toString() {
		return "Customer " + id;
	}

	public static Generator<Customer> generator() {
		return new Generator<Customer>() {
			@Override
			public Customer next() {
				return new Customer();
			}
		};
	}
}

class Teller {
	private static long count = 0;
	private final long id = count++;

	private Teller() {
	}

	public String toString() {
		return "Teller: " + id;
	}

	public static Generator<Teller> generator() {
		return new Generator<Teller>() {
			@Override
			public Teller next() {
				return new Teller();
			}

		};
	}
}

public class BankTeller {

	public static void serve(Teller t,Customer c) {
		System.out.println(t+" serves "+c);
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator(), 4);
		for(Customer c : line)
			serve(tellers.get(rand.nextInt(tellers.size())),c);
	}
}
