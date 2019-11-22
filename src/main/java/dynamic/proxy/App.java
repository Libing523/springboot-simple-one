package dynamic.proxy;

import java.lang.reflect.Proxy;

/**
 * 
    * @ClassName: App
    * @Description: 动态代理实例
    * @author lishuaibing
    * @date 2019年11月22日 上午9:00:34
    *
 */
public class App {

	public static void main(String[] args) {
		IVehical car = new Car();
		IVehical vehical = (IVehical) Proxy.newProxyInstance(
				car.getClass().getClassLoader(), 
				Car.class.getInterfaces(),
				new VehicalInvacationHandler(car));
		vehical.run();
		System.out.println(vehical.getClass());
	}
}