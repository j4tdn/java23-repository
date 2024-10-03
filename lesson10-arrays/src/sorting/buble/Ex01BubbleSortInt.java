package sorting.buble;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01BubbleSortInt {

	public static void main(String[] args) {

		int[] elements = { 1, 5, 9, 4, 6, 11 };

		System.out.println("Elements --> " + Arrays.toString(elements));

		// tăng dần

		bubbleSort(elements, (n1, n2) -> {
//			if(n1 > n2) {
//				return 1; // số dương
//			}
//			return -1;
			return n1 - n2;
		});

		System.out.println("\nElements(ASC) --> " + Arrays.toString(elements));

		// giảm dần

		bubbleSort(elements, (n1, n2) -> n2 - n1);
//			if(n1 < n2) {
//				return 1;
//			}
//			return -1; // số dương
//		});

		System.out.println("\nElements(DESC) --> " + Arrays.toString(elements));
	}

	// elements[j] > elements[j + 1] --> elements[j] - elements[j + 1] > 0
	// elements[j] < elements[j + 1] --> elements[j] - elements[j + 1] < 0
	// boolean strategy(elements[j], elements[j + 1])

	private static void bubbleSort(int[] elements, IntComparator intComp) {
		// Duyệt từng round
		for (int i = 0; i < elements.length; i++) {
			// Tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Muốn hoán vị thì strategy(T,S) > 0
				if (intComp.strategy(elements[j], elements[j + 1]) > 0) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}

//	private static void bubbleSortAsc(int[] elements) {
//		// Duyệt từng round
//		for(int i = 0; i < elements.length; i++) {
//			// Tìm phần tử lớn nhất trong mỗi round
//			for(int j = 0; j < elements.length - i - 1; j++) {
//				// Sắp xết tăng dần
//				// Nếu trước > sau -> chưa đúng vị trí --> hoán vị để sau lớn hơn trước
//				if(elements[j] > elements[j + 1]) {
//					int temp = elements[j];
//					elements[j] = elements[j + 1];
//					elements[j + 1] = temp;
//				}
//			}
//		}
//	}
//	
//	private static void bubbleSortDesc(int[] elements) {
//		// Duyệt từng round
//		for(int i = 0; i < elements.length; i++) {
//			// Tìm phần tử lớn nhất trong mỗi round
//			for(int j = 0; j < elements.length - i - 1; j++) {
//				// Sắp xết giảm dần
//				// Nếu trước < sau -> chưa đúng vị trí --> hoán vị để sau bé hơn trước
//				if(elements[j] < elements[j + 1]) {
//					int temp = elements[j];
//					elements[j] = elements[j + 1];
//					elements[j + 1] = temp;
//				}
//			}
//		}
//	}

}