package sorting.selection;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01Selection {

	public static void main(String[] args) {
		int[] elements = {8,5,11,9,4,6};
		System.out.println("elements: " +Arrays.toString(elements));		
		
		sortAsc(elements);
		System.out.println("Sort Asc(Tang dan): " +Arrays.toString(elements));
//		
//		sortDesc(elements);
//		System.out.println("Sort Desc(giam dan): "+Arrays.toString(elements));
//		
		selectionSort(elements, (n1, n2) -> {
			if(n1 > n2 ) {
				return 1;
			}
			return -1;
		});
		System.out.println("Giam dần: " +Arrays.toString(elements));
	}
	
	private static void selectionSort(int[] elements, IntComparator intComp) {
		for(int i = elements.length -1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(intComp.strategy(elements[j], elements[i]) > 0 ) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
	
	
	private static void sortAsc(int [] elements) {
		for(int i = 0;i < elements.length; i++) {
			for(int j = elements.length -1; j > i;j--) {
				if(elements[j] < elements[i]) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
	
	private static void sortDesc(int [] elements) {
		for(int i = elements.length -1; i > 0;i--) {
		for(int j = i; j < i; j++) {
				if(elements[j] > elements[i]) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
}
