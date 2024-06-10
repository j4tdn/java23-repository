package view;

import java.util.Scanner;

public class Ex09PrimeNumberPosition {
	public static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while (count != 200) {
			if (isPrimeNumber(i)) {
				count++;
			}
			i++;
		}
		System.out.println("200th prime number -> " + (i - 1));
	}
}
