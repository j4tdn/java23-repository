package view;

import java.math.BigInteger;
import java.util.Random;

public class Ex04SumFactorial {
//	Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
//	Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
	public static void main(String[] args) {
		int a = new Random().nextInt(10,21);
		int b = new Random().nextInt(10,21);
		int c = new Random().nextInt(10,21);
		int d = new Random().nextInt(10,21);
		System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
		BigInteger sum = BigInteger.valueOf((calcFactorialOfN(a)) + calcFactorialOfN(b) + calcFactorialOfN(c) + calcFactorialOfN(d));
		System.out.println("Sum of Factorial a,b,c,d: " + sum);
	}
	
	private static int calcFactorialOfN(int n) {
		int sum = 1;
		for(int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		return sum;
	}
}
