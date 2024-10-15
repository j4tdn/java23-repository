package sorting.selection;

import java.util.Arrays;

public class Ex01SelectionSortInt {
	public static void main(String[] args) {
		int[] elements = { 8, 5, 11, 9, 8, 4, 6 };
		System.out.println("origin: " + Arrays.toString(elements));

		sort(elements);
		System.out.println("sort asc: " + Arrays.toString(elements));
	}

	private static void sort(int[] elements) {
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
}
