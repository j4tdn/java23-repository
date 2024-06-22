package view;

import java.util.Scanner;

public class Ex03FactorialCalculator {
	public static void main(String[] args) {
		int number = getValidInteger();
		printFactorialCalculation(number);
	}

	private static int getValidInteger() {
		Scanner ip = new Scanner(System.in);

		String numberAsText = "";
		int number = 0;
		int incorrectInputAmount = 0;

		do {
			System.out.print("Enter your number: ");
			numberAsText = ip.nextLine();
			if (numberAsText.matches("\\d+")) {
				number = Integer.parseInt(numberAsText);
				return number;
			}

			incorrectInputAmount++;
			if (incorrectInputAmount == 5) {
				System.out.println("Wrong input 5 times");
				System.out.println("Exit");
				System.exit(0);

			}

		} while (true);
	}

	private static void printFactorialCalculation(int n) {
		System.out.print(n + "! = ");
		for (int i = n; i >= 1; i--) {
			System.out.print(i);
			if (i != 1) {
				System.out.print(" * ");
			}
		}
		System.out.println(" = " + calculateFactorial(n));
	}

	private static long calculateFactorial(int n) {
		if (n == 1) {
			System.out.println("1! = 1");
			return 1;
		}
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;

	}
}
