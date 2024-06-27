package saddle;

import java.util.Scanner;

public class SaddlePointFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số hàng ma trận M: ");
		int m = scanner.nextInt();
		
		System.out.println("Nhập số cột ma trận N: ");
		int n = scanner.nextInt();
		
		int [][] matrix = new int[m][n];
		
		System.out.println("Nhap cac phan tu ma tran tu trai qua phai tu tren xuong duoi: ");
		for(int i = 0; i< m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		boolean hasSaddle = false;
		for (int i = 0; i < m; i ++) {
			for(int j = 0; j< n; j++) {
				
				int element = matrix[i][j];
				boolean isMinInRow = true;
				
				for(int k = 0; k < n; k++) {
					if (matrix[i][k] < element) {
						isMinInRow = false;
						break;
					}
				}
				boolean isMaxInColumn = true;
				for (int k = 0; k < m; k++) {
					if (matrix[k][j]> element) {
						isMaxInColumn = false;
						break;
					}
				}
				if (isMaxInColumn && isMinInRow) {
					System.out.println("Phan tu yen ngua tai vi tri( "+ i + "," + j+ " ) :" + element);
					hasSaddle = true;
				}
			}
		}
		if (!hasSaddle) {
			System.out.println("khong oc phan tu yen ngua nao ");
		}
		scanner.close();
	}
}
