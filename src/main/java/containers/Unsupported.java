package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @ClassName: Unsupported
 * @Description: 17.4.1 未获支持的操作
 * @author lishuaibing
 * @date 2019年12月5日 上午9:42:04
 *
 */

public class Unsupported {

	static void test(String msg, List<String> list) {
		System.out.println("------" + msg + "--------");
		Collection<String> c = list;
		Collection<String> subList = list.subList(0, 8);
		Collection<String> c2 = new ArrayList<String>(subList);
		try {
			c.retainAll(c2);
		} catch (Exception e) {
			System.out.println("retainAll(): "+e);
		}
		
		try {
			c.removeAll(c2);
		} catch (Exception e) {
			System.out.println("removeAll(): "+e);
		}
		
		try {
			c.clear();
		} catch (Exception e) {
			System.out.println("clear(): "+e);
		}
		
		try {
			c.add("X");
		} catch (Exception e) {
			System.out.println("add(): "+e);
		}
		
		try {
			c.addAll(c2);
		} catch (Exception e) {
			System.out.println("addAll(): "+e);
		}
		
		try {
			c.remove("C");
		} catch (Exception e) {
			System.out.println("remove(): "+e);
		}
		
		try {
			list.set(0, "X");
		} catch (Exception e) {
			System.out.println("set(): "+e);
		}
		

	}

	
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
		test("Modifiable", new ArrayList<String>(list));
		test("Arrays.asList()",list);
		test("unmodifiableList()",Collections.unmodifiableList(new ArrayList<String>(list)));
	}
	
	/**执行结果：
	 *  ------Modifiable--------
		------Arrays.asList()--------
		retainAll(): java.lang.UnsupportedOperationException
		removeAll(): java.lang.UnsupportedOperationException
		clear(): java.lang.UnsupportedOperationException
		add(): java.lang.UnsupportedOperationException
		addAll(): java.lang.UnsupportedOperationException
		remove(): java.lang.UnsupportedOperationException
		------unmodifiableList()--------
		retainAll(): java.lang.UnsupportedOperationException
		removeAll(): java.lang.UnsupportedOperationException
		clear(): java.lang.UnsupportedOperationException
		add(): java.lang.UnsupportedOperationException
		addAll(): java.lang.UnsupportedOperationException
		remove(): java.lang.UnsupportedOperationException
		set(): java.lang.UnsupportedOperationException
	 */
	
}
