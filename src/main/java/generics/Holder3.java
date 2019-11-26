package generics;

/*
 * 
    * @ClassName: Holder3
    * @Description: 泛型3 暂时不指定类型
    * @author lishuaibing
    * @date 2019年11月26日 上午9:21:57
    *
 */
public class Holder3<T> {

	private T a;
	public Holder3(T a) {this.a = a;}
	public void set(T a) {this.a = a;}
	public T get() {return a;}
	
	public static void main(String[] args) {
		Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
		Automobile a = h3.get();
		System.out.println(a);
	}
	
	
}
