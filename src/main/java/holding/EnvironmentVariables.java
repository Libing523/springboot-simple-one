package holding;

import java.util.Map.Entry;

/**
 * 
    * @ClassName: EnvironmentVariables
    * @Description: 显示操作系统变量
    * @author lishuaibing
    * @date 2019年11月13日 下午3:36:45
    *
 */
public class EnvironmentVariables {

	public static void main(String[] args) {
		for(Entry entity : System.getenv().entrySet()) {
			System.out.println(entity.getKey()+":"+entity.getValue());
		}
	}
}
