package bean_ex03;

import java.util.Scanner;

public class Matrix {

	//check phần tử yên ngựa
	public static boolean isHorseElement(int[][] A, int M, int N, int i, int j) {
		int value = A[i][j];
		for (int col = 0; col < N; col++) {
			if (A[i][col] < value && col != j) {
				return false;
			}
		}
		for (int row = 0; row < M; row++) {
			if (A[row][j] > value && row != i) {
				return false;
			}
		}
		return true;
	}

	//nhập ma trận
	public static int[][] inputMatrix(int M, int N) {
		Scanner scanner = new Scanner(System.in);
		int[][] A = new int[M][N];

		System.out.println("Nhập các phần tử của ma trận A:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("Nhập phần tử A[%d][%d]: ", i, j);
				A[i][j] = scanner.nextInt();
			}
		}
		return A;
	}

	//in các phần tử yên ngựa có trong ma trận
	public static void outputMatrix(int[][] A, int M, int N) {
		boolean foundHorseElement = false;
		
		System.out.println("Phần tử yên ngựa trong ma trận A là:");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (isHorseElement(A, M, N, i, j)) {
					System.out.printf("A[%d][%d] = %d\n", i, j, A[i][j]);
					foundHorseElement = true;
				}
			}
		}
		
		if (foundHorseElement == false) {
            System.out.println("Không có phần tử yên ngựa nào trong ma trận A!");
        }
	}
}
