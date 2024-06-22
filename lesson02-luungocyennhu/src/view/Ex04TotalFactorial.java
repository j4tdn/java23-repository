package view;

import java.util.Random;

public class Ex04TotalFactorial {

	public static long factorialOfn(int n) {
		long s = 1;
		for (int i = 1; i <= n; i++) {
			s = s * i;
		}
		return s;
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);
		long s = factorialOfn(a) + factorialOfn(b) + factorialOfn(c) + factorialOfn(d);

		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.println("d --> " + d);
		System.out.println("Tổng giai thừa của a, b, c, d là: " + s);
	}
}
