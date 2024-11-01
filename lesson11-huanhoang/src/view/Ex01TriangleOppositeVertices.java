package view;

import java.util.Scanner;

public class Ex01TriangleOppositeVertices {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = scanner.nextInt();
		int max = 2 * n - 1;

		for (int row = 1; row < n; row++) {
			for (int num = 1; num <= row; num++) {
				System.out.print(num + " ");
			}

			int spaceCount = 2 * (n - row) - 1;
			for (int space = 1; space <= spaceCount; space++) {
				System.out.print("  ");
			}

			for (int num = max - row + 1; num <= max; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		for (int num = 1; num <= max; num++) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int lowerRow = n - 1; lowerRow >= 1; lowerRow--) {
			for (int num = 1; num <= lowerRow; num++) {
				System.out.print(num + " ");
			}

			int lowerSpaceCount = 2 * (n - lowerRow) - 1;
			for (int lowerSpace = 1; lowerSpace <= lowerSpaceCount; lowerSpace++) {
				System.out.print("  ");
			}

			for (int num = max - lowerRow + 1; num <= max; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
