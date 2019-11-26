package net.mindview.util;

/**
 * 
    * @ClassName: ThreeTuple
    * @Description: 包含三个参数的原组对象
    * @author lishuaibing
    * @date 2019年11月26日 上午9:38:12
    *
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A, B> {

	public final C third;
	public ThreeTuple(A a, B b,C c) {
		super(a, b);
		third = c;
	}
	
	public String toString () {
		return "("+first+", "+second+", "+third+")";
	}

}
