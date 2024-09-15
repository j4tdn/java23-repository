package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		String n1 = "01a2b3456cde478";
		String n2 = "aa6b546c6e22h, aa6b326c6e22h";

		System.out.println("n1 --> " + n1);
		System.out.println("n2 --> " + n2);
		
		System.out.println("\nSố lớn nhất n1 --> " + max(getLargestumbers(n1)));
		System.out.println("Số lớn nhất n2 --> " + max(getLargestumbers(n2)));
	}
	
	private static int[] getLargestumbers(String s) {
		int[] num = new int[s.length()];
		int count = 0;
		int start = -1; 
		
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (Character.isDigit(letter)) {
				if (start == -1) {
					start = i;
				}

				if (i == s.length() - 1) {
					String digits = s.substring(start); 
					num[count++] = Integer.parseInt(digits);
				}
			} else {
				if (start != -1) {
					String digits = s.substring(start, i);
					num[count++] = Integer.parseInt(digits);
					start = -1;
				}
			}
		}
		return Arrays.copyOfRange(num, 0, count);
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
}
