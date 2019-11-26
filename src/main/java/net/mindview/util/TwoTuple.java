package net.mindview.util;

/**
 * 
 * @ClassName: TwoTuple
 * @Description: 一个原组类库
 * @author lishuaibing
 * @date 2019年11月26日 上午9:32:23
 *
 */
public class TwoTuple<A, B> {

	public final A first;
	public final B second;

	public TwoTuple(A a, B b) {
		first = a;
		second = b;
	}

	public String toString() {
		return "("+first+", "+second+")";
	}
}
