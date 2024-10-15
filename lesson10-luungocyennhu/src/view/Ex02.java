package view;

public class Ex02 {

	public static void main(String[] args) {
		int[][] mt = {
	            {1, 2, 3, 4},
	            {5, 0, 8, 7},
	            {1, 9, 0, 9},
	            {2, 0, 6, 5},
	            {1, 2, 4, 5}
	        };
		
		printf("\nMa trận", mt);
		zeroMatrix(mt);
		printf("\nChuyển đổi ma trận", mt);
	}
	
	private static void printf(String prefix, int[][] mt) {
		System.out.println(prefix + " --> ");
		for(int[] row : mt) {
			for(int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
	private static void zeroMatrix(int[][] mt) {
		int row = mt.length;
		int col = mt[0].length;
		
		boolean[] zeroRow = new boolean[row];
		boolean[] zeroCol = new boolean[col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(mt[i][j] == 0) {
					zeroRow[i] = true;
					zeroCol[j] = true;
				}
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j ++) {
				if(zeroRow[i] || zeroCol[j]) {
					mt[i][j] = 0;
				}
			}
		}
	}
}
