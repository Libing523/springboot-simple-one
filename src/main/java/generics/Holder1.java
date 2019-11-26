package generics;
/**
 * 
 * @ClassName: Holder1
 * @Description: 泛型实例
 * @author lishuaibing
 * @date 2019年11月25日 下午4:44:49
 *
 */
class Automobile {
}

public class Holder1 {

	private Automobile a;

	public Holder1(Automobile a) {
		this.a = a;
	}

	Automobile get() {
		return a;
	}
}
