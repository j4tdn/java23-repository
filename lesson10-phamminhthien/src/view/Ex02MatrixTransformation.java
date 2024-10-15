package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02MatrixTransformation {

	public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
//		System.out.println("Nhập số hàng: ");
//		int h = ip.nextInt();
//		System.out.println("Nhập số cột: ");
//		int c = ip.nextInt();
//		int[][] matrix = new int[h][c];
//		for(int i=0; i<h; i++) {
//			for(int j=0; j<c; j++) {
//				System.out.println("Nhập giá trị cho mảng: ");
//				matrix[i][j] = ip.nextInt();
//			}
//		}
		
		
		int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 8, 7},
                {1, 9, 0, 9},
                {2, 9, 6, 5},
                {1, 2, 4, 5}
        };
		System.out.println("Ma trận: ");
		print(matrix);
		
		System.out.println("\n-> Ma trận sau khi chuyển đổi");
		transformMatrix(matrix);
		print(matrix);
		
	}
	
	private static void print(int[][] matrix) {
		for(int[] row: matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	private static void transformMatrix(int[][] matrix) {
		int row = matrix.length;
		int cols = matrix[0].length;
		
		int zeroRow = -1;
		int zeroCol = -1;
		for(int i=0; i<row; i++) {
			for(int j=0; j<cols; j++) {
				if(matrix[i][j] == 0) {
					zeroRow = i;
					zeroCol = j;
					break;
				}
			}
			if(zeroRow != -1)
				break;
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<cols; j++) {
				matrix[i][zeroCol] = 0;
				matrix[zeroRow][j]=0;
			}
		}
		
	}
}
