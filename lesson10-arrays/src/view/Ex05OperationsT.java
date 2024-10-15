package view;

import java.util.Arrays;

import functional.IntTest;

public class Ex05OperationsT {
	/*
	 * cho mảng gồm n phần tử:
	 * 
	 * Viết ct: + Tìm chẵn + Tìm bội 5 + Tìm số nguyên
	 */

	public static void main(String[] args) {
		int[] numbers = { 0, 20, 50, 13, 12, 28, 77, 66, 29, 30 };

		System.out.println("Số chẵn: " + Arrays.toString(getNumbers(numbers, a -> a % 2 == 0)));
		System.out.println("Bội của 5: " + Arrays.toString(getNumbers(numbers, a -> a % 5 == 0)));
		System.out.println("Số nguyên: " + Arrays.toString(getNumbers(numbers, a -> isPrime(a))));

	}

	private static int[] getNumbers(int[] numbers, IntTest intTest) {
		int[] target = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (intTest.strategy(number)) {
				target[count++] = number;
			}
		}

		return Arrays.copyOfRange(target, 0, count);
	}

	private static boolean isPrime(int number) {
		if (number >= 3) {
			for (int i = 2; i < Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
