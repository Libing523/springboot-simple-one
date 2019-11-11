package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * 
    * @ClassName: RandomWords
    * @Description: 9.6适配接口
    * 接口最吸引人的原因之一允许同一个接口具有多个不同的具体实现
    * @author lishuaibing
    * @date 2019年11月11日 下午2:03:50
    *
 */

public class RandomWords implements Readable{

	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;
	public RandomWords(int count) {
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb) throws IOException {
	
		if(count-- == 0) 
			return -1;
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i=0;i<4;i++) {
			cb.append(lowers[rand.nextInt(lowers.length)]);
			cb.append(vowels[rand.nextInt(vowels.length)]);
		}
		cb.append(" ");
		return 10;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(new RandomWords(10));
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}
/**执行结果：
 *  Ynobenogi
	Foozutoqe
	Gsegemuje
	Roisueeue
	Neueolome
	Hlieehoca
	Reeuebiki
	Naieobuwa
	Kjirokope
	Qyorujiai

 */
}
