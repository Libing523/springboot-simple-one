package generics.coffee;

import java.util.Iterator;
import java.util.Random;


import net.mindview.util.Generator;

/**
 * 
 * @ClassName: CoffeeGenerator
 * @Description: 随机生成不同的Coffee对象
 * @author lishuaibing
 * @date 2019年11月26日 下午1:29:56
 *
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

	private Class[] types = { Latte.class, Breve.class, Cappuccino.class, Americano.class, Breve.class };
	private static Random rand = new Random(47);

	public CoffeeGenerator() {
	}

	private int size = 0;

	public CoffeeGenerator(int sz) {
		size = sz;
	}
	
	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	@Override
	public Coffee next() {

		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	class CoffeeIterator implements Iterator<Coffee> {

		int count = size;

		public boolean hasNext() {
			return count > 0;
		}

		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}

		public void move() {
			throw new UnsupportedOperationException();
		}

		public Iterator<Coffee> iterator() {
			return new CoffeeIterator();
		}

	}

	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i=0;i<5;i++)
			System.out.println(gen.next());
		for(Coffee c : new CoffeeGenerator(5))
			System.out.println(c);
		
	}


	
}
