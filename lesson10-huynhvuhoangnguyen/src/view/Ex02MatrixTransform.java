package view;

public class Ex02MatrixTransform {

	public static void main(String[] args) {
		
		int[][] matrix1 = {
				{1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {1, 9, 0, 9},
	            {2, 9, 6, 5},
	            {1, 2, 4, 5}
		};
		
		System.out.println("\nMa trận trước khi biến đổi (input 1): ");
		printMatrix(matrix1);
		
		transformMatrix(matrix1);
		System.out.println("\nMa trận sau khi được chuyển đổi (input 1): ");
		printMatrix(matrix1);
		
		int [][] matrix2 = {
				{1, 2, 3, 4},
	            {5, 0, 8, 7},
	            {1, 9, 0, 9},
	            {2, 0, 6, 5},
	            {1, 2, 4, 5}
		};
		
		System.out.println("\nMa trận trước khi biến đổi (input 2): ");
		printMatrix(matrix2);
		transformMatrix(matrix2);
		System.out.println("\nMa trận sau khi được chuyển đổi (input 2): ");
		printMatrix(matrix2);
		
	}
	
	private static void transformMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		// các mảng đánh dấu các hàng và cột chưa số 0
		boolean[] zeroRows = new boolean[rows];
		boolean[] zeroCols = new boolean[cols];
		
		// đánh dấu các hàng và cột chưa số 0
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(matrix[i][j] == 0) {
					zeroRows[i] = true;
					zeroCols[j] = true;
				}
			}
		}
		
		// chuyển các hàng và cột đã đánh dấu về giá trị 0
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j ++) {
				if(zeroRows[i] || zeroCols[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		
	}
	
	private static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
}