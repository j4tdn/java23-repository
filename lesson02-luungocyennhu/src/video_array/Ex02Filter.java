package video_array;

import java.util.Arrays;

/*
	1. Tìm phần tử lẻ trong mảng số nguyên
	   Input: Mảng
	   Output: Mảng số lẻ
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = { 23, 25, 16, 33, 66 };
		int[] oddNumbers = findOddNumber(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	// int[] elements = numbers;
	private static int[] findOddNumber(int[] elements) {
		// index: 0 1 2 3 4
		// value: 0 0 0 0 0
		// alt shift R: sửa tên biến
		
		int[] oddElements = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				oddElements[count] = element;
				count++;
			}
		}
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = oddElements[i];
		}
		return result;
	}
}