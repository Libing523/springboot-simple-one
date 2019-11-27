package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
    * @ClassName: GenericVarargs
    * @Description: 15.4.2 可变参数与泛型方法
    * @author lishuaibing
    * @date 2019年11月27日 上午9:18:45
    *
 */
public class GenericVarargs {

	//makeList 方法展示了与标准类库中java.util.Arrays.asList()方法相同的功能
	public static <T> List<T> makeList(T...args){
		
		List<T> result = new ArrayList<T>();
		for(T item : args)
			result.add(item);
		return result;
	}
	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("A","B","C");
		System.out.println(ls);
		ls = makeList("ABCDEFJKLMNOPQRSTUVWXYZ".split(""));
		System.out.println(ls);
	}
}
