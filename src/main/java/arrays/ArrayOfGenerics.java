package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
    * @ClassName: ArrayOfGenerics
    * @Description: 创建非泛型的数组
    * @author lishuaibing
    * @date 2019年11月29日 上午9:39:44
    *
 */
public class ArrayOfGenerics {

	public static void main(String[] args) {
		
		List<String>[] ls;
		List[] la = new List[10];
		
		ls = la;
		ls[0] = new ArrayList<String>();
		
		
		Object[] objects = ls;
		objects[1] = new ArrayList<Integer>();
		
		List<BerylliumSphere>[] spheres = new List[10];
		for(int i=0;i<spheres.length;i++)
			spheres[i] = new ArrayList<BerylliumSphere>();
		
	}
	
	
	
	
	
	
	
}
