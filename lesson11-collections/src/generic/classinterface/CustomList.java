package generic.classinterface;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 Khai báo class CustomList có tham số là generic type E
 Thực thi từ interface IList<E>
 */

public class CustomList<E> implements IList<E>{
	
	// Compile: Chưa biết E là KDL gì
	// Runtime: Mới biết KDL chính xác
	// --> Không thể khởi tạo giá trị cho E (new E) tại compile
	//	   vì chưa biết E là KDL gì, có bao nhiêu tham số --> không new được
	private E[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	@SuppressWarnings("unchecked")
	public CustomList() {
		elementData = (E[])Array.newInstance(Object.class, DEFAULT_CAPACITY);
	}

	@Override
	public void add(E e) {
		if(size == elementData.length) {
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
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Out of Range [0, " + size + ") exception");
		}
		return elementData[index];
	}

	@Override
	public void set(int index, E e) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Out of Range [0, " + size + ") exception");
		}
		elementData[index] = e;
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override
	public int capacity() {
		return elementData.length;
	}

}
