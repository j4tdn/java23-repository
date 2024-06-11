package view;

import java.util.Random;

public class Ex04TotalFactorial {
	public static void main(String[] args) {
     Random rd = new Random();
     int a = rd.nextInt(10,21);
     int b = rd.nextInt(10,21);
     int c = rd.nextInt(10,21);
     int d = rd.nextInt(10,21);
     
     System.out.println("Fisrt number " + a);
     System.out.println("Second number " + b);
     System.out.println("Third number " + c);
     System.out.println("Fourth number " + d);
     
     long sum = isTotalFactorial(a, b, c, d);
		System.out.println("Total of Factorials: " + sum);
		
	}

	private static long calculateFactorial(int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	private static long isTotalFactorial(int a, int b,int c,int d) {
	return calculateFactorial(a) + calculateFactorial(b) + calculateFactorial(c) + calculateFactorial(d);
	}
}
