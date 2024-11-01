package view;

import java.util.Scanner;

public class Ex01OppositeTriangles {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();
		int lastColumn = 2 * n - 1;

		// In phần trên đỉnh của 2 tam giác đối xứng
		for (int row = 1; row <= n - 1; row++) {
			for (int leftTriangle = 1; leftTriangle <= row; leftTriangle++)
				System.out.print(leftTriangle);
			int spaceCounts = 2 * (n - row) - 1;
			for (int space = 1; space <= spaceCounts; space++)
				System.out.print(" ");
			for (int rightTriangle = lastColumn - row + 1; rightTriangle <= lastColumn; rightTriangle++)
				System.out.print(rightTriangle);
			System.out.print("\n");
		}

		// Xác định đỉnh (apex) của 2 tam giác đối xứng
		for (int apex = 1; apex <= lastColumn; apex++)
			System.out.print(apex);
		System.out.println();

		// In phần dưới đỉnh của 2 tam giác đối xứng
		for (int row = n - 1; row >= 1; row--) {
			for (int leftTriangle = 1; leftTriangle <= row; leftTriangle++)
				System.out.print(leftTriangle);
			int spaceCounts = 2 * (n - row) - 1;
			for (int space = 1; space <= spaceCounts; space++)
				System.out.print(" ");
			for (int rightTriangle = lastColumn - row + 1; rightTriangle <= lastColumn; rightTriangle++)
				System.out.print(rightTriangle);
			System.out.print("\n");
		}
	}
}
