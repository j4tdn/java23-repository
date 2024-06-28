package view;

import java.util.Scanner;

public class SaddleElementProblem {
	int m, n;
	int[][] A;

	public static void main(String[] args) {
		SaddleElementProblem sep = new SaddleElementProblem();
		sep.input();
		sep.output();
		sep.findSaddlePoint();
	}

	public void input() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số hàng ma trận: ");
		m = ip.nextInt();
		System.out.print("Nhập số cột ma trận: ");
		n = ip.nextInt();
		A = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("\nNhập giá trị cho mảng thứ - " + i + ": ");
				A[i][j] = ip.nextInt();

			}
		}
	}

	public int output() {
		int result = 0;
		System.out.println("\nMa trận: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
		return result;
	}

// Phương thức tìm phần tử yên ngựa
	public void findSaddlePoint() {
		boolean foundSaddlePoint = false;
		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n; j++) {
				int currentElement = A[i][j];
				int minInRow = currentElement;
				int maxInCol = currentElement;

				// Tìm phần tử nhỏ nhất trong hàng
				for (int k = 0; k < n; k++) {
					if (A[i][k] < minInRow) 
						minInRow = A[i][k];
				}

				// Tìm phần tử lớn nhất trong cột
				for (int k = 0; k < m; k++) {
					if (A[k][j] > maxInCol) 
						maxInCol = A[k][i];
				}

				if (currentElement == minInRow && currentElement == maxInCol) {
					System.out.println("\n=> Phần tử yên ngựa là: " + currentElement + " tại vị trí A(" + i + ", " + j + ")");
					foundSaddlePoint = true;
//					return;
				}
			}
		}
		if (!foundSaddlePoint) {
            System.out.println("\n=> Không có phần tử yên ngựa trong ma trận.");
        }
		
	}

}
