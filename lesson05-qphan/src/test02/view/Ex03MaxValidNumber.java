package test02.view;

import java.util.Arrays;

public class Ex03MaxValidNumber {
	
	public static void main(String[] args) {
		String s = "12abu02muzk586cyx";
		// String s = "Uyk892nn1234uxo253";
		
		// B1: Tìm danh sách các số hợp lệ
		System.out.println("Số nguyên hợp lệ --> " + Arrays.toString(getValidNumbers(s)));
		System.out.println("Số nguyên hợp lệ --> " + Arrays.toString(getValidNumbersAdv(s)));
		
		// B2: Tìm số lớn nhất
		System.out.println("Số lớn nhất --> " + max(getValidNumbers(s)));
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
	
	private static int[] getValidNumbers(String s) {
		int[] validNumbers = new int[s.length()];
		int count = 0;
		
		// vị trí đánh dấu khi xuất hiện kí tự số
		// nếu -1 chưa được đánh dấu phát hiện số
		//     !-1 --> đã đánh dấu cho lần tiếp theo
		int start = -1; 
		
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (Character.isDigit(letter)) {
				if (start == -1) {
					start = i;
				}
				
				// gặp kí tự cuối cùng là số
				if (i == s.length() - 1) {
					String digits = s.substring(start); // [start, length)
					validNumbers[count++] = Integer.parseInt(digits);
				}
			} else {
				if (start != -1) {
					String digits = s.substring(start, i);
					validNumbers[count++] = Integer.parseInt(digits);
					start = -1;
				}
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, count);
	}
	
}
