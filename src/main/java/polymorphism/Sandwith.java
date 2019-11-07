package polymorphism;

/**
 * 8.3构造器和多态 展示组合，继承以及多态在构造顺序上的作用
 * 
 * @author Bj
 *
 */

class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	public PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

public class Sandwith extends PortableLunch {

	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public Sandwith() {
		System.out.println("Sandwith()");
	}

	public static void main(String[] args) {
		new Sandwith();
	}

	/**
	         执行结果：
	    Meal()
		Lunch()
		PortableLunch()
		Bread()
		Cheese()
		Lettuce()
		Sandwith()

	 */
}
