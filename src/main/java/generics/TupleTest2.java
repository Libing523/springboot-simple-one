package generics;

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.Tuple;
import net.mindview.util.TwoTuple;

/**
 * 
    * @ClassName: TupleTest2
    * @Description: 15.4.5 简化原组的使用实例
    * @author lishuaibing
    * @date 2019年11月27日 上午10:31:16
    *
 */
public class TupleTest2 {

	static TwoTuple<String, Integer> f(){
		return Tuple.tuple("hi",47);
	}
	
	static TwoTuple f2() {
		return Tuple.tuple("hi", 47);
	}
	
	static ThreeTuple<Amphibian, String, Integer> g(){
		return Tuple.tuple(new Amphibian(), "hi", 47);
	}
	
	static FourTuple<Vehicle, Amphibian, String, Integer> h(){
		return Tuple.tuple(new Vehicle(), new Amphibian(), "hi", 47);
	}
	
	static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k(){
		return Tuple.tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
	}
	
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(f2());
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
	}
}
