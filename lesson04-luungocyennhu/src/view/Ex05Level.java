package view;

import java.util.Random;
import java.util.Scanner;

public class Ex05Level {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner ip = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter n (3 <= n <= 20): ");
			n = Integer.parseInt(ip.nextLine());
		} while (n < 3 || n > 20);

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(1, 201); // giới hạn cho dễ test
		}

		System.out.println("\nArrays:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		System.out.println("\nArrange numbers: ");
		arrangeNumbers(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	private static int countPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	private static int[] arrangeNumbers(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (countPrime(arr[i]) > countPrime(arr[j])) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
