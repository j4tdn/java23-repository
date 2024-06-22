package view;

import java.util.Scanner;

public class Ex03Factorial {
	public static int factorialOfn(int n) {
		int s = 1;
		for(int i = 1; i <= n; i++) {
			s = s*i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean isValid = false;
		int n = 0;

		while (!isValid) {
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
		}
		if(isValid) {
			System.out.println("Giai thừa của " + n + " là: " + factorialOfn(n));
		}
	}
}
