package sorting.quick;

import java.util.Arrays;

public class Ex01SortingInt {

	public static void main(String[] args) {
		
		int[] elements = {1, 8, 2, 18, 7, 33};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		Arrays.sort(elements);
		reverse(elements);
		
		System.out.println("\nsorted(asc) --> " + Arrays.toString(elements));
		
	}
	
	private static void reverse(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = elements[i];
			elements[i] = elements[length - i - 1];
			elements[length - i - 1] = temp; 
		}
	}
	
}
