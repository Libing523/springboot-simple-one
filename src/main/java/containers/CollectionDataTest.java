package containers;

import java.util.LinkedHashSet;
import java.util.Set;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;

/**
 * 
    * @ClassName: CollectionDataTest
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author lishuaibing
    * @date 2019年12月4日 下午1:34:25
    *
 */

class Government implements Generator<String>{

	String[] foundation = ("strange women lying in ponds distributing swords is no "
			            + "basis for a system of government").split(" ");
	private int index;
	
	@Override
	public String next() {
		return foundation[index++];
	}
	
}

public class CollectionDataTest {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 15));
		System.out.println(set);
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
		
		
	}
	
	
	
	
}
