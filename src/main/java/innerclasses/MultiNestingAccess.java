package innerclasses;

/**
 * 
 * @ClassName: MultiNestingAccess
 * @Description: 10.2.7 从多层嵌套类中访问外部类成员 
 *     ----他能透明的访问他所嵌入的外围类的所有成员
 * @author lishuaibing
 * @date 2019年11月12日 下午2:07:51
 *
 */
class MNA {
	private void f() {
	}

	class A {
		private void g() {
		}

		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}

public class MultiNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}

}
