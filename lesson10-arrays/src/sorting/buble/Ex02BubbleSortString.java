package sorting.buble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02BubbleSortString {
	
	public static void main(String[] args) {
		
		/*
		 Sắp xếp mảng đối tượng
		 - 1. Xử lý trường hợp null values
		   --> null first
		       * các pt null nằm về trước
		       * null < non null
		   --> null last
		       * các pt null nằm về sau
		       * null > non null
		 - 2. Xử lý các phần tử có giá trị(khác null)
		   --> asc
		   --> desc
		 */
		
		String[] elements = {null, "a123", null, null, "z45", "c1", null, "k6", "d28", null};
		
		System.out.println("elements: " + Arrays.toString(elements));
		
		System.out.println("\n====================\n");
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return -1;
			}
			// s1 != null
			if (s2 == null) {
				return 1;
			}
			
			// non-null values --> asc
			return s1.compareTo(s2);
		});
		System.out.println("elements(null first, asc): " + Arrays.toString(elements));
		
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return -1;
			}
			// s1 != null
			if (s2 == null) {
				return 1;
			}
			
			// non-null values --> desc
			return s2.compareTo(s1);
		});
		System.out.println("elements(null first, desc): " + Arrays.toString(elements));
		
		// null last, desc
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null last
			if (s1 == null && s2 != null) {
				return 1;
			}
			
			if (s2 == null) {
				// s1 null hay !null cũng giữa nguyên vì s2 = null(đúng vị trí)
				return -1;
			}
			
			// non-null values --> desc
			return s2.compareTo(s1);
		});
		System.out.println("elements(null first, desc): " + Arrays.toString(elements));
		
	}
	
	private static void bubbleSort(String[] elements, StringComparator stringComp) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				// Hoán vị strategy(s1, s2) > 0
				if (stringComp.strategy(elements[j], elements[j+1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		
	}
	
}