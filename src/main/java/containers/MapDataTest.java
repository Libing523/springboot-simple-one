package containers;

import java.util.Iterator;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;
import net.mindview.util.MapData;
import net.mindview.util.Pair;

/**
 * 
    * @ClassName: MapDataTest
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author lishuaibing
    * @date 2019年12月4日 下午3:36:37
    *
 */

class Letters implements Generator<Pair<Integer,String>>,Iterable<Integer>{

	private int size = 9;
	private int number = 1;
	private char letter = 'A';
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				
				return number<size;
			}

			@Override
			public Integer next() {
				return number++;
			}
			
		};
	}

	@Override
	public Pair<Integer, String> next() {
	
		return new Pair<Integer,String>(number++,""+letter++);
	}
	
}




public class MapDataTest {

	public static void main(String[] args) {
	
		System.out.println(MapData.map(new Letters(), 11));
	    System.out.println(MapData.map(new Letters(), "PoP"));
	}

}
