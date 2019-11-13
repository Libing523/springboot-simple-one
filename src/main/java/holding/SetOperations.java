package holding;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 
    * @ClassName: SetOperations
    * @Description: Set 用法
    * @author lishuaibing
    * @date 2019年11月13日 上午11:01:59
    *
 */
public class SetOperations {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
		System.out.println(set1);
		set1.add("M");
		System.out.println(set1);
		System.out.println("H: "+set1.contains("H"));
		System.out.println("N: "+set1.contains("N"));
		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set2, "H I J K L".split(" "));
		System.out.println("set2 in set1 : "+set1.containsAll(set2));
		set1.remove("H");
		System.out.println("set2 in set1 : "+set1.containsAll(set2));
		
	}
}
