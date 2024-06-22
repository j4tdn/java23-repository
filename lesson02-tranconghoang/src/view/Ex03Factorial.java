package view;

import java.util.Scanner;

public class Ex03Factorial {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap N = ");
		int n = ip.nextInt();
		System.out.print(n + "! = ");
		runMultiplicationLoop(n);
		System.out.println(" = " + findFatorial(n));
		
	}
	private static void runMultiplicationLoop(int n) {
		for(int i = n; i >= 1; i--) {
			if(i == 1) {
				System.out.print(i);
				break;
			}
			System.out.print(i + ".");
		}
	}
	private static int findFatorial(int n) {
		int s = 1;
		for(int i = 1; i <= n; i++)
			s = s * i;
		return s;
	}
}
