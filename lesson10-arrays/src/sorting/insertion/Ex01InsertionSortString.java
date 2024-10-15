package sorting.insertion;

import java.util.Arrays;

public class Ex01InsertionSortString {
	public static void main(String[] args) {
		String[] elements = { "a123", "f2", "e3", "d4", "b5", "z10" };

		sort(elements);

		System.out.println(Arrays.toString(elements));
	}

	private static void sort(String[] elements) {
		for (int i = 1; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (elements[j].compareTo(elements[i]) > 0) {
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
	}
}
