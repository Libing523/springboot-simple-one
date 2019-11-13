package holding;

import java.util.Iterator;

/**
 * 
    * @ClassName: IterableClass
    * @Description: 11.13 foreach与迭代器
    * @author lishuaibing
    * @date 2019年11月13日 下午2:41:45
    *
 */
public class IterableClass implements Iterable<String> {

	protected String[] words = ("And that is how " + "we know the Earch to be banna-shaped.").split(" ");

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<String>() {
			private int index = 0;

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}

			@Override
			public boolean hasNext() {

				return index < words.length;
			}
		};
	}

	public static void main(String[] args) {
		for (String s : new IterableClass()) {
			System.out.print(s + " ");
		}
	}
	/**执行结果：
	 * And that is how we know the Earch to be banna-shaped. 
	 */
}
