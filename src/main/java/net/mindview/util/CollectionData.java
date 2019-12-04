package net.mindview.util;

import java.util.ArrayList;

/**
 * 
 * @ClassName: CollectionData
 * @Description: 17.2.1 一个Generator解决方案
 *    CollectionData 是适配器模式，他讲Generator适配到Collection构造器上
 * @author lishuaibing
 * @date 2019年12月4日 上午10:26:25
 *
 */
public class CollectionData<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	public CollectionData(Generator<T> gen, int quantity) {
		for (int i = 0; i < quantity; i++)
			add(gen.next());
	}

	public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
		return new CollectionData<T>(gen, quantity);
	}

}
