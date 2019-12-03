package net.mindview.util;

/**
 * 
 * @ClassName: CountingGenerator
 * @Description: 16.6.2 数据生成器 首先给出的是可以用于基本类型的包装器类型，以及String类型的最基本的计数生长器集合。
 * @author lishuaibing
 * @date 2019年11月29日 下午2:34:59
 *
 */
public class CountingGenerator {

	public static class Boolean implements Generator<java.lang.Boolean> {
		private boolean value = false;
		@Override
		public java.lang.Boolean next() {
			value = !value;
			return value;
		}
	}

	public static class Byte implements Generator<java.lang.Byte> {
		private byte value = 0;
		@Override
		public java.lang.Byte next() {
			return value++;
		}
	}
	
	
	static char[] chars = {};
	
	
	
	
	
	
	

}
