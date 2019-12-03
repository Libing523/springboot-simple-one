package arrays;

import java.util.Arrays;

/**
 * 
    * @ClassName: CopyingArrays
    * @Description: 16.7.1 复制数组
    *    System.arraycopy() 不会执行自动包装和自动拆包，两个数组必须有相同的确切类型。
    *                    源数组        从原数组中什么位置开始复制的偏移量       目标数组      从目标数组什么位置开始复制的偏移量            需要复制的元素个数
    * System.arraycopy(   src,             srcPos,            dest,            destPos,             length);
    * @author lishuaibing
    * @date 2019年12月3日 下午1:32:32
    *
 */
public class CopyingArrays {

	public static void main(String[] args) {
		
		int[] i = new int[7];
		int[] j = new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 99);
		System.out.println("i = "+Arrays.toString(i));
		System.out.println("j = "+Arrays.toString(j));
		
		System.arraycopy(i, 0, j, 0, i.length);
		System.out.println("j = "+Arrays.toString(j));
		
		int[] k = new int[15];
		Arrays.fill(k, 103);
		System.out.println("k = "+Arrays.toString(k));
		
		System.arraycopy(i, 0, k, 0, i.length);
		System.out.println("k = "+Arrays.toString(k));
	}
	
}
