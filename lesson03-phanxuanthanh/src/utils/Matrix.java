package utils;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
	private int row;
	private int column;
	private int[][] matrix;
		
	public static  Random rd = new Random();

	public static Scanner sc = new Scanner(System.in);
	
	public Matrix() {
		matrix = new int[row][column];	
	}
	
	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;
		this.matrix = new int[row][column];
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public void inputMatrix() {	
		for (int i = 0; i < row; i++) {
	        for (int j = 0; j < column; j++) {
	            matrix[i][j] = rd.nextInt(0,90);
	        }
	    }
	}
	
	public void printMatrix() {
		for (int i = 0; i < row; i++) {
	        for (int j = 0; j < column; j++) {
	            System.out.print(matrix[i][j] + "\t");
	        }
	        // sau khi viết xong 1 dòng thi xuống hàng
	        System.out.println("\n");   
	    }
	}
	
	public boolean hasSaddleElement() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				boolean checkRow = false;
				boolean checkColumn = false;
				for (int k = 0; k < row; k++) {
					if (matrix[k][j] < matrix[i][j]) {
						checkRow = true;
						break;
					}
				}

				for (int k = 0; k < column; k++) {
					if (matrix[i][k] > matrix[i][j]) {
						checkColumn = true;
						break;
					}
				}
				
				if (checkRow && checkColumn) {
					System.out.println("Saddle Element: ");
					System.out.println(matrix[i][j]);
					return true;
				}
			}
		}
		return false;
	}
}
