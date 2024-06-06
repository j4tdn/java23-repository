package view;

import java.util.Scanner;

public class Ex03Factorial {
	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static int getValidInput () {
		Scanner ip = new Scanner(System.in);
		while (true) {
			System.out.println("Input a positive integer N: ");
			try {
				int n = Integer.parseInt(ip.nextLine());
				if (n > 0) {
					 ip.close();
					return n;
				} else {
					System.out.println("Input is not a positive integer. Please try again.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a Positive Integer.");
			}
		}
	}

	public static void main(String[] args) {
		int n = -1;
		if (n == -1) {
			n = getValidInput();
		}

		long factorialResult = factorial(n);
		System.out.println("Factorial of " + n + " is: " + factorialResult);

	}

}