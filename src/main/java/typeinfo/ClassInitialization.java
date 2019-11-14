package typeinfo;

import java.util.Random;

/**
 * 
 * @ClassName: ClassInitialization
 * @Description: 14.2.1 初始化被延迟到了对静态方法(构造器隐式地是静态的)或者非常数静态域进行首次引用时才执行
 *  初始化有效地实现了尽可能的“惰性”。仅使用.class语法来获得对类的引用不会发生初始化，Class.forName()会立即进行初始化
 *  
 * @author lishuaibing
 * @date 2019年11月14日 下午1:16:44
 *
 */
class Initable {
	//如果static final 值是“编译期常量”，像Initable.staticFinal,那么这个值不需要对Initable类进行初始化就可以读取。
	static final int staticFinal = 47;
	//如果只是将一个域设置为static和final的，还不足以确保这种行为，如Initable.staticFinal2的访问将强制进行类的初始化
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable...");
	}
}

class Initable2 {
	//如果一个static 域不是final的，那么在对他进行访问时，总是要对他进行访问前，要先进行链接(为这个域分配存储空间)
	//和初始化(初始化该存储空间)
	static int staticNonFinal = 147;
	static {
		System.out.println("Initializing Intiable2...");
	}
}

class Initable3 {
	static int staticNonFinal = 74;
	static {
		System.out.println("Initializing Initable3...");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception {

		Class<Initable> initable = Initable.class;
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticNonFinal);
		Class initable3 = Class.forName("typeinfo.ClassInitialization.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}

}
