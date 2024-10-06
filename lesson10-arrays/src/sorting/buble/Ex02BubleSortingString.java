package sorting.buble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02BubleSortingString {

	public static void main(String[] args) {
		
		/*
		 Sắp xếp mảng đối tưởng
		 - 1. Xử lý trường hợp null values
		 	--> null first
		 		* những thằng null nằm về trước -> null bé hơn non null (null < non null)
		 	--> null last
		 		* những thằng null nằm về sau -> null lớn hơn non null (null > non null)
		 - 2. Xử lý các phần tử có giá trị (khác null)
		 	--> asc
		 	--> desc
		 */

		String[] elements = { null, "a123", null, null, "z45", "c1", null, "k6", "d28", null };

		System.out.println("elements: " + Arrays.toString(elements));
		
		System.out.println("\n=================\n");

//		bubbleSortAsc(elements); - (*)
		
		// *null first, asc
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return -1; // - 10 cũng được, miễn không lớn hơn 0
			}
			
			// s1 != null
			if (s2 == null) {
				return 1;
			}
			
			// non-null values --> asc
			// Cách 1:
//			if (s1.compareTo(s2) > 0) {
//				return 1;
//			}
//			return 1
			
			// Cách 2:
			return s1.compareTo(s2);
		});
		System.out.println("elements(null first, asc): " + Arrays.toString(elements));

		// *null first, desc
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first - (*)
			if (s1 == null) {
				return -1; //
			}
			
			// s1 != null
			if (s2 == null) {
				return 1;
			}
			
			// non-null values --> desc
			return s2.compareTo(s1);
		});
		System.out.println("elements(null first, desc): " + Arrays.toString(elements));
		
		// *null last, desc
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first - (*)
			if (s1 == null && s2 != null) {
				return 1; //
			}
			
			// s1 != null
			if (s2 == null) {
				// s1 null hay !null cũng giữ nguyên vì s2 = null (đúng vị trí)
				return -1;
			}
			
			// non-null values --> desc
			return s2.compareTo(s1);
		});
		System.out.println("elements(null last, desc): " + Arrays.toString(elements));
	}

	public static void bubbleSort(String[] elements, StringComparator stringComp) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				//if (elements[j].compareTo(elements[j + 1]) > 0) {
				if (stringComp.strategy(elements[j], elements[j+1]) >0) {
					String temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}
}
