package dynamic.proxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @ClassName: DynamicProxy
 * @Description: 定义一个动态代理类，每个动态代理类都要实现InvocationHandler接口
 * @author lishuaibing
 * @date 2019年11月22日 上午9:29:28
 *
 */
public class DynamicProxy implements InvocationHandler {

	// 这个就是我们要代理的真实对象
	private Object subject;

	// 构造方法，为我们要代理的真实对象赋值
	public DynamicProxy(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 在代理真实对象前 我们可以添加一些自己的操作
		System.out.println("before rent house");
		//System.out.println("Method:" + method);
		// 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		method.invoke(subject, args);
		// 在代理真实对象后我们也可以添加一些自己的操作
		System.out.println("after rent house");

		return null;
	}

}
