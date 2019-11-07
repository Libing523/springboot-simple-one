package polymorphism;

/**
 * 
    * @ClassName: Shared
    * @Description: 8.3.2(2)成员对象存在于其他一个或多个对象共享的时候，使用引用计数来跟踪仍旧访问着共享对象的数量
    * @author lishuaibing
    * @date 2019年11月7日 下午2:55:51
    *
 */
class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		System.out.println("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing " + this);
		}
	}

	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}

	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCounting {

	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared), };
		for (Composing c : composing) {
			c.dispose();
		}
	}
	/**执行结果：
	 *  Creating Shared 0
		Creating Composing 0
		Creating Composing 1
		Creating Composing 2
		Creating Composing 3
		Creating Composing 4
		disposing Composing 0
		disposing Composing 1
		disposing Composing 2
		disposing Composing 3
		disposing Composing 4
		Disposing Shared 0
	 */
}
