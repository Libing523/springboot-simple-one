package dynamic.proxy;

/**
 * 
    * @ClassName: Car
    * @Description: 要扩展的类
    * @author lishuaibing
    * @date 2019年11月20日 上午10:29:53
    *
 */
public class Car implements IVehical {

	@Override
	public void run() {
		System.out.println("Car run...");

	}

}
