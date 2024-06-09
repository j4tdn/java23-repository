package view;

import java.util.Random;

public class EX04SumFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		int numberA = rd.nextInt(10,21);
		int numberB = rd.nextInt(10,21);
		int numberC = rd.nextInt(10,21);
		int numberD = rd.nextInt(10,21);
		long result = Factorial(numberA)+Factorial(numberB)+Factorial(numberC)+Factorial(numberD);
		System.out.println("S = "+ result);
		
	}
	private static long Factorial(int n) {
		long sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
}
