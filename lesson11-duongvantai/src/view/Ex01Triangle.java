package view;

import java.util.Scanner;

public class Ex01Triangle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		Printf(n);
	}
	private static void Printf(int n) {
		int count = 1;
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= n  ; j++) {
				
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
