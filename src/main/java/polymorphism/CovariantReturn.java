package polymorphism;

/**
 * 
    * @ClassName: Grain
    * @Description: 8.4 协变返回类型
    * @author lishuaibing
    * @date 2019年11月7日 下午4:29:06
    *
 */
class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {

	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
	/** 测试结果：
	 *  Grain
		Wheat
	 */
}
