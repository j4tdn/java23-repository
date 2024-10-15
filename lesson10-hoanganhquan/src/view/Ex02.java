package view;

import java.util.Scanner;

public class Ex02 {
	
	public static void main (String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 int rows = scanner.nextInt();
	     int cols = scanner.nextInt();
	     int[][] matrix = new int[rows][cols];
	     
	     for (int i = 0; i < rows; i++) {
	    	 for (int j = 0; j < cols; j++) {
	    		 matrix[i][j] = scanner.nextInt();
	         }
	     }
	     
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
	    	 for (int j = 0; j < cols; j++) {
	    		 if (zeroRows[i] || zeroCols[j]) {
	    			 matrix[i][j] = 0;
	             }
	    	 }
	     }
	     
	     for (int i = 0; i < rows; i++) {
	    	 for (int j = 0; j < cols; j++) {
	    		 System.out.print(matrix[i][j] + " ");
	         }
	         System.out.println();
	     }
	     
	}
	
}
