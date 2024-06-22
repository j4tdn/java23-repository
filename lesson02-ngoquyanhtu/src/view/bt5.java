package view;

import java.util.Scanner;

public class bt5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một số: ");
		int a = scanner.nextInt();

		// kiểm tra số có phải là số có 2 chữ số ko
		do {
			System.out.print("Nhập một số có ít nhất 2 chữ số: ");
			a = scanner.nextInt();
		} while (Math.abs(a) < 10);

		scanner.close();
		if (isPalindrome(a)) {
			System.out.println(a + " là số đối xứng.");
		} else {
			System.out.println(a + " không phải là số đối xứng.");
		}
	}
	public static boolean isPalindrome(int a) {
		int original = a;
		int reversed = 0;

		// Đảo ngược số
		while (a != 0) {
			int digit = a % 10;
			reversed = reversed * 10 + digit;
			a /= 10;
		}

		// So sánh số ban đầu và số đã đảo ngược
		return original == reversed;
	}
}
