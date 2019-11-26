package net.mindview.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * 
    * @ClassName: New
    * @Description: 15.4.1 杠杆利用类型参数推断
    * @author lishuaibing
    * @date 2019年11月26日 下午4:03:47
    *
 */
public class New {

	public static <K,V> Map<K,V> map(){
		return new HashMap<K,V>();
	}
	
	public static <T> List<T> list(){
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> lList(){
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> set(){
		return new HashSet<T>();
	}
	
	public static<T> Queue<T> queue(){
		return new LinkedList<T>();
	}
	
	public static void main(String[] args) {
		Map<String,List<String>> map = New.map();
		List<String> list = New.list();
		LinkedList<String> llist = New.lList();
		Set<String> set = New.set();
		Queue<String> queue = New.queue();
		
	}
	
	
	
}
