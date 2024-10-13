package sorting.quick;

import java.util.Arrays;

public class Ex01SortingInt {

	/*
	 Trong Java, sắp xếp với Arrays sử dụng
	 
	 + Arrays.sort(int[]) - tham số là mảng của KDL nguyên thủy
	 					  - chỉ hỗ trợ sắp xếp tăng dần
	 					  
	 */
	
	public static void main(String[] args) {

		int[] elemnts = { 1, 8, 2, 18, 7, 33 };

		System.out.println("origin --> " + Arrays.toString(elemnts));

		Arrays.sort(elemnts); //default ascending
		reverse(elemnts);	  // reverse
		
		System.out.println("\nsorted Desc --> " + Arrays.toString(elemnts));

	}

	private static void reverse(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = elements[i];
			elements[i] = elements[length - i - 1];
			elements[length - i - 1] = temp;
		}
	}
	
}
