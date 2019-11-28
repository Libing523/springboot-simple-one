package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: LostInformation
 * @Description: ArrayList<String>.class 与ArrayList<Integer>.class之间的例题补充
 * @author lishuaibing
 * @date 2019年11月28日 下午1:19:40
 *
 */
class Frob {
}

class Fnorkle {
}

class Quark<Q> {
}

class Particle<POSTTION, MOMENTUM> {
}

public class LostInformation {
	public static void main(String[] args) {
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob,Fnorkle> map = new HashMap<Frob,Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long,Double> p = new Particle<Long,Double>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
		
	}

}
