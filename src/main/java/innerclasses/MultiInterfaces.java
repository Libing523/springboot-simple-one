package innerclasses;

/**
 * 
 * @ClassName: MultiInterfaces
 * @Description: 10.8 必须在一个类中以某种方式实现两个接口
 * @author lishuaibing
 * @date 2019年11月12日 下午2:34:44
 *
 */
interface A {
}

interface B {
}

class X implements A, B {

}

class Y implements A {
	B makeB() {
		return new B() {
		};
	}
}

public class MultiInterfaces {
	static void takesA(A a) {
	}

	static void takesB(B b) {
	}

	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}

}
