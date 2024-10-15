package view;

public class Ex02MatrixZeroTransform {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		setZeroes(matrix);

		System.out.println("\nTransformed Matrix:");
		printMatrix(matrix);
	}


	public static void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean[] zeroRows = new boolean[rows];
		boolean[] zeroCols = new boolean[cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					zeroRows[i] = true;
					zeroCols[j] = true;
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			if (zeroRows[i]) {
				for (int j = 0; j < cols; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int j = 0; j < cols; j++) {
			if (zeroCols[j]) {
				for (int i = 0; i < rows; i++) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
