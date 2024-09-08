package test02.view;

import java.util.Arrays;

public class Ex04DistinctNumbers {

	public static void main(String[] args) {
		
		// int[] a = {1, 5, 8, 9, 2, 5, 9}
		
		// KHÔNG TRÙNG NHAU
		
		// unique --> 1 8 2 --> chỉ lấy những phần tử xuất hiện 1 lần
		// distinct --> 1 5 8 9 2 --> loại bỏ những phần tử trùng, 
		// những ptử trùng chỉ lấy 1 ptử
		 
		int[] a = {1, 5, 8, 9, 2, 5, 9};
		int[] dinstictNumbers = dinstict(a);
		System.out.println("Dinstict Numbers --> " + Arrays.toString(dinstictNumbers));
		
		// Tìm min
		// Tìm max
		// Duyệt các phần tử kiểm tra !min !max --> sum
		
	}
	
	// result(leghth) {0, 0, 0, 0, 0, 0, 0, 0}
	
	private static int[] dinstict(int[] elements) {
		int[] result = new int[elements.length];
		int count = 0;
		
		for (int element: elements) {
			if (!isPresent(element, result, count)) {
				result[count++] = element;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static boolean isPresent(int newValue, int[] elements, int nofRealValues) {
		for (int i = 0; i < nofRealValues; i ++) {
			if (newValue == elements[i]) {
				return true;
			}
		}
		return false;
	}
	
	
}
