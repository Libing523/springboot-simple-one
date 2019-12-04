package net.mindview.util;

/**
 * 
    * @ClassName: Pair
    * @Description: 17.2.2 Map生成器
    * @author lishuaibing
    * @date 2019年12月4日 下午2:23:28
    *
 */
public class Pair<K,V> {

	public final K key;
	public final V value;
	
	public Pair(K k,V v) {
		key = k;
		value = v;
	}
}
