package generics;

/**
 * 
    * @ClassName: GenericMethods
    * @Description: 15.4泛型方法
    * @author lishuaibing
    * @date 2019年11月26日 下午3:59:07
    *
 */
public class GenericMethods {

	public <T> void f(T x) {
		System.out.println("simpleName:"+x.getClass().getSimpleName()+",Name:"+x.getClass().getName());
	}
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0f);
		gm.f('c');
		gm.f(gm);

	}

}
