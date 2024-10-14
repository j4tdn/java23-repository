package generic.classinterface;

import java.lang.reflect.Array;

/*
	 Khai báo 1 class CustomerList có tham số là generic type E
	 Thực thi từ interface IList<E>
	 */
public class CustomList<E> implements IList<E> {
	private E[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	@SuppressWarnings("unchecked")
	public CustomList() {
		elementData = (E[]) Array.newInstance(Object.class, DEFAULT_CAPACITY);
	}
	@Override
	public void add(E e) {
		if(elementData.length == size) {
			grow();
		}
		
		
	}
	public void grow() {
		int newcappacity = size;
		
	}
	@Override
	public void remove(E e) {
		
	}
	@Override
	public E get(int index) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Out of Range [0, "+ size + "] exception");
		}
		return elementData[index];
	}
	@Override
	public void set(int index, E e) {
	
	}
	@Override
	public int size() {
		return size;
	}
	public int capacity() {
		return elementData.length;
	}
}