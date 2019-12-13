package net.mindview.util;

import java.util.LinkedList;

/**
 * 
 * @ClassName: Deque
 * @Description: 17.7.2 双向队列
 * @author lishuaibing
 * @date 2019年12月6日 上午10:30:56
 *
 * @param <T>
 */
public class Deque<T> {

	private LinkedList<T> deque = new LinkedList<T>();

	public void addFirst(T e) {
		deque.addFirst(e);
	}

	public void addLast(T e) {
		deque.addLast(e);
	};

	public T getFirst() {
		return deque.getFirst();
	}

	public T getLast() {
		return deque.getLast();
	}

	public T removeFirst() {
		return deque.removeFirst();
	}

	public T removeLast() {
		return deque.removeLast();
	}

	public int size() {
		return deque.size();
	}

	public String toString() {
		return deque.toString();
	}

}
