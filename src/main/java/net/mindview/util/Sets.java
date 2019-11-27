package net.mindview.util;

import java.util.HashSet;
import java.util.Set;

/**
 * 
    * @ClassName: Sets
    * @Description: 15.4.6 一个Set使用工具
    * @author lishuaibing
    * @date 2019年11月27日 下午1:28:31
    *
 */
public class Sets {

	public static <T> Set<T> union(Set<T> a,Set<T> b){
		
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	
	public static <T> Set<T> intersection(Set<T> a,Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	
	public static <T> Set<T> difference(Set<T> superset,Set<T> subset){
		Set<T> result = new HashSet<T>(superset);
		result.removeAll(subset);
		return result;
	}
	
	public static <T> Set<T> complement(Set<T> a,Set<T> b){
		return difference(union(a, b),intersection(a, b));
	}
	
	
}
