package view;

import java.util.Scanner;

import bean_ex03.Matrix;

public class Ex03SaddleElement {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số hàng M: ");
	        int M = scanner.nextInt();
	        System.out.print("Nhập số cột N: ");
	        int N = scanner.nextInt();

	        int[][] A = Matrix.inputMatrix(M, N);

	        Matrix.outputMatrix(A, M, N);
	}

}
