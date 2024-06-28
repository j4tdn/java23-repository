package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02SaddlePoint {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số hàng M: ");
        int M = scanner.nextInt();
        System.out.print("Nhập số cột N: ");
        int N = scanner.nextInt();
        
        int[][] matrix = new int[M][N];
        Random rand = new Random();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = rand.nextInt(99) + 1;
            }
        }

        System.out.println("Bảng số:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        
        boolean foundSaddlePoint = false;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (isSaddlePoint(matrix, i, j, M, N)) {
                    System.out.printf("Phần tử yên ngựa: A[%d][%d] = %d\n", i, j, matrix[i][j]);
                    foundSaddlePoint = true;
                }
            }
        }

        if (!foundSaddlePoint) {
            System.out.println("Không có phần tử yên ngựa trong bảng.");
        }
    }

    public static boolean isSaddlePoint(int[][] matrix, int row, int col, int M, int N) {
        int element = matrix[row][col];
        
        for (int j = 0; j < N; j++) {
            if (matrix[row][j] < element) {
                return false;
            }
        }
        
        for (int i = 0; i < M; i++) {
            if (matrix[i][col] > element) {
                return false;
            }
        }

        return true;
	}
}
	
