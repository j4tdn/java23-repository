package view;

import java.util.Scanner;

public class Ex08PrimeNumber {

	public static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int n = 0;
		boolean isValid = false;
		int count = 0;

		while (!isValid && count < 5) {
			System.out.print("Enter 1 positive integer: ");
			try {
				n = Integer.parseInt(ip.nextLine());
				if (n > 0) {
					isValid = true;
				} else {
					System.out.println("n is not a positive integer. Please re-enter!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Incorrect data type entered! Please re-enter a positive integer!");
			}
			count++;
		}
		if (isValid) {
			System.out.print("-> " + isPrimeNumber(n));
		}
	}
}
