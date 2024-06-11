package view;

import java.util.Scanner;

public class Ex05SymmetryNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Nhap n ");
			String input = scanner.nextLine().trim();

			try {
				int number = Integer.parseInt(input);
				if (number < 10) {
					System.out.println("loi n la so nguyen duong 2 chu so");
				} else if (isPalindrome(number)) {
					System.out.println("true - So " + number + " la so doi xung");
				} else {
					System.out.println("false - So " + number + " khong phai la so doi xung");
				}
			} catch (NumberFormatException e) {
				System.out.println("loi vui long nhap so nguyen");
			}
		}

	}

	public static boolean isPalindrome(int n) {
		int original = n;
		int reversed = 0;

		while (n > 0) {
			reversed = reversed * 10 + n % 10;
			n /= 10;
		}

		return original == reversed;
	}
}
