package view;

import java.util.Scanner;

public class Ex05SymmetricalNumber {
	
	public static boolean isSymmetricalNumber(int n) {
		int reversed = 0;
		int original = n;

		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n = n / 10;
		}
		return original == reversed;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean isValid = false;
		int n = 0;

		while (!isValid) {
			System.out.println("Enter a positive integer with 2 or more digits: ");
			try {
				n = Integer.parseInt(ip.nextLine());
				String num = Integer.toString(n);
				if (n > 0 && num.length() > 2) {
					isValid = true;
				} else {
					System.out.println("n is not a positive integer or n is not a number with 2 or more digits. Please re-enter!\n");
				}
			} catch (NumberFormatException e) {
				System.out.println("Incorrect data type entered! Please re-enter a positive integer!\n");
			}
		}
		if (isValid) {
			if (isSymmetricalNumber(n)) {
				System.out.println(n + " is a symmetric number");
			} else {
				System.out.println(n + " is not a symmetric number");
			}
		}
	}
}
