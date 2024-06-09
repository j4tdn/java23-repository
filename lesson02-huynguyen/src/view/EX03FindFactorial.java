package view;

import java.util.Scanner;

public class EX03FindFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter N: ");
		int n = sc.nextInt();

		long resul = Factorial(n);
		System.out.println(n + "!= " + resul);
	}

	private static long Factorial(int n) {
		long sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
}
