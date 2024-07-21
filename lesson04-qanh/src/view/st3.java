package view;

import java.util.Scanner;

public class st3 {

	    public static void main(String[] args) {
	        int n = 4; 
	        int[][] Triangle = new int[n][n];
	        for (int i = 0; i < n; i++) {
	        	Triangle[i][0] = 1;
	        	Triangle[i][i] = 1;
	            for (int j = 1; j < i; j++) {
	            	Triangle[i][j] = Triangle[i - 1][j - 1] + Triangle[i - 1][j];
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(Triangle[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
