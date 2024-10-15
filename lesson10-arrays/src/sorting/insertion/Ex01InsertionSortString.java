package sorting.insertion;

import java.util.Arrays;
import functional.StringComparator;

public class Ex01InsertionSortString {

	public static void main(String[] args) {
		String[] elements = {null, "a123", null, null, "z45", "c1", null, "k6", "d28", null};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		insertionSort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
		});
		
		System.out.println("\nsorted(asc) " + Arrays.toString(elements));
		
	}
	
	private static void sort(String[] elements) {
		for (int i = 1; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (elements[j].compareTo(elements[i] > 0) {
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
		
	}
	
}
