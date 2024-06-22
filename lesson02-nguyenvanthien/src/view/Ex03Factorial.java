package view;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("nhap n la so nguyen duong");
			int N = scanner.nextInt();

			if (N >= 0) {
				long factorial = factorial(N);
				System.out.println(N + "! = " + factorial);
			} else {
				System.out.println("loi n khong phai la so nguyen duong");
			}
		}
	}

	// de qui
	public static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}