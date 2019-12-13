package containers;

import java.util.LinkedHashMap;

import net.mindview.util.CountingMapData;

/**
 * 
    * @ClassName: LinkedHashMapDemo
    * @Description: 17.8.3 LinkedHashMap
    * 	1、散列化所有的元素，但是遍历键值对时，却又以元素的插入顺序返回键值对
    *   2、可以在构造器中设定LinkedHashMap，使之采用基于访问的最近最少使用（LRU）算法，
    *     没有被访问过的(可被看成是需删除的)元素就会出现在队列的前边
    * @author lishuaibing
    * @date 2019年12月13日 下午3:23:56
    *ss
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>(new CountingMapData(9));
		System.out.println(linkedMap);
		linkedMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);//LRU算法版本
		linkedMap.putAll(new CountingMapData(9));
		System.out.println(linkedMap);
		
		for(int i=0;i<6;i++) {
			linkedMap.get(i);
			//在访问过这前边6个元素后，最后三个元素移到了队列的最前边
		}
		System.out.println(linkedMap);
		linkedMap.get(0);
		//当再一次访问第一个元素后，该访问元素会移动到队列最后
		System.out.println(linkedMap);
	}
	
	/**执行结果：
	 *  {0=A0, 1=B0, 2=C0, 3=D0, 4=E0, 5=F0, 6=G0, 7=H0, 8=I0}
		{0=A0, 1=B0, 2=C0, 3=D0, 4=E0, 5=F0, 6=G0, 7=H0, 8=I0}
		{6=G0, 7=H0, 8=I0, 0=A0, 1=B0, 2=C0, 3=D0, 4=E0, 5=F0}
		{6=G0, 7=H0, 8=I0, 1=B0, 2=C0, 3=D0, 4=E0, 5=F0, 0=A0}
	 */
}
