package sorting.bubble;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01BubbleSortInt {
	 // là tt sắp xếp đơn giản nhất bằng cách lặp đi lặp lại quá trình hoán vị swapping, không phù hợp với dữ liệu lớn, 
	public static void main(String[] args) {
		int [] elements = {1, 5, 9, 4, 11, 6};
	System.out.println("Element -->  " + Arrays.toString(elements) );
		bubbleSort(elements, (a,b) -> {
			
			return a - b;
		});
		System.out.println("Element(ASC) -->  " + Arrays.toString(elements) );
		bubbleSort(elements, (a,b) -> {
			
			return b - a;
		});
		System.out.println("Element(DESC) -->  " + Arrays.toString(elements) );
	}
	private static void bubbleSort(int [] elements, IntComparator intComp) {
		for(int i = 0; i < elements.length; i ++) {
			// tim max cua moi round
			for(int j = 0; j < elements.length - i -1; j ++) {
				if(intComp.strategy(elements[j], elements[j + 1]) > 0) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}
	
	private static void bubbleSortASC(int [] element) {
		for(int i = 0; i < element.length; i++) {
			for (int j = 0 ; j < element.length - i - 1; j++) {
				// săps xếp tang dần
				// Nếu j > j + 1 chưa đúng vị trí thì hoán vị
				// Giảm dần thì ngược lại
				if(element[j] < element[j + 1]) {
					int temp = element[j];
					element[j] = element[j + 1];
					element[j + 1 ] = temp;
				}
			}
		}
	}
}
