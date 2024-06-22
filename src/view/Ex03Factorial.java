package view;

import java.util.Scanner;

public class Ex03Factorial {
	
	public static void main (String args[]) {
		System.out.print("Enter an integer N: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = 1;
		for (int i = 1; i <= N; i++) {
			F = F * i;
		}
		System.out.println("Factor of " + N +" " + "is: " + F);
	}
}
