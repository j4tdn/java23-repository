package sorting.bubble;

import java.util.Arrays;

import functional.IntSort;

public class Ex01BubbleSortInt {

	public static void main(String[] args) {
		
		int[] elements = {1, 5, 9, 4, 6, 11};
		
		System.out.println("Elements --> " + Arrays.toString(elements));
		
		System.out.println("\nStrategy Pattern\n");
		
		bubbleSort(elements, (a, b) -> {
			/*
			 if ( a > b ) {
			 	return 1;
			 }
			 return -1;
			 */
			return a - b; // viết gọn hơn
			});
		
		System.out.println("Elements(ASC) --> " + Arrays.toString(elements));
		
		bubbleSort(elements, (a, b) -> {
			return b - a;
			});
		
	// 	bubbleSort(elements, (a, b) -> a < b);  -> cách boolean nhưng trong java ít dùng
		System.out.println("Elements(DESC) --> " + Arrays.toString(elements));
	}
	
	
	private static void bubbleSort(int[] elements, IntSort intSort) {
		// duyệt từng round
		for (int i = 0; i < elements.length; i++) { // i = số round
			// tìm phần tử lớn nhất trong mỗi round
			for (int j = 0; j < elements.length - i - 1; j++) {
				// Chỉ hoán vị khi kết quả Strategy > 0
				if (intSort.strategy(elements[j], elements[j+1]) > 0) {
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
}
