package generic.classinterface;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * Khai báo class có tham số genericType E
 * thực thi từ interface IList<E>
 */

public class CustomList<E> implements IList<E> {

	// Compile: chưa biết E là KDL gì
	// Runtime: mới biết KDL
	// -> Ko thể khởi tạo giá trị cho E, new E tại compile
	// vì chưa biết E là KDl gì có bao nhiêu tham số ...
	private E[] elementData;
	private int size;

	private static final int DEFAULT_CAPACITY = 10;

	@SuppressWarnings("unchecked")
	public CustomList() {
		elementData = (E[]) Array.newInstance(Object.class, DEFAULT_CAPACITY);
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
		// TODO Auto-generated method stub

	}

	@Override
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Out of range");
		}
		return elementData[index];
	}

	@Override
	public void set(int index, E e) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Out of range");
		}
		this.elementData[index] = e;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int capacity() {
		return elementData.length;
	}

}
