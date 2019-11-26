package generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
    * @ClassName: RandomList
    * @Description: RandomLisr 实现容器中，我们需要一个特定类型对象的列表，每次调用select()方法，可以随机的访问一个对象
    *              构建一个可以应用于各种类型的对象工具
    * @author lishuaibing
    * @date 2019年11月26日 上午10:48:12
    *
    * @param <T>
 */
public class RandomList<T> {

	private ArrayList<T> storage = new ArrayList<T>();
	Random random = new Random(47);
	public void add(T item) {
		storage.add(item);
	}
	
	public T select() {
		return storage.get(random.nextInt(storage.size()));
	}
	
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for(String s : "The quick brown fox jumped over the lazy brown dog".split(" "))
			rs.add(s);
		for(int i=0;i<11;i++)
			System.out.print(rs.select()+"、");
			
	}
	
	
	
}
