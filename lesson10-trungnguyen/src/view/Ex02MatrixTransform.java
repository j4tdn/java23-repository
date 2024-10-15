package view;

public class Ex02MatrixTransform {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 },
				   { 5, 6, 8, 7 },
				   { 1, 9, 0, 9 },
				   { 2, 9, 6, 5 },
				   { 1, 2, 4, 5 } };
		for (int i = 0; i < matrix.length; i++)
		  {
		    for (int j = 0; j < matrix[i].length; j++)
		    {
			System.out.print( matrix[i][j]  + "\t");
		     }
		     System.out.println();
		   }
		transform: 
			
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					for (int m = 0; m < matrix.length; m++) {
						matrix[m][j] =0;
					}
					for (int n = 0; n < matrix[i].length; n++) {
						matrix[i][n] = 0;
					}
					break transform;
				}
			}
		}
		System.out.println("============================\n");
		for (int i = 0; i < matrix.length; i++)
		  {
		    for (int j = 0; j < matrix[i].length; j++)
		    {
			System.out.print( matrix[i][j]  + "\t");
		     }
		     System.out.println();
		   }
	}
	
}
