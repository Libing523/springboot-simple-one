package interfaces;

import java.util.Random;

/**
 * 
    * @ClassName: RndomDoubles
    * @Description: 随机浮点数
    * @author lishuaibing
    * @date 2019年11月11日 下午2:36:28
    *
 */
public class RandomDouble {
 private static Random rand = new Random(57);
 public double next() {return rand.nextDouble();}
 public static void main(String[] args) {
	RandomDouble rd = new RandomDouble();
	for(int i=0;i<7;i++) {
		System.out.println(rd.next()+"");
	}
}
	
}
