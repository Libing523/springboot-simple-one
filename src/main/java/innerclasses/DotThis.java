package innerclasses;

/**
 * 
 * @ClassName: DotThis
 * @Description: 10.3 使用.this 与.new
 * @author lishuaibing
 * @date 2019年11月12日 上午9:38:05
 *
 */
public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}

	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
	/**执行结果：
	 * DotThis.f()
	 */
}
