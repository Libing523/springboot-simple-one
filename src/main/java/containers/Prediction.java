package containers;

import java.util.Random;

/**
 * 
    * @ClassName: Prediction 天气预报
    * @Description: 17.9 散列与散列码
    * @author lishuaibing
    * @date 2019年12月13日 下午4:12:44
    *
 */
public class Prediction {

	private static Random rand = new Random(47);
	private boolean shadow = rand.nextDouble() > 0.5;
	
	public String toString() {
		if(shadow)
			return "Six more weeks of Winter!";
		else
			return "Early Spring!";
	}
	
	
	
	
	
}
