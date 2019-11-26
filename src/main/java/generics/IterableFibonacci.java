package generics;

import java.util.Iterator;

/**
 * 
    * @ClassName: IterableFibonacci
    * @Description: 通过集成方式实现适配器来进而实现Iterable的Fibonacci生成器
    * @author lishuaibing
    * @date 2019年11月26日 下午2:53:11
    *
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

	private int n;
	public IterableFibonacci(int count) {
		n = count;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
			
				return n>0;
			}

			@Override
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		for(int i : new IterableFibonacci(18))
			System.out.print(i+"、");
	}
	
	
}
