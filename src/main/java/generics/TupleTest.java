package generics;

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

/**
 * 
    * @ClassName: TupleTest
    * @Description: 原组测试类
    * @author lishuaibing
    * @date 2019年11月26日 上午9:53:12
    *
 */

class Amphibian{}
class Vehicle{}


public class TupleTest {

	static TwoTuple<String, Integer> f(){
		return new TwoTuple<String, Integer>("hi", 29);
	}
	
	static ThreeTuple<Amphibian, String, Integer> g(){
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 29);
	}
	
	static FourTuple<Vehicle, Amphibian, String, Integer> h(){
		return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "hi", 29);
	}
	
	static FiveTuple<Vehicle, Amphibian, String, Integer,Double> k(){
		return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(), "hi", 29, 11.1);
		
	}
	public static void main(String[] args) {
		TwoTuple<String, Integer> two = f();
		
		System.out.println(f());
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
	}
	
	
	
	
	
	
	
	
	
	
}
