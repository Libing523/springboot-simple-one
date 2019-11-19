package typeinfo;

/**
 * 
    * @ClassName: SimpleProxyDemo
    * @Description: 动态代理 ：是为了提供额外的或者不同的操作，而插入的用来替代“实际”对象的对象
    * 这些操作通常涉及与"实际"对象的通信，因此代理通常充当中间人的角色
    * @author lishuaibing
    * @date 2019年11月19日 下午1:48:28
    *
 */
interface Interface{
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface{

	@Override
	public void doSomething() {
		System.out.println("doSomething");
		
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("somethingElse:"+arg);
		
	}
	
}

class SimpleProxy implements Interface{

	private Interface proxied;
	public SimpleProxy (Interface proxied) {
		this.proxied = proxied;
	}
	@Override
	public void doSomething() {
	System.out.println("SimpleProxy doSomething...");
	proxied.doSomething();
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("SimpleProxy somethingElse:"+arg);
		proxied.somethingElse(arg);
	}
	
}


public class SimpleProxyDemo {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("lishuaibing");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}
