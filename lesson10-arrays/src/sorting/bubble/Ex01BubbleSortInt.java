package sorting.bubble;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01BubbleSortInt {
	
	public static void main(String[] args) {
		
		int[] elements = {1, 5, 9, 4, 6, 11};
		
		// tăng dần
		// bubbleSortAsc(elements);
		bubbleSort(elements, (n1, n2) -> n1 > n2);
			
		System.out.println("\nElements(ASC) --> " + Arrays.toString(elements));
		
		// giảm dần
		bubbleSortDesc(elements);
		
		System.out.println("\nElements(DESC) --> " + Arrays.toString(elements));
	}
	
	private static void bubbleSort(int[] elements, IntComparator intComp) {
		// duyệt từng round
		for (int i = 0; i < elements.length; i++) { // số round
			// tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (intComp.strategy(elements[j], elements[j + 1])) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
				
			}
		}
	}
	
	private static void bubbleSort(int[] elements, IntComparator intComp) {
		// duyệt từng round
		for (int i = 0; i < elements.length; i++) { // số round
			// tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (intComp.strategy(elements[j], elements[j + 1]) > 0) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
				
			}
		}
	}
}
