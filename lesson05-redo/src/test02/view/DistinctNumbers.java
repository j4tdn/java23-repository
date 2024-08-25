package test02.view;

import java.util.Arrays;

public class DistinctNumbers {

	public static void main(String[] args) {
		// int[] a = {1, 5, 8, 9, 2, 5, 9}
		// KHÔNG TRÙNG NHAU
		// unique  --> 1, 8 , 2 --> chỉ lấy những ptu xuất hiện 1 lần
		// distinct --> 1, 5 ,8 ,9 , 2 // loại bỏ những phần tử trùng, những ptu trùng chỉ lấy 1 ptu
		int[] a = {1, 5, 5, 8, 9, 2, 5, 9};	
		
		int[] distinctNumbers = distinct(a);
		System.out.println("Distinct Numbers-- >"  + Arrays.toString(distinctNumbers));
		// tim min
		// tim max
		// duyet cac phan tu kiem tra !min !max -> sum
	}
	// storage(length) {0,0,0,0,0,0,0,0};
	private static int[] distinct(int[] elements) {
		int[] result = new int[elements.length];
		int count = 0;
		
		for (int element: elements) {
			if (!isExists(element, result, count)) {
				result[count++] = element;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static boolean isExists(int newValue, int[] elements, int nofRealValues) {
		for (int i = 0; i < nofRealValues; i++) {
			if ( newValue == elements[i]) {
				return true;
			}
		}
		return false;
	}
	
}
