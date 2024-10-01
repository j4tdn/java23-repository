package sorting.bubble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02BubleSortString {

	/*
	 Sap xep mang doi tuong
	 - Xu ly truong hop null values
	   --> null first
	   		* cac pt null nam ve truoc
	   		* null < non null
	   --> null last
	   		* cac pt null nam ve sau
	   		* null > non null
	 - Xu ly cac phan tu co gia tri(khac NULL)
	   --> asc
	   --> desc
	 */
	public static void main(String[] args) {
		
		String[] elements = {null, "a123", "z45", null, "c1", "k6", "d28", null};
		
		System.out.println("elements: " + Arrays.toString(elements));
		
		System.out.println("\n===============================");
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first
			if(s1 == null)
				return -1;
			if(s2 == null)
				return 1;
			
			// non null values --> asc
			return s1.compareTo(s2);
		});
		
		System.out.println("elements(null first, asc): " + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first
			if(s1 == null)
				return -1;
			if(s2 == null)
				return 1;
						
			// non null values --> desc
			return s2.compareTo(s1);
		});
		
		System.out.println("elements(null first, desc): " + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null last
			if(s1 == null)
				return 1;
			if(s2 == null)
				return -1;
			
			// non null values --> asc
			return s1.compareTo(s2);
		});
		
		System.out.println("elements(null last, asc): " + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null last
			if(s1 == null && s2 != null)
				return 1;
			if(s2 == null)
				// s1 null hay !null cung giu nguyen vi s2 = null(dung vi tri)
				return -1;
			
			// non null values --> desc
			return s2.compareTo(s1);
		});
		
		System.out.println("elements(null last, desc): " + Arrays.toString(elements));
	}
	
	private static void bubbleSort(String[] elements, StringComparator stringComp) {
		int length = elements.length;
		for(int i = 0; i < elements.length; i++)  // so round
			for(int j = 0; j < elements.length - i - 1; j++)
				if(stringComp.strategy(elements[j], elements[j + 1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
	}
}
