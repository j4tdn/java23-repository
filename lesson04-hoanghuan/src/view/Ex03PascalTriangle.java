package view;

import java.util.Scanner;

public class Ex03PascalTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong hang cua tam giac Pascal: ");
		int n = scanner.nextInt();

		int[][] pascal = new int[n + 1][n + 1];

		for (int i = 0; i <= n; i++) {
			pascal[i][0] = 1;
			pascal[i][i] = 1;
			for (int j = 1; j < i; j++) {
				pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
			}
		}

		for (int i = 0; i <= n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal[i][j] + "   ");
			}
			System.out.println();
		}
	}
}