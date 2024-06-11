package view;

import java.util.Scanner;

public class Ex01Power {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxAttempts = 5;
		int attempts = 0;

		while (true) {
			System.out.print("Nhập N (số nguyên dương): ");
			String input = scanner.nextLine().trim();

			try {
				int N = Integer.parseInt(input);
				if (N > 0) {
					boolean isMultipleOfTwo = N % 2 == 0;
					System.out.println(isMultipleOfTwo ? "true" : "false");
					attempts = 0;
				} else {
					System.out.println("loi :khong phai la so nguyen");
				}
			} catch (NumberFormatException e) {
				System.out.println("loi :vui long nhap so nguyen");
				attempts++;
				if (attempts >= maxAttempts) {
					System.out.println("nhap sai qua 5 lan");
					break;
				}
			}
		}
		scanner.close();
	}
}