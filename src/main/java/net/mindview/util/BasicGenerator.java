package net.mindview.util;

/**
 * 
    * @ClassName: BasicGenerator
    * @Description: 15.4.4 一个通用的Generator
    *              可以为任何一个程序构造一个Generator，只要该类具有默认的构造器，为了减少类型声明，他提供了一个泛型方法
    * @author lishuaibing
    * @date 2019年11月27日 上午9:50:08
    *
 */
public class BasicGenerator<T> implements Generator<T> {

	private Class<T> type;
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	
	@Override
	public T next() {
	
		try {
			return type.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
