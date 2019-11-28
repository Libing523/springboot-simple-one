package arrays;

import java.util.Arrays;

/**
 * 
 * @ClassName: ArrayOptions
 * @Description: 16.2 数组是第一级对象 对象数组和基本数组的区别是：对象数组保存的是引用，基本类型数组保存的是基本类型的值。
 * @author lishuaibing
 * @date 2019年11月28日 下午2:44:02
 *
 */
public class ArrayOptions {

	public static void main(String[] args) {

		BerylliumSphere[] a;
		BerylliumSphere[] b = new BerylliumSphere[5];
		System.out.println("b:" + Arrays.toString(b));
		BerylliumSphere[] c = new BerylliumSphere[4];
		for (int i = 0; i < c.length; i++)
			if (c[i] == null)
				c[i] = new BerylliumSphere();
		BerylliumSphere[] d = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() };
		a = new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere() };
		System.out.println("a.length:" + a.length);
		System.out.println("b.length:" + b.length);
		System.out.println("c.length:" + c.length);
		System.out.println("d.length:" + d.length);
		a = d;
		System.out.println("a.length:" + a.length);

		int[] e;
		int[] f = new int[5];
		System.out.println(Arrays.toString(f));
		int[] g = new int[4];
		for (int i = 0; i < g.length; i++)
			g[i] = i * i;
		int[] h = { 11, 47, 93 };
		System.out.println("f.length:" + f.length);
		System.out.println("g.length:" + g.length);
		System.out.println("h.length:" + h.length);
		e = h;
		System.out.println("e.length:" + e.length);
		e = new int[] { 1, 2 };
		System.out.println("e.length:" + e.length);

	}
	/**执行结果：
	 *  b:[null, null, null, null, null]
		a.length:2
		b.length:5
		c.length:4
		d.length:3
		a.length:3
		[0, 0, 0, 0, 0]
		f.length:5
		g.length:4
		h.length:3
		e.length:3
		e.length:2
	 */
}
