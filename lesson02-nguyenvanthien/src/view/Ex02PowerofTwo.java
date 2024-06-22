package view;

import java.util.Scanner;

public class Ex02PowerofTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxAttempts = 5;
		int attempts = 0;

		while (attempts < maxAttempts) {
			System.out.print("Nhập N (số nguyên dương): ");
			String input = scanner.nextLine().trim();
			attempts++;

			try {
				int N = Integer.parseInt(input);
				if (N > 0) {
					boolean isPowerOfTwo = (N & (N - 1)) == 0;
					System.out.println(isPowerOfTwo ? "true" : "false");
				} else {
					System.out.println("loi khong phai la so nguyen duong");
				}
			} catch (NumberFormatException e) {
				System.out.println("loi vui long nhap so nguyen");
			}

			if (attempts == maxAttempts) {
				System.out.println("ban nhap qua 5 lan chuong trinh ket thuc");
				break;
			}
		}
		scanner.close();
	}
}
