package holding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: SetOfInteger
 * @Description: Set 不保存重复元素
 * @author lishuaibing
 * @date 2019年11月13日 上午10:48:54
 *
 */
public class SetOfInteger {

	public static void main(String[] args) {
		Random random = new Random(47);
		Set<Integer> intSet = new HashSet<Integer>();
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			int r = random.nextInt(30);
			intSet.add(r);
			intList.add(r);
		}
		System.out.println(intSet);
		System.out.println(intList);
	}
}
