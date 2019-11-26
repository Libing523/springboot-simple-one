package generics;

import java.util.List;
import java.util.Map;

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

/**
 * 
    * @ClassName: SimplePets
    * @Description: 15.4.1 例：避免重复的泛型参数列表
    * 
    * @author lishuaibing
    * @date 2019年11月26日 下午4:25:22
    *
 */
public class SimplePets {

	public static void main(String[] args) {
		// public static <K,V> Map<K,V> map(){}
		Map<Person,List<? extends Pet>> petPerson = New.map();

	}

}
