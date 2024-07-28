package view;

import java.util.Scanner;

public class Ex02SpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		if (isSpecialNumber(n)) {
			System.out.println("That is special number");
		} else {
			System.out.println("That is not special number");

		}
	}

	private static boolean isSpecialNumber(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
			if (sum == n) {
				return true;
			}
		}
		return false;
	}
}
