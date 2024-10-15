package sorting.bubble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02_BubbleSortString {

	/*
	 * xử lý null first or null last
	 * 
	 * -> xử lý khác null
	 */

	public static void main(String[] args) {
		String[] elements = { null, "a123", null, null, "z44", "c1", null, "k6", "d28", null };

		System.out.println("elements: " + Arrays.toString(elements));

		bubbleSort(elements, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return -1;
			}
			// s1 != null -> need swap
			if (s2 == null) {
				return 1;
			}
			
			// non null -> asc (s1 > s2 -> swap)
			return s1.compareTo(s2);
		});


		System.out.println("ASC: " + Arrays.toString(elements));
	}

	private static void bubbleSort(String[] elements, StringComparator strComp) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if(elements[j] == null) {
					
				}
				
				if (strComp.strategy(elements[j], elements[j + 1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j + 1] = temp;
				}
			}
		}
	}
}
