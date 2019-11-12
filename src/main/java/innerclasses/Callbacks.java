package innerclasses;

/**
 * 
 * @ClassName: Callbacks
 * @Description: 10.8.1 闭包与回调 Java 应该包含某种类似指针的机制，以允许回调(callback)，通过回调，对象能携带一些信息，
 *               这些信息允许它在稍后的某个时刻调用初始的对象
 * @author lishuaibing
 * @date 2019年11月12日 下午2:49:43
 *
 */
interface Incrementable {
	void increment();
}

class Callee1 implements Incrementable {
	private int i = 0;

	public void increment() {
		i++;
		System.out.println(i);
	}
}

class MyIncrement {
	public void increment() {
		System.out.println("Other operation");
	}

	static void f(MyIncrement mi) {
		mi.increment();
	}
}

class Callee2 extends MyIncrement {
	private int i = 0;

	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}

	private class Closure implements Incrementable {

		@Override
		public void increment() {
			Callee2.this.increment();

		}
	}

	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller {
	private Incrementable callbackReference;

	Caller(Incrementable cbh) {
		callbackReference = cbh;
	}

	void go() {
		callbackReference.increment();
	}
}

public class Callbacks {
	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();

	}
	/**执行结果：
	 * Other operation
		1
		1
		2
		Other operation
		2
		Other operation
		3
	
	 */
}
