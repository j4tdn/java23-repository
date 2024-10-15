package sorting.bubble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02BubbleSortString {

	public static void main(String[] args) {
		/*
		  Sắp xếp mảng đối tượng
		  - Xử lý trường hợp null values
		 	--> null first
		 	 * các pt null nằm về trước
		 	 * null < non-null
		 	--> null last
		 	 * các pt null nằm về sau
		 	 * null > non-null
		  - Xử lý các phần tử có giá trị (khác null)
		  	--> asc
		  	--> desc
		 */
		String[] elements = {null, "a123", null, null, "z45", "c1",null,  "k6", "d28",null};
		System.out.println("elements : " + Arrays.toString(elements));
		
		System.out.println("\n===========================\n");
		bubbleSortAsc(elements, (s1, s2) -> {
			// non-null values -> null first
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// non-null values --> asc
			return s1.compareTo(s2);
		});
		System.out.println("elements null first(Asc) : " + Arrays.toString(elements));
		bubbleSortAsc(elements, (s1, s2) -> {
			// non-null values -> null first
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// non-null values --> asc
			return s2.compareTo(s1);
		});
		System.out.println("elements null first(Desc) : " + Arrays.toString(elements));
		bubbleSortAsc(elements, (s1, s2) -> {
			// non-null values -> null first
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			// non-null values --> asc
			return s2.compareTo(s1);
		});
		
		System.out.println("\n============================\n");
		System.out.println("elements null last (Desc) : " + Arrays.toString(elements));
		bubbleSortAsc(elements, (s1, s2) -> {
			// non-null values -> null first
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			// non-null values --> asc
			return s1.compareTo(s2);
		});
		System.out.println("elements null last(Asc) : " + Arrays.toString(elements));

	}
	
	
	private static void bubbleSortAsc(String[] elements, StringComparator stringComp) {
		for (int i = 0; i < elements.length;i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
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
