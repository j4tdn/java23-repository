package math;

import java.util.Scanner;

public class Ex03SaddleElement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng M: ");
        int M = scanner.nextInt();
        System.out.print("Nhập số cột N: ");
        int N = scanner.nextInt();

        int[][] matrix = new int[M][N];

        System.out.println("Nhập các phần tử của bảng:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean FoundSaddlePoint = false;
        for (int i = 0; i < M; i++) {
            int minInRow = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < N; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean IsSaddlePoint = true;
            for (int k = 0; k < M; k++) {
                if (matrix[k][colIndex] > minInRow) {
                    IsSaddlePoint = false;
                    break;
                }
            }
            if (IsSaddlePoint) {
                System.out.println("Phần tử yên ngựa: A" + i + colIndex + " = " + minInRow);
                FoundSaddlePoint = true;
            }
        }

        if (!FoundSaddlePoint) {
            System.out.println("Không có phần tử yên ngựa.");
        }

        scanner.close();
    }
}
