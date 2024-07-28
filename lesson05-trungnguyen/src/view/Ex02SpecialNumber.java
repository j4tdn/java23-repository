package view;

import java.util.Scanner;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		System.out.println("Số có phải là số đặc biệt không: " + isSpecialNumber(15));
	}
	private static boolean isSpecialNumber(int number) {
		int sum = 0;
		int count = 1;
		while(sum <= number) {
			if (sum == number) return true;
			else sum += count;
//			System.out.println("sum: " + sum);
			count++;
		}
		return false;
	}
}
