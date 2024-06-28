package view.bai3;

import java.util.Scanner;

public class SaddleElementProblem {
	int M, N;
	int[][] A;

	public static void main(String[] args) {
		SaddleElementProblem sep = new SaddleElementProblem();
		sep.input();
		sep.output();
		sep.findSaddlePoint();
	}

	public void input() {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập số hàng: ");
		M = ip.nextInt();
		System.out.print("Nhập số cột: ");
		N = ip.nextInt();
		A = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("\nNhập giá trị mảng: ");
				A[i][j] = ip.nextInt();

			}
		}
	}

	public int output() {
		int result = 0;
		System.out.println("\n-------------- Giá trị ma trận ---------------");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
		return result;
	}

	// Phương thức tìm phần tử yên ngựa
	public void findSaddlePoint() {
		boolean foundSaddlePoint = false;

		for (int i = 0; i < M; i++) {
			int rowMin = A[i][0];
			int colIndex = 0;

			// Tìm phần tử nhỏ nhất trong hàng
			for (int j = 1; j < N; j++) {
				if (A[i][j] < rowMin) {
					rowMin = A[i][j];
					colIndex = j;
				}
			}

			// Kiểm tra xem nó có phải là phần tử lớn nhất trong cột không
			boolean isSaddlePoint = true;
			for (int k = 0; k < M; k++) {
				if (A[k][colIndex] > rowMin) {
					isSaddlePoint = false;
					break;
				}
			}

			if (isSaddlePoint) {
				System.out.println("\nPhần tử yên ngựa là: " + rowMin);
				foundSaddlePoint = true;
			}
		}

		if (!foundSaddlePoint) {
			System.out.println("\nKhông có phần tử yên ngựa trong bảng.");
		}
	}
}
