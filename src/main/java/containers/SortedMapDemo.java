package containers;

import java.util.Iterator;
import java.util.TreeMap;

import net.mindview.util.CountingMapData;

/**
 * 
    * @ClassName: SortedMapDemo
    * @Description: 17.8.2 SortMap
    *  TreeMap 是现阶段SortMap的唯一实现，可以确保键处于排序功能
    * @author lishuaibing
    * @date 2019年12月13日 上午10:25:02
    *
 */
public class SortedMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> sortedMap = new TreeMap<Integer,String>(new CountingMapData(10));
		System.out.println(sortedMap);
		Integer  low = sortedMap.firstKey();
		Integer high = sortedMap.lastKey();
		
		System.out.println(low);
		System.out.println(high);
		Iterator<Integer> it = sortedMap.keySet().iterator();
		for(int i=0;i<6;i++) {
			if(i==3)low = it.next();
			if(i==6)high = it.next();
			else it.next();
		}
		
		System.out.println(low);
		System.out.println(high);
		System.out.println(sortedMap.subMap(low, high));
		System.out.println(sortedMap.headMap(high));
		System.out.println(sortedMap.tailMap(low));
		
		
	}
	
}
