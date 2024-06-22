package view;

import java.util.Scanner;

public class Ex02PowerOf2 {

	public static boolean checkPowerOf2(int n) {
		if (n == 0 || n == 1) {
			return true;
		}
		int x = n / 2;
		int y = n % 2;
		if (y == 1) {
			return false;
		}
		return checkPowerOf2(x);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = 0;
		boolean isValid = false;
		int count = 0;

		while (!isValid && count < 5) {
			System.out.println("Enter 1 positive integer: ");
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
			if (checkPowerOf2(n)) {
				System.out.println("-> " + n + " is a power of 2");
			} else {
				System.out.println("-> " + n + " is not a power of 2");
			}
		} else {
			return;
		}
	}
}
