package typeinfo;

/**
 * 
 * @ClassName: SweetShop
 * @Description: 14.2 class对象 一旦某个类的Class对象被载入内存，它就被用来创建这个类的所有对象
 * @author lishuaibing
 * @date 2019年11月14日 上午9:49:17
 *
 */

class Candy {
	static {
		System.out.println("Load Candy...");
	}
}

class Gum {
	static {
		System.out.println("Load Gum...");
	}
}

class Cookie {
	static {
		System.out.println("Load Cookie...");
	}
}

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("Gum");
		} catch (Exception e) {
			System.out.println("cannot find Gum...");
		}

		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
	}
	/**执行结果：
	 *  inside main
		Load Candy...
		After creating Candy
		cannot find Gum...
		After Class.forName("Gum")
		Load Cookie...
		After creating Cookie
	 */
}
