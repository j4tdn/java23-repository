package sorting.bubble;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01BubbleSortInt {
	
	public static void main(String[] args) {
		
		// Tăng ascending: ASC
		// Giảm descending: DESC
		
		int[] elements = {1, 5, 9, 4, 6, 11};
		
		System.out.println("Elements --> " + Arrays.toString(elements));
		
		// tăng dần
		// bubbleSortAsc(elements);
		bubbleSort(elements, (n1, n2) -> {
//			if (n1 > n2) {
//				return 1; // số dương
//			}
//			return -1;
			return n1 - n2;
		});
		
		System.out.println("\nElements(ASC) --> " + Arrays.toString(elements));
		
		// giảm dần
		// bubbleSortDesc(elements);
		bubbleSort(elements, (n1, n2) -> {
//			if (n1 < n2) {
//				return 1; // số dương
//			}
//			return -1;
			return n2 - n1;
		});
		
		System.out.println("\nElements(DESC) --> " + Arrays.toString(elements));
	}
	
	// elements[j] > elements[j+1] --> elements[j] - elements[j+1] > 0
	// elements[j] < elements[j+1] --> elements[j] - elements[j+1] < 0
	
	// boolean strategy(elements[j], elements[j+1])
	
	private static void bubbleSort(int[] elements, IntComparator intComp) {
		//  duyệt từng round
		for (int i = 0; i < elements.length; i ++) {
			// tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Muốn hoán vị thì kết quả của strategy(T, S) phải > 0
				if (intComp.strategy(elements[j], elements[j+1]) > 0) {
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	
	private static void bubbleSortAsc(int[] elements) {
		//  duyệt từng round
		for (int i = 0; i < elements.length; i ++) {
			// tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Sắp xếp tăng dần
				// Nếu trước > sau chưa đúng vị trí --> hoán vị để sau lớn hơn trước
				if (elements[j] > elements[j+1]) {
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	
	private static void bubbleSortDesc(int[] elements) {
		//  duyệt từng round
		for (int i = 0; i < elements.length; i ++) {
			// tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Sắp xếp tăng dần
				// Nếu trước < sau chưa đúng vị trí --> hoán vị để sau bé hơn trước
				if (elements[j] < elements[j+1]) {
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	
}
