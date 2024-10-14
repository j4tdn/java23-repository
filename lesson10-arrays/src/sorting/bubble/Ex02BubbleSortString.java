package sorting.bubble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02BubbleSortString {
	
	public static void main(String[] args) {
		
		/*
		  Khi sắp xếp 1 mảng đối tượng
		  - 1. Xử lý trường hợp null values
		    --> null first
		    	* các phần tử null nằm về trước
		    	* null < non null
		    --> null last
		    	* các phần tử null nằm về sau
		    	* null > non null
		  - 2. Xử lý các phần tử có giá trị (khác null)
		    --> asc
		    --> desc
		 */
		
		String[] elements = {null, "a123", null, null, "z45", "c1", null, "k6", "d28"};
		
		System.out.println("elements: " + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// non-null values --> desc
			return s1.compareTo(s2);	
		});
		
		System.out.println("\nelements(null first, asc): " + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// non-null values --> desc
			return s2.compareTo(s1);
		});
		
		System.out.println("elements(null first, desc): " + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null last
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				// s1 null hay != null cũng giữ nguyên vì s2 = null (đúng vị trí)
				return -1;
			}
			// non-null values --> desc
			return s1.compareTo(s2);	
		});
		
		System.out.println("\nelements(null last, asc): " + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null last
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			// non-null values --> desc
			return s2.compareTo(s1);
		});
		
		System.out.println("elements(null last, desc): " + Arrays.toString(elements));
	}
	
	private static void bubbleSort(String[] elements, StringComparator stringComp) {
		
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (stringComp.strategy(elements[j], elements[j+1]) > 0) {
					// swap
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		
	}

}
