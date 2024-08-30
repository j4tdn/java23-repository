package test02.view;

import java.util.Arrays;

public class Ex03MaxValidNumber {

	public static void main(String[] args) {
		
		String s = "12abu02muzk586cyz";
		
		// B1: Tìm danh sách các số hợp lệ
		System.out.println("Số nguyên hợp lệ --> " + Arrays.toString(getValidNumbersAdv(s)));
		
		// B2: Tìm số lớn nhất
		System.out.println("Số lớn nhất --> " + max(getValidNumbersAdv(s)));
		
	}
	
	private static int max(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int number: numbers) {
			if (max < number) {
				max = number;
			}
		}
		return max;
	}
	
	private static int[] getValidNumbersAdv(String s) {
		String[] tokens = s.split("[a-zA-Z]{1,}");
		
		int[] numbers = new int[tokens.length];
		int count = 0;
		
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].length() != 0) {
				numbers[count++] = Integer.parseInt(tokens[i]);
			}
		}
		return Arrays.copyOfRange(numbers, 0, count);
	}
	
}
