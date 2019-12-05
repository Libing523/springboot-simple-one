package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 
    * @ClassName: Lists
    * @Description: 17.5 List的功能方法
    * @author lishuaibing
    * @date 2019年12月5日 上午10:56:22
    *
 */
public class Lists {

	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;
	
	public static void basicTest(List<String> a) {
		System.out.println(a.size());
		a.add("x");//add at end
		System.out.println(a.size());
		
	}
	
	
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>(Arrays.asList("A B C D E F G".split(" ")));
		basicTest(a);
	}
	
}
