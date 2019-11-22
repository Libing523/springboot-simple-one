package dynamic.proxy.simple;

/**
 * 
 * @ClassName: RealSubject
 * @Description: 定义一个类实现接口，这个类就是真实的类
 * @author lishuaibing
 * @date 2019年11月22日 上午9:23:43
 *
 */
public class RealSubject implements Subject {

	@Override
	public void rent() {
		System.out.println("I want to rent my house");
	}

	@Override
	public void hello(String str) {
		System.out.println("hello: " + str);
	}

}
