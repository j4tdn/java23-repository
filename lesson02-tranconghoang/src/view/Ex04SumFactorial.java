package view;

import java.util.Random;

public class Ex04SumFactorial {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);
		System.out.println("Tong giai thua cua " + a + ", " + b + ", " + c + ", " + d + " = " + sum(a, b, c, d));
	}
	private static long findFactorial(int n) {
		int s = 1;
		for(int i = 1; i <= n; i++) 
			s = s * i;
		return s;
	}
	
	private static long sum(int a, int b, int c, int d) {
		return findFactorial(a) + findFactorial(b) + findFactorial(c) + findFactorial(d);
	}
}