package net.mindview.util;

/**
 * 
    * @ClassName: FiveTuple
    * @Description: 五个参数的原组对象
    * @author lishuaibing
    * @date 2019年11月26日 上午9:51:45
    *
    * @param <A>
    * @param <B>
    * @param <C>
    * @param <D>
    * @param <E>
 */
public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {

	public final E fifth;
	public FiveTuple(A a, B b, C c, D d,E e) {
		super(a, b, c, d);
		fifth = e;
	}
	public String toString () {
		return "("+first+", "+second+", "+third+", "+fourth+", "+fifth+")";
	}
}
