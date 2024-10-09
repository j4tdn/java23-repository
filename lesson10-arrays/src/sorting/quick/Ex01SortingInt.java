package sorting.quick;

import java.util.Arrays;

import org.w3c.dom.Element;

public class Ex01SortingInt {
	
	public static void main(String[] args) {
		
		int[] elements = {1, 8, 2, 18, 7, 33};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		Arrays.sort(elements); // default ascending
		System.out.println("\nsort(asc) --> " + Arrays.toString(elements));
		reverse(elements); // reverse
		
		System.out.println("\nsort(desc) --> " + Arrays.toString(elements));
		
	}
	
	private static void reverse(int[] elements ) {
		int length = elements.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = elements[i];
			elements[i] = elements[length - i - 1];
			elements[length - i - 1] = temp;
		}
	}
	
}
