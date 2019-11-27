package generics;

import java.util.ArrayList;
import java.util.Collection;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

/**
 * 
    * @ClassName: Generator
    * @Description: 15.4.3 用于Generator的泛型方法
    *   利用生成器，可以方便的填充一个Collection,而泛型化这种操作是有意义的
    * @author lishuaibing
    * @date 2019年11月27日 上午9:34:49
    *
 */
public class Generators {

	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		for(int i=0;i<n;i++)
			coll.add(gen.next());
		return coll;
		
	}
	
	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		for(Coffee c : coffee)
			System.out.print(c+"、");
		System.out.println();
		Collection<Integer> fnumber = fill(new ArrayList<Integer>(),new Fibonacci(),12);
		for(int i : fnumber)
			System.out.print(i+"、");
	}
	
}
