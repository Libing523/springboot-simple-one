package generics;

import java.util.ArrayList;

/**
 * 
    * @ClassName: ErasedTypeEquivalence
    * @Description: 15.7 擦除的神秘之处 可以声明ArrayList.class 不可以声明ArrayList<Integer>.class
    * @author lishuaibing
    * @date 2019年11月28日 上午10:50:20
    *
 */
public class ErasedTypeEquivalence {

	public static void main(String[] args) {
		Class arrayListInteger = new ArrayList<Integer>().getClass();
		Class arrayListString  = new ArrayList<String>().getClass();
		
		System.out.println(arrayListInteger == arrayListString);
	}
}
