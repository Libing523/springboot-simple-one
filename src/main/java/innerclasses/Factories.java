package innerclasses;


/**
 * 
 * @ClassName: Factories
 * @Description: 10.6.1 使用内部类再访工厂方法
 * @author lishuaibing
 * @date 2019年11月12日 上午10:27:19
 *
 */
interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	private Implementation1() {

	}

	@Override
	public void method1() {
		System.out.println("Implementation1.method1");

	}

	@Override
	public void method2() {
		System.out.println("Implementation1.method2");

	}

	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {
			return new Implementation1();
		}
	};

}

class Implementation2 implements Service {
	private Implementation2() {

	}

	@Override
	public void method1() {
		System.out.println("Implementation2.method1");

	}

	@Override
	public void method2() {
		System.out.println("Implementation2.method2");

	}

	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {
			return new Implementation2();
		}
	};

}

public class Factories {

	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory);
		serviceConsumer(Implementation2.factory);
	}
	/**执行结果：
	 *  Implementation1.method1
		Implementation1.method2
		Implementation2.method1
		Implementation2.method2
	 */
}
