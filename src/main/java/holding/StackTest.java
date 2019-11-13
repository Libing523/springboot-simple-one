package holding;

import net.mindview.util.Stack;

/**
 * S
    * @ClassName: StackTest
    * @Description: 11.7 Stack 实例
    * @author lishuaibing
    * @date 2019年11月13日 上午10:33:29
    *
 */
public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(String s : "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		while(!stack.empty())
			System.out.println(stack.pop()+" ");
	}
}
