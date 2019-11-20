package typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.*;
import java.lang.reflect.Proxy;

/**
 * 
 * @ClassName: SimpleDynamicProxy
 * @Description: Java动态代理机制
 * @author lishuaibing
 * @date 2019年11月19日 下午3:54:17
 *
 */
class DynamicProxyHandler implements InvocationHandler {

	private Object proxied;

	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("****proxy: " + proxy.getClass() + ",method: " + method + ",args: " + args);
		if (args != null)
			for (Object arg : args)
				System.out.println(" " + arg);
		return method.invoke(proxied, args);
	}
}




public class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("lishuaibing");
	}
	
	public static void main(String[] args) {
		RealObject real = new RealObject();
		Interface proxy = (Interface) Proxy.newProxyInstance(
				Interface.class.getClassLoader(), 
				new Class[] {Interface.class},
				new DynamicProxyHandler(real));
		consumer(proxy);
		
	}

}
