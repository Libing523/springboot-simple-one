package containers;

import java.util.PriorityQueue;

/**
 * 
    * @ClassName: ToDoList
    * @Description: 17.7.1 优先级队列
    *              可以看到各个项的排序是如何使用优先级队列而得到自动发生的
    * @author lishuaibing
    * @date 2019年12月6日 上午8:51:50
    *
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {

	
	    
	private static final long serialVersionUID = 1L;

	static class ToDoItem implements Comparable<ToDoItem>{
		
		private char primary;
		private int  secondary;
		private String item;
		
		public ToDoItem(String td,char pri,int sec) {
			primary = pri;
			secondary = sec;
			item = td;
		}
		
		
		public int compareTo(ToDoItem arg) {
			//System.out.println("primary:"+primary+",secondary:"+secondary+",item:"+item);
			//System.out.println("ToDoItem.primary:"+arg.primary+",ToDoItem.secondary:"+arg.secondary+",ToDoItem.item:"+arg.item);
			if(primary > arg.primary)
				return +1;
			if(primary == arg.primary)
				if(secondary >arg.secondary)
					return +1;
				else if(secondary == arg.secondary)
					return 0;
			return -1;
		}
		
		public String toString() {
			return Character.toString(primary)+secondary+": "+item;
		}
		
	}
	
	
	public void add(String td,char pri,int sec) {
		super.add(new ToDoItem(td, pri, sec));
	}
	
	
	public static void main(String[] args) {
		
		ToDoList toDoList = new ToDoList();
		toDoList.add("Empty trash",'C',4);
		toDoList.add("Feed dog",'A',2);
		toDoList.add("Feed bird",'B',7);
		toDoList.add("Mow lawn",'C',3);
		toDoList.add("Water lawn",'A',1);
		toDoList.add("Feed cat",'B',1);
		
		while(!toDoList.isEmpty())
			System.out.println(toDoList.remove());
	}
	
	/**
	 *  A1: Water lawn
		A2: Feed dog
		B1: Feed cat
		B7: Feed bird
		C3: Mow lawn
		C4: Empty trash

	 */
}
