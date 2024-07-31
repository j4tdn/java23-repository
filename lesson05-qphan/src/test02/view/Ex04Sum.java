package test02.view;

import java.util.Arrays;

public class Ex04Sum {
	
	public static void main(String[] args) {
		// int[] a = {1, 5, 8, 9, 2, 5, 9}
		
		// KHÔNG TRÙNG NHAU
		
		// unique   --> 1 8 2     --> chỉ lấy những ptu xuất hiện 1 lần
		// distinct --> 1 5 8 9 2 --> loại bỏ những phần tử trùng, những ptu trùng chỉ lấy 1 pt
		
		int[] a = {1, 5, 5, 6, 9, 2, 5, 9};
		
		int[] distinctNumbers = dinstict(a);
		
		System.out.println("Distinct Numbers --> " + Arrays.toString(distinctNumbers));
		
		// Tìm min
		// Tìm max
		// Duyệt các phần tử kiểm tra !min !max --> sum
	}
	
	// result(length) {0, 0, 0, 0, 0, 0, 0, 0}
	
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
		for (int i = 0; i < nofRealValues; i++) {
			if (newValue == elements[i]) {
				return true;
			}
		}
		return false;
	}
	
}
