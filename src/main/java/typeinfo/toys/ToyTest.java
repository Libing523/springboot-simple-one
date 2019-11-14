package typeinfo.toys;

/**
 * 
 * @ClassName: ToyTest
 * @Description: 14.2 Class类型信息——Class 方法
 * @author lishuaibing
 * @date 2019年11月14日 上午10:26:16
 *
 */
interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	Toy() {
		System.out.println("Toy 无参构造...");
	}

	Toy(int i) {
		System.out.println("Toy 有参构造..."+i);
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	public FancyToy() {
		super(1);
	}
}

public class ToyTest {

	static void printInfo(Class<?> cc) {
		System.out.println("Class name:" + cc.getName() + " is interface?【" + cc.isInterface() + "】");
		System.out.println("Simple name:" + cc.getSimpleName());
		System.out.println("Canonical name:" + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("typeinfo.toys.FancyToy");

		} catch (Exception e) {
			System.out.println("cannot find FancyToy");
			System.exit(1);
		}

		printInfo(c);
		for (Class<?> face : c.getInterfaces()) {
			printInfo(face);
		}
		Class<?> up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());

	}
	/**执行结果：
	 *  Class name:typeinfo.toys.FancyToy is interface?【false】
		Simple name:FancyToy
		Canonical name:typeinfo.toys.FancyToy
		Class name:typeinfo.toys.HasBatteries is interface?【true】
		Simple name:HasBatteries
		Canonical name:typeinfo.toys.HasBatteries
		Class name:typeinfo.toys.Waterproof is interface?【true】
		Simple name:Waterproof
		Canonical name:typeinfo.toys.Waterproof
		Class name:typeinfo.toys.Shoots is interface?【true】
		Simple name:Shoots
		Canonical name:typeinfo.toys.Shoots
		Toy 无参构造...
		Class name:typeinfo.toys.Toy is interface?【false】
		Simple name:Toy
		Canonical name:typeinfo.toys.Toy
	 */
}
