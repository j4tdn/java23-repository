package view;

import java.util.Scanner;

public class EX08Prime {
	public static void main(String[] args) {
		checkInt();
	}

	private static void checkInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int cou = 1;
		do {
			String n = sc.nextLine();
			if (checkNumber(n)) {
				if (checkPrime(Integer.parseInt(n))) {
					System.out.println(n + " is a prime");
					break;
				} else {
					System.out.println(n + " is not a prime");
					break;

				}
			} else {
				cou++;
				System.out.println("Re-enter");
			}
		} while (cou <= 5);
	}

	private static boolean checkPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean checkNumber(String n) {
		try {
			int i = Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
