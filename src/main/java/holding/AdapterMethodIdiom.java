package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


/**
 * 
    * @ClassName: AdapterMethodIdiom
    * @Description: 11.13.1 适配器方法惯用法
    * @author lishuaibing
    * @date 2019年11月13日 下午4:03:34
    *
 */

class ReversibleArrayList<T> extends ArrayList<T>{
	    
	private static final long serialVersionUID = 1L;
	public ReversibleArrayList(Collection<T> c) {super(c);}
	public Iterable<T> reversed(){
		return new Iterable<T>() {
			public Iterator<T> iterator(){
				return new Iterator<T>() {
					int current = size()-1;
					public boolean hasNext() {return current>-1;}
					public T next() {return get(current--);}
					public void remove() {}
				};
			}
		};
	}
}


public class AdapterMethodIdiom {

	public static void main(String[] args) {
		ReversibleArrayList<String> ral = 
				new ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
		for(String s : ral) {
			System.out.print(s+" ");
		}
		System.out.println();
		for(String s : ral.reversed())
			System.out.print(s+" ");
	}
	
}
