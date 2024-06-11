package view;

import java.util.Random;

public class Ex04RandomSumOfFactorial {
	public static void main(String[] args) {
		Random random = new Random();

		int a = 10 + random.nextInt(11);
		int b = 10 + random.nextInt(11);
		int c = 10 + random.nextInt(11);
		int d = 10 + random.nextInt(11);

		long factorialA = calculate(a);
		long factorialB = calculate(b);
		long factorialC = calculate(c);
		long factorialD = calculate(d);

		long SumFactorials = factorialA + factorialB + factorialC + factorialD;

		System.out.println("a = " + a + ", a! = " + factorialA);
		System.out.println("b = " + b + ", b! = " + factorialB);
		System.out.println("c = " + c + ", c! = " + factorialC);
		System.out.println("d = " + d + ", d! = " + factorialD);
		System.out.println("Tổng giai thừa S = a! + b! + c! + d! = " + SumFactorials);
	}

	public static long calculate(int N) {
		long result = 1;
		for (int i = 1; i <= N; i++) {
			result *= i;
		}
		return result;
	}
}
