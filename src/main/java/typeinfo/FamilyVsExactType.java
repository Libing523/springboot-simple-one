package typeinfo;

/**
 * 
    * @ClassName: FamilyVsExactType
    * @Description: instanceof 与Class等价性
    * @author lishuaibing
    * @date 2019年11月18日 下午4:40:32
    *
 */
class Base{}
class Derived extends Base{}
public class FamilyVsExactType {

	static void test(Object x) {
		System.out.println("Testing x of type "+x.getClass());
		System.out.println("x instanceof Base "+(x instanceof Base));
		System.out.println("x instanceof Derived "+(x instanceof Derived));
		System.out.println("Base.isInstance(x) "+Base.class.isInstance(x));
		
	}
	
}
