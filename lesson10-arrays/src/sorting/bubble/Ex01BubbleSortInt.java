package sorting.bubble;

import java.util.Arrays;

import functional.OperatorSort;

public class Ex01BubbleSortInt {

	public static void main(String[] args) {
		int[] elements = {1, 5, 9, 4, 6, 11};
//		System.out.println("\nElement (ASC) --> " + Arrays.toString(elements));
//
//		// tăng dần
//		bubbleSortAsc(elements);
//		
//		System.out.println("\nElement (ASC) --> " + Arrays.toString(elements));
//		// giảm dần
//		bubbleSortDesc(elements);

		
		
		
//		System.out.println("\nElement (ASC) --> " + Arrays.toString(elements));

//		bubbleSort(elements, (a, b) ->  a < b);

//		System.out.println("\nElement (DESC) --> " + Arrays.toString(elements));
//		bubbleSort(elements, (a, b) ->  a > b);
		
		bubbleSort(elements, (n1, n2) -> {
//			if (n1 > n2) {
//				return 1;
//			}
//			return -1;
			return n1-n2;
		});
		System.out.println("\nElements (ASC) -->" + Arrays.toString(elements));
		
		bubbleSort(elements, (n1, n2) -> {

			return n2-n1; // hoac (-1) * (n1 - n2)
		});
		System.out.println("\nElements (DESC) -->" + Arrays.toString(elements));


	}
	
	private static void bubbleSort(int[] elements, OperatorSort opt) {
		for (int round = 0; round < elements.length; round++) { // số round 
			// Tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - round - 1; j++) {
				// sắp xếp tăng dần
				// nếu trước > sau => sai vị trí => hoán vị để sau > trước
				if ((opt.strategy(elements[j], elements[j+1])) > 0) {
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	private static void bubbleSortAsc(int[] elements ) {
		for (int round = 0; round < elements.length; round++) { // số round 
			// Tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - round - 1; j++) {
				// sắp xếp tăng dần
				// nếu trước > sau => sai vị trí => hoán vị để sau > trước
				if (elements[j] > elements[j+1]) {
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	private static void bubbleSortDesc(int[] elements ) {
		for (int round = 0; round < elements.length; round++) { // số round 
			// Tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - round - 1; j++) {
				// sắp xếp giảm dần
				// nếu trước < sau -> sai vị trí -> hoán vị để sau < trước
				if (elements[j] < elements[j+1]) {
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
}
