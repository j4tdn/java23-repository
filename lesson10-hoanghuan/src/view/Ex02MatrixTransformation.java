package view;

import java.util.Scanner;

public class Ex02MatrixTransformation {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {
        	{1, 2, 3, 4},	
            {5, 0, 8, 7},
            {1, 9, 0, 9},
            {2, 0, 6, 5},
            {1, 2, 4, 5}
        };

        transformMatrix(matrix);

        System.out.println("\nMa trận sau khi chuyển đổi:");
        printMatrix(matrix);
    }
	
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transformMatrix(int[][] matrix) {
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
}
