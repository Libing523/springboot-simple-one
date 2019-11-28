package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @ClassName: ContainerComparison
 * @Description: 第16章 数组 数组与泛型容器进行比较 数组和容器的区别在于：效率，类型，和保存基本类型的能力
 * 
 * @author lishuaibing
 * @date 2019年11月28日 下午2:02:03
 *
 */
class BerylliumSphere {
	private static long count = 0;
	private final long id = count++;

	public String toString() {
		return " Sphere " + id;
	}
}

public class ContainerComparison {
	public static void main(String[] args) {

		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for(int i=0;i<5;i++)
			spheres[i] = new BerylliumSphere();
		System.out.println(Arrays.toString(spheres));
		System.out.println(spheres[4]);
		
		List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
		for(int i=0;i<5;i++)
			sphereList.add(new BerylliumSphere());
		System.out.println(sphereList);
		System.out.println(sphereList.get(4));
		
		
		int[] integers = {0,1,2,3,4,5};
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		intList.add(97);
		System.out.println(intList);
		System.out.println(intList.get(4));
		
	}
	/**测试结果：
	 * [ Sphere 0,  Sphere 1,  Sphere 2,  Sphere 3,  Sphere 4, null, null, null, null, null]
		 Sphere 4
		[ Sphere 5,  Sphere 6,  Sphere 7,  Sphere 8,  Sphere 9]
		 Sphere 9
		[0, 1, 2, 3, 4, 5]
		4
		[0, 1, 2, 3, 4, 5, 97]
		4

	 */

}
