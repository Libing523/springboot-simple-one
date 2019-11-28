package generics;

import java.util.ArrayList;
import java.util.Random;

import net.mindview.util.Generator;

/**
 * 
 * @ClassName: Store
 * @Description: 15.6 使用泛型类型来构建复杂模型
 * @author lishuaibing
 * @date 2019年11月28日 上午9:09:18
 *
 */
class Product {

	private final int id;
	private String description;
	private double price;

	public Product(int IDnumber, String desc, double price) {
		this.id = IDnumber;
		this.description = desc;
		this.price = price;
	}

	public String toString() {
		return id + ": " + description + ".price: $" + price;
	}

	public void priceChange(double change) {
		price += change;
	}

	public static Generator<Product> generator = new Generator<Product>() {

		private Random rand = new Random(47);

		@Override
		public Product next() {

			return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000.0) + 0.99);
		}

	};

}

class Shelf extends ArrayList<Product> {

	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}

}

class Aisle extends ArrayList<Shelf> {
	public Aisle(int nSheleves, int nProducts) {
		for (int i = 0; i < nSheleves; i++) {
			add(new Shelf(nProducts));
		}
	}

}

class CheckoutStand {
}

class Office {
}

public class Store extends ArrayList<Aisle> {
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();

	public Store(int nAlisles, int nShelves, int nProducts) {
		for (int i = 0; i < nAlisles; i++)
			add(new Aisle(nShelves, nProducts));
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Aisle a : this)
			for (Shelf s : a)
				for (Product p : s) {
					result.append(p);
					result.append("\n");
				}
		return result.toString();
	}

	
	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
	}
	
	
}
