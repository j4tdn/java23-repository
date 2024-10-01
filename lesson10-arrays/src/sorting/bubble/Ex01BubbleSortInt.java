package sorting.bubble;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01BubbleSortInt {

	public static void main(String[] args) {
		
		int[] elements = {1, 5, 9, 4, 6, 11};
		
		System.out.println("Elements --> " + Arrays.toString(elements));
		
		bubbleSort(elements, (n1, n2) -> {
			return n1 - n2;
		});
		
		System.out.println("\nElements(ASC) --> " + Arrays.toString(elements));
		
		bubbleSort(elements, (n1, n2) -> {
			return n2 - n1;
		});
		System.out.println("\nElements(DESC) --> " + Arrays.toString(elements));
		
	}
	
	private static void bubbleSort(int[] elements, IntComparator intComp) {
		for(int i = 0; i < elements.length; i++)  // so round
			for(int j = 0; j < elements.length - i - 1; j++)
				// Muon hoan vi thi ket qua cua trategy(T, S) phai > 0
				if(intComp.strategy(elements[j], elements[j + 1]) > 0) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
	}
}
