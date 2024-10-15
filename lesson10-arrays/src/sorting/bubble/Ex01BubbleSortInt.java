package sorting.bubble;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01BubbleSortInt {
	public static void main(String[] args) {
		int[] elements = { 1, 5, 9, 4, 6, 11 };
		
		// ASC: 1 3 5
		bubbleSort(elements, (previous, after) -> previous > after);
		
		System.out.println("Elements (ASC): " + Arrays.toString(elements));

		bubbleSort(elements, (previous, after) -> previous < after);

		System.out.println("Elements (DESC): " + Arrays.toString(elements));

	}

	private static void bubbleSort(int[] elements, IntComparator comparator) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (comparator.strategy(elements[j], elements[j + 1])) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
