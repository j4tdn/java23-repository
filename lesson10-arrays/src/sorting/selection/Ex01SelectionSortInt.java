package sorting.selection;

import java.util.Arrays;

import functional.Operator;

public class Ex01SelectionSortInt {

	public static void main(String[] args) {
		int[] elements = {8, 5, 11, 9 , 4, 6};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		sortAsc(elements);
		
		System.out.println("sorted (asc) --> " + Arrays.toString(elements));

		sortDesc(elements);
		
		System.out.println("sorted (desc) --> " + Arrays.toString(elements));
	
		selectionSort(elements, (e1, e2) -> {
			if (e1 > e2) {
				return 1;
			}
			return -1;
		});
		
		System.out.println("\nsorted (asc) --> " + Arrays.toString(elements));

	}
	
	private static void selectionSort(int[] elements, Operator intComp) {
		for (int i = elements.length-1; i> 0; i--) {
			for (int j = 0; j < i; j++) {
				if (intComp.strategy(elements[j], elements[i]) > 0) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
	
	//sau mỗi round --> select ra phần tử lớn/ nhỏ nhất nằm bên trái/ phải 
	// khi so sánh no với các phần tử khác
	private static void sortAsc(int[] elements) {
		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = i +  1; j < elements.length; j++) {
				if (elements[j] < elements[i]) {
					int temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				} 
			}
		}
	}
	
	private static void sortDesc(int[] elements) {
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
