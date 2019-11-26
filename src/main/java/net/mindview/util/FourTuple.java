package net.mindview.util;

/**
 * 
    * @ClassName: FourTuple
    * @Description: 四个参数的原组对象
    * @author lishuaibing
    * @date 2019年11月26日 上午9:47:20
    *
    * @param <A>
    * @param <B>
    * @param <C>
    * @param <D>
 */
public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {

	public final D fourth;
	public FourTuple(A a, B b, C c,D d) {
		super(a, b, c);
		fourth = d;
	}
	public String toString () {
		return "("+first+", "+second+", "+third+", "+fourth+")";
	}

}
