package view;

import java.util.Random;

public class Ex04TotalFactorial {
	
	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <=n; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Random rd = new Random();

		int a = 10 + rd.nextInt(11);
		int b = 10 + rd.nextInt(11);
		int c = 10 + rd.nextInt(11);
		int d = 10 + rd.nextInt(11);

		System.out.println("Random numbers are: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

		long factorialA = factorial(a);
		System.out.println("a! -> " + factorialA);
		long factorialB = factorial(b);
		System.out.println("b! -> " + factorialB);
		long factorialC = factorial(c);
		System.out.println("c! -> " + factorialC);
		long factorialD = factorial(d);
		System.out.println("d! -> " + factorialD);

		long total = factorialA + factorialB + factorialC + factorialD;
		System.out.println(" Total factorial is: " + total);
	}
}