package generics;

/**
 * 
    * @ClassName: LinkedStack
    * @Description: 一个堆栈类 实现自己内部链式机制
    * @author lishuaibing
    * @date 2019年11月26日 上午10:16:43
    *
    * @param <T>
 */
public class LinkedStack<T> {

	@SuppressWarnings("unused")
	private static class Node<U>{
		U item;
		Node<U> next;
		Node(){item=null;next = null;}
		
		Node(U item,Node<U> next){
			this.item = item;
			this.next = next;
		}
		boolean end() {return item == null && next == null;}
	}
	
	private Node<T> top = new Node<T>();
	public void push(T item) {
		top  = new Node<T>(item,top);
	}
	
	public T pop() {
		T result = top.item;
		if(!top.end()) 
			top = top.next;
		return result;
		}
	
	public static void main(String[] args) {
		
		LinkedStack<String> lss = new LinkedStack<String>();
		for(String s : "Phasers or stun!".split(" ")) {
			lss.push(s);
		}
		String s;
		while((s = lss.pop())!=null)
			System.out.println(s);
		
		
	}
	
	
	
	
	
	
}
