package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 
 * @ClassName: Statistics
 * @Description: 11.10 Map 键入出现重复值得次数
 * @author lishuaibing
 * @date 2019年11月13日 下午1:12:52
 *
 */
public class Statistics {

	public static void main(String[] args) {
		Random random = new Random(47);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10; i++) {
			int r = random.nextInt(30);
			Integer freq = map.get(r);
			map.put(r, freq == null ? 1 : freq + 1);
		}
		System.out.println(map);
	}
}
