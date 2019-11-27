package generics;

import java.util.List;
import java.util.Map;

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

/**
 * 
    * @ClassName: ExplicitTypeSpecification
    * @Description: 15.4.1 显式的类型说明
    * @author lishuaibing
    * @date 2019年11月27日 上午9:10:48
    *
 */
public class ExplicitTypeSpecification {

	static void f(Map<Person,List<Pet>> petPeople) {}
	public static void main(String[] args) {
		f(New.<Person,List<Pet>>map());
	}
}
