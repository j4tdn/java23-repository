package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };

		System.out.println("Ma trận ban đầu:");
		printMatrix(matrix);
		
		transformMatrix(matrix);
		
		System.out.println("Ma trận sau khi chuyển đổi:");
		printMatrix(matrix);
	}
	// chuyển đổi ma trận
	public static void transformMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		// đánh dấu 0
		boolean[] rowZero = new boolean[rows];
		boolean[] colZero = new boolean[cols];
		// find cột và hàng để kím 0
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					rowZero[i] = true;
					colZero[j] = true;
				}
			}
		}
		// đặt các phần tử trong hàng có 0 về 0
		for (int i = 0; i < rows; i++) {
			if (rowZero[i]) {
				for (int j = 0; j < cols; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		// cột
		for (int j = 0; j < cols; j++) {
			if (colZero[j]) {
				for (int i = 0; i < rows; i++) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}
}