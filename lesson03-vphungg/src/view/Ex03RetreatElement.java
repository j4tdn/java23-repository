package view;

public class Ex03RetreatElement {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		int[][] matrix = {
				{47, 47, 36}, // matrix[0]
				{23, 43, 31}, // matrix[1]
				{46, 7, 29}   // matrix[2]
		};
		
		generate(matrix);
		
		System.out.println("Saddle Point --> " + getSaddlePoint(matrix));
		
	}
	
	private static int getSaddlePoint(int[][] matrix) {
		int saddlePoint = -1;
		forOut:
		for (int rowI = 0; rowI < matrix.length; rowI++) {
			for (int colI = 0; colI < matrix[rowI].length; colI++) {
				int element = matrix[rowI][colI];
				if(minRow(element, rowI, matrix) && maxCol(element, colI, matrix)) {
					saddlePoint = element;
					break forOut;
					}
			}
		}
		return saddlePoint;
	}
	
	private static boolean maxCol(int checkElement, int colI, int[][] matrix) {
		for (int rowI = 0; rowI < matrix.length; rowI++) {
			if (matrix[rowI][colI] > checkElement) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean minRow(int checkElement, int rowI, int[][] matrix) {
		int[] rowIElements = matrix[rowI];
		for (int rowIElement: rowIElements) {
			if (rowIElement < checkElement) {
				return false;
			}
		}
		return true;
	}
	
	private static void generate(int[][] matrix) {
		for (int rowI = 0; rowI < matrix.length; rowI++) {
			for (int colI = 0; colI < matrix[rowI].length; colI++) {
				System.out.printf("%-3d", matrix[rowI][colI]);
			}
			System.out.println();
		}
			
	}
	
}
