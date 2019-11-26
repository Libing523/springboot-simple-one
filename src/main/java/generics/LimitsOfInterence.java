package generics;

import java.util.List;
import java.util.Map;

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

/**
 * 
 * @ClassName: LimitsOfInterence
 * @Description: 如果你将泛型方法调用的结果(如：New.map())作为参数，传递给另一个方法，这是编辑器并不会 执行类型推断
 * @author lishuaibing
 * @date 2019年11月26日 下午4:30:52
 *
 */
public class LimitsOfInterence {
	static void f(Map<Person, List<? extends Pet>> petPerson) {
	}

	public static void main(String[] args) {
		//f(New.map());//Does not compile
	}
}
