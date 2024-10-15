package view;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 0}, 
            {9, 7, 1, 2},
            {1, 4, 5, 6}
        };

        System.out.println("Initial matrix:");
        printMatrix(matrix);
        System.out.println( );
        setZeroes(matrix);
        System.out.println("The following matrix");
        printMatrix(matrix);
    }
    
    public static void setZeroes(int[][] matrix) {
        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroCols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (zeroRows[i] || zeroCols[j]) matrix[i][j] = 0;
            }      
        }       
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println();
        }
    }

}

