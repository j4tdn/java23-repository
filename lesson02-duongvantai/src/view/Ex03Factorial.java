package view;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter number N= ");
		int n = x.nextInt();
		System.out.println(n + "!" + " = " + factorial(n));
	}
	private static int factorial(int n) {
		int  result = 1;
		for(int i = 1; i <= n ; i++) {
			result *= i;
		}
		return result;
	}
}
