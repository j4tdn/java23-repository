package view;

import java.util.Random;

public class Ex04SumOfFactorial {
	public static void main(String[] args) {
		Random rd = new Random();

		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);

		System.out.println("Random numbers are:\na = " + a + ", b = " + b + ", c = " + c + ", d = " + d +"\n");

		long factorialA = factorial(a);
		System.out.println(a + "! = " + factorialA);
		long factorialB = factorial(b);
		System.out.println(b + "! = " + factorialB);
		long factorialC = factorial(c);
		System.out.println(c + "! = " + factorialC);
		long factorialD = factorial(d);
		System.out.println(d + "! = " + factorialD);

		long total = factorialA + factorialB + factorialC + factorialD;
		System.out.println("The sum of factorial is: " + total);
	}

	// Hàm tính giai thừa của số nguyên dương N
	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
