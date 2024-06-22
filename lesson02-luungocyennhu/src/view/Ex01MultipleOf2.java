package view;

import java.util.Scanner;

public class Ex01MultipleOf2 {

	public static boolean checkMultipleOf2(int n) {
		return n % 2 == 0;
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
			if (checkMultipleOf2(n)) {
				System.out.println("-> " + n + " is a multiple of 2");
			} else {
				System.out.println("-> " + n + " is not a multiple of 2");
			}
		} else {
			return;
		}
	}
}
