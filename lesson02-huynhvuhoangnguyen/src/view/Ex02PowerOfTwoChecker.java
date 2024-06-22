package view;

import java.util.Scanner;

public class Ex02PowerOfTwoChecker {

	public static boolean isPowerOfTwo(int n) {
		return (n > 0) && ((n & (n-1)) == 0);
	}

	public static int getValidInput() {
		Scanner ip = new Scanner(System.in);
		int attempts = 0;

		while (attempts < 5) {
			System.out.println("Input positive integer N:");
			try {
				int n = Integer.parseInt(ip.nextLine());
				if (n > 0) {
					return n;
				} else {
					System.out.println("Input is not a positive integer. Please try again.");
				} 
			} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter an Integer.");
			}
			attempts++;
		}
		ip.close();
		System.out.println("You have exceeded the maximum of 5 attempts. The program will terminate!");
		return -1;
	}

	public static void main(String[] args) {
		int n = getValidInput();
		if (n != -1) {
			if (isPowerOfTwo(n)) {
				System.out.println(n + " is power of 2.");
			} else {
				System.out.println(n + " is not power of 2.");
			}
		}
	}
}
