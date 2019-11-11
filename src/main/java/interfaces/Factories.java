package interfaces;

/**
 * 
 * @ClassName: Factories
 * @Description: 9.9 接口和工厂 接口是实现多重继承的途径，而生成遵循某个接口的对象的典型方法就是工厂方法设计模式
 * @author lishuaibing
 * @date 2019年11月11日 下午3:33:45
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

	public Implementation1() {

	}

	@Override
	public void method1() {
		System.out.println("Implementation1 method1");

	}

	@Override
	public void method2() {
		System.out.println("Implementation1 method2");

	}

}

class Implementation1Factory implements ServiceFactory {

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation1();
	}

}

class Implementation2 implements Service {

	public Implementation2() {

	}

	@Override
	public void method1() {
		System.out.println("Implementation2 method1");

	}

	@Override
	public void method2() {
		System.out.println("Implementation2 method2");

	}

}

class Implementation2Factory implements ServiceFactory {

	@Override
	public Service getService() {
		return new Implementation2();
	}

}

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
	}
}
