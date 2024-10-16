package generic.classinterface;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * khai báo class customlist có tham số là generic type
 * 
 */

public class CustomList <E> implements Ilist <E> {
	
	
	private E[] elementData ;
	private int size;
	
	private static final int DEFAULT_CAPACYTY = 10;
	
	@SuppressWarnings("unchecked")
	public CustomList() {
		elementData = (E[])Array.newInstance(Object.class, DEFAULT_CAPACYTY);
	}
	
	@Override
	public void add(E e) {
		 if (size == elementData.length) {
			 grow();
		 }
		elementData[size++] = e;
	}

	private void grow() {
		int newcapacity = size*2;
		elementData = Arrays.copyOf(elementData, newcapacity);
		
	}

	@Override
	public void remove(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(E e) {
		int index = 0;
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Out of range");
		}
		return null;
	}

	@Override
	public void set(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size(E e) {
		return size;
	}

	@Override
	public int capacity(E e) {
		return elementData.length;
	}
	
	
	
}
