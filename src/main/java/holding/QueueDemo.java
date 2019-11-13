package holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 
    * @ClassName: QueueDemo
    * @Description: 11.11 Queue 先进先出容器
    * @author lishuaibing
    * @date 2019年11月13日 下午1:27:45
    *
 */
public class QueueDemo {

	public static void printQ(Queue queue) {
		while(queue.peek()!=null) {
			System.out.print(queue.remove()+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		Random random = new Random(47);
		for(int i=0;i<10;i++) {
			queue.offer(random.nextInt(i+10));
		}
		printQ(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c:"Brontosarus".toCharArray()) {
			qc.offer(c);
		}
		printQ(qc);
	}
	/**执行结果：
	 *  8 1 1 1 5 14 3 1 0 1 
		B r o n t o s a r u s 
	 */
	
}
