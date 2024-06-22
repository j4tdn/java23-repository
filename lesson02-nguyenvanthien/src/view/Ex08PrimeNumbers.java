package view;

import java.util.Scanner;

public class Ex08PrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Nhap N ");
			String input = scanner.nextLine().trim();

			try {
				int number = Integer.parseInt(input);
				if (number > 1) {
					boolean isPrime = isPrime(number);
					System.out.println(number + (isPrime ? " → true" : " → false"));
				} else {
					System.out.println("loi n phai la so nguyen >1");
				}
			} catch (NumberFormatException e) {
				System.out.println("loi vui long nhap so nguyen duong");
			}
		}

	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}