package view;

import java.util.Random;

public abstract class Ex04TotalFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10,21);
		int b = rd.nextInt(10,21);
		int c = rd.nextInt(10,21);
		int d = rd.nextInt(10,21);
		 long S = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println(a + "! + " + b + "! + " + c +"! + " + d+"! = " + S  );
	}
	private static int factorial(int n) {
		int  result = 1;
		for(int i = 1; i <= n ; i++) {
			result *= i;
		}
		return result;
	}
}
