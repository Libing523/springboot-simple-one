package net.mindview.util;

import java.util.AbstractList;

/**
 * 
 * @ClassName: CountingIntegerList
 * @Description: List 可以具有任意尺寸，并且用Integer数据进行初始化
 * @author lishuaibing
 * @date 2019年12月4日 下午4:23:15
 *
 */
public class CountingIntegerList extends AbstractList<Integer> {

	private int size;

	public CountingIntegerList(int size) {
		this.size = size < 0 ? 0 : size;
	}

	@Override
	public Integer get(int index) {
		return Integer.valueOf(index);
	}

	@Override
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		System.out.println(new CountingIntegerList(30));
	}

}
