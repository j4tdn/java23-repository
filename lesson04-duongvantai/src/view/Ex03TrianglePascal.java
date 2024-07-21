package view;

import java.util.Scanner;

public class Ex03TrianglePascal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		int [][] tg = new int [n][n];
		for(int i = 0; i <= n; i++) {
			tg[i][0] = 1;
			for(int j = 1; j <= i ; j++) {
				if(j == i) {
					tg[i][j]= 1;
				}else {
					tg[i][j] = tg[i-1][j-1] + tg[i-1][j];
				}
			}
		}
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <=i ; j++) {
				System.out.println(tg[i][j] + " ");
			}
			System.out.println();
		}
	}

}
