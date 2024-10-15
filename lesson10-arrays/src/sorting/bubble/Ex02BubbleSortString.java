package sorting.bubble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02BubbleSortString {

	public static void main(String[] args) {
		
		String[] elements = {"a123", "z45", "c1", "k6", "d28"};
		
		System.out.println("elements: " + Arrays.toString(elements));
		
		System.out.println("\n=======================\n");
		
		bubbleSort(elements, (s1, s2) -> {
			return s1.compareTo(s2);
		});
		System.out.println("elements(asc): " + Arrays.toString(elements));
		
		bubbleSort(elements, (s1, s2) -> {
			return s2.compareTo(s1);
		});
		System.out.println("elements(desc): " + Arrays.toString(elements));
		
	}
	
	private static void bubbleSort(String[] elements, StringComparator stringComp) {
		int length = elements.length;
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (stringComp.strategy(elements[j], elements[j + 1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
		
	}
	
}
