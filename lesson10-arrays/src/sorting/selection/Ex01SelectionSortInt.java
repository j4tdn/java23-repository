package sorting.selection;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01SelectionSortInt {

	public static void main(String[] args) {
		int[] elements = { 8, 5, 11, 9, 4, 6 };
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		sortAsc(elements);
		
		System.out.println("\nsorted(asc) --> " + Arrays.toString(elements));
		
		sortDesc(elements);
		
		System.out.println("\nsorted(desc) --> " + Arrays.toString(elements));
		
		selectionSort(elements, (e1, e2) -> {
			return e2 - e1;
		});
		
	}
	
	private static void selectionSort(int[] elements, IntComparator intComp) {
		for (int i = elements.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (intComp.strategy(elements[j], elements[i]) > 0) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
	
	private stataic void sortAsc (int[] elements) {
		for (int i = elements.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (elements[j] > elements[i]) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
	
	private stataic void sortDesc (int[] elements) {
		for (int i = elements.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (elements[j] < elements[i]) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
	
}
