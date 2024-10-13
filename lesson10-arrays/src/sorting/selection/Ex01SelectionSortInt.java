package sorting.selection;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01SelectionSortInt {

	public static void main(String[] args) {

		int[] elements = { 8, 5, 11, 9, 4, 6 };
		System.out.println("orijin --> " + Arrays.toString(elements));

		sortAsc(elements);
		System.out.println("\nsorted Asc --> " + Arrays.toString(elements));

		sortDesc(elements);
		System.out.println("sorted Desc --> " + Arrays.toString(elements));

		// tăng dần
		selectionSort(elements, (e1, e2) -> {
			// Cách 1
//			if (e1 > e2) {
//				return 1;
//			}
//			return -1;

			// Cách 2
			return e2 - e1;
		});
		System.out.println("\nsorted Asc --> " + Arrays.toString(elements));
	}

	public static void selectionSort(int[] elements, IntComparator intComp) {
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

	// Cứ sau mỗi round --> select ra phần tử lớn/nhỏ nhất nằm bên phải/trái
	// khi so sánh nó với các phần từ còn lại

	public static void sortAsc(int[] elements) {
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

	public static void sortDesc(int[] elements) {
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
