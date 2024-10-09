package sorting.selection;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01SelectionSortInt {

		public static void main (String[] args) {
			int[] n = {8,5,11,9,4,6};
			sortAsc(n);
			System.out.println("sorted(Asc)--> " + Arrays.toString(n));
			
			selectionSort(n, (e1, e2) -> {
				return e2 - e1;
			});
			
			System.out.println("sorted(Desc)--> " + Arrays.toString(n));
		}
		
		private static void sortAsc(int[] elements) {
			
			for (int i = elements.length -1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (elements[j] > elements[i]) {
						int temp = elements[i];
						elements[i] = elements[j];
						elements[j] = temp;					
						}
				}
			}
		}
		
		private static void sortDesc(int[] elements) {
			
			for (int i = elements.length -1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (elements[j] < elements[i]) {
						int temp = elements[i];
						elements[i] = elements[j];
						elements[j] = temp;							}
				}
			}
		}
		
		private static void selectionSort(int[] elements, IntComparator intComp) {
			
			for (int i = elements.length -1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (intComp.strategy(elements[j], elements[i]) > 0) {
						int temp = elements[i];
						elements[i] = elements[j];
						elements[j] = temp;							
						}
				}
			}
		}
}
