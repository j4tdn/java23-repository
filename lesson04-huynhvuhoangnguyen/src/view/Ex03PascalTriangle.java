package view;

import java.util.Scanner;

public class Ex03PascalTriangle {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int n = ip.nextInt();
		int[][] pascal = new int[n + 1][n + 1];
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= i; j++) {
				if(j == 0 || j == i) {
					pascal[i][j] = 1;
				} else {
					pascal[i][j] = pascal[i - 1][j - 1] + pascal[i-1][j];
				}
			}
		}
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(pascal[i][j] + " ");
			}
			System.out.println();
		}
		ip.close();
	}
	
}
