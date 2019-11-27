package generics;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

/**
 * 
 * @ClassName: BasicGeneratorDemo
 * @Description:使用BasicGenerator可以很容易为CountedObject创建一个Generator
 * @author lishuaibing
 * @date 2019年11月27日 上午10:16:39
 *
 */
public class BasicGeneratorDemo {
public static void main(String[] args) {
	Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
	for(int i=0;i<5;i++)
		System.out.println(gen.next());
}

}
