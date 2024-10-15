package sorting.bubble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02BubbleSortString {

	public static void main(String[] args) {
		
		/*
		 Sắp xếp mảng đối tượng
		 1. Xử lí trường hợp Null Value
		  --> null first
		  	* Các phần tử Null nằm về trước
		  	* null < non null
		  --> null last
		  	* Các phần tử Null nằm về sau
		  	* null > non null
		 2. Xử lí các phần tử có giá trị (khác null)
		  --> Tăng dần/giảm dần (asc/desc)
		  
		 */
		
		String[] elements = {null, null, "a123", null, null, "z45", "c1", null, "k6", "d28", null};
		System.out.println("element: " + Arrays.toString(elements));
		
		System.out.println("\n=======================================\n");
		
		bubbleSortAsc(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// non-null values --> asc
			return s1.compareTo(s2);
		});
		System.out.println("elementAsc null first: " + Arrays.toString(elements));
		
		bubbleSortAsc(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			// non-null values --> asc
			return s2.compareTo(s1);
		});
		System.out.println("elementDesc null first: " + Arrays.toString(elements));
		
		bubbleSortAsc(elements, (s1, s2) -> {
			// null values --> null last
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				// s1 null hay !null cũng giữ nguyên vì s2 = null (đúng vị trí)
				return -1;
			}
			// non-null values --> asc
			return s2.compareTo(s1);
		});
		System.out.println("elementDesc null last: " + Arrays.toString(elements));
		
	}
	
	private static void bubbleSortAsc(String[] elements, StringComparator stringComp) {
		int length = elements.length;
		for(int i = 0; i < elements.length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (stringComp.strategy(elements[j], elements[j+1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		
	}
	
}
