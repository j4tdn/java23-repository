package sorting.selection;

import java.util.Arrays;

import functional.IntSort;

public class Ex01SelectionSortInt {

	public static void main(String[] args) {
		int[] elements = {8, 5, 11, 9, 4, 6};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		sortAsc(elements);
		
		System.out.println("sorted(asc) --> " + Arrays.toString(elements));
		
		sortDesc(elements);
		
		System.out.println("sort(desc) --> " +Arrays.toString(elements));
		
		selectionSort(elements, (e1, e2) -> {
			return e2 - e1;
		});
		
	}
	
	private static void sortAsc(int[] elements) {
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
		// cứ sáu mỗi round --> select ra phàn tử lớn/nhỏ nhất nằm bên phải/ tái
		// khi so sánh nó với các phần tử còn lại
		private static void sortDesc(int[] elements) {
			for (int i = 0; i < elements.length - 1; i++) {
				for (int j = elements.length; j < i; j--) {
					if (elements[j] < elements[i]) {
						int temp = elements[j];
						elements[j] = elements[i];
						elements[i] = temp;
					}
				}
			}
		}
		
		private static void selectionSort(int[] elements, IntSort intComp) {
			for (int i = elements.length - 1; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					if (intComp.strategy(elements[i], elements[j]) > 0) {
						int temp = elements[j];
						elements[j] = elements[i];
						elements[i] = temp;
					}
				}
			}
		}
}
