package generic.classinterface;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 Khai báo class CustomerList có tham số là generic type
 Thực thi từ interface IList<E>
 
 *
 */
public class CustomList<E> implements IList<E> {

	private E[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	@SuppressWarnings("unchecked")
	public CustomList() {
		elementData = (E[])Array.newInstance(Object.class, DEFAULT_CAPACITY);
	}
	
	
	
	
	
	@Override
	public void add(E e) {
		if (size == elementData.length) {
			grow();
		}
		elementData[size++] = e;

	}
	
	private void grow() {
		int newCapacity = size * 2;
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	@Override
	public void remove(E e) {

	}

	@Override
	public E get(int index) {
		if ( index < 0 || index >= size) {
			throw new IndexOutOfBoundException("Out of range [0, " + size + ") exception
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

}
