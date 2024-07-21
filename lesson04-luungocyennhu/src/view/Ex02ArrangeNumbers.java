package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02ArrangeNumbers {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner ip = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter n (5 <= n <= 100): ");
			n = Integer.parseInt(ip.nextLine());
		} while (n < 5 || n > 100);

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(1, 201);  // giới hạn cho dễ test
		}
		
		System.out.println("\nArrays:");
		for(int a: arr) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("\nArrange numbers: ");
		arrangeNumbers(arr);
		for(int a: arr) {
			System.out.print(a + " ");
		}
	}

	private static void arrangeNumbers(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n - 1;

		for (int i = 0; i <= right; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				swap(arr, i, left);
				left++;
			}
		}

		for (int i = right; i >= left; i--) {
			if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				swap(arr, i, right);
				right--;
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
