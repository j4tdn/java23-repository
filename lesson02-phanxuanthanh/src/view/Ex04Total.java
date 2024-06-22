/*
 	Bài 4: Viết chương trình tính tổng giải thừa của các số nguyên dương S = a! +b! + c! + d!
	Biết rằng a,b,c,d là các số nguyên ngẫu nhiên từ 10 đến 20 → [10, 20]
 */
package view;

import java.util.Random;

public class Ex04Total {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10, 20);
		System.out.println("a: " + a);
		int b = rd.nextInt(10, 20);
		System.out.println("b: " + b);
		int c = rd.nextInt(10, 20);
		System.out.println("c: " + c);
		int d = rd.nextInt(10, 20);
		System.out.println("d: " + d);
		
		long S = Sum(Factorial(a),Factorial(b),Factorial(c),Factorial(d));
		System.out.println("S =" + Factorial(a) + "! + " 
								+ Factorial(b) + "! + " 
								+ Factorial(c) + "! + " 
								+ Factorial(c) + "! + " 
								+ Factorial(d) + "! = " + S);
	}
	public static long Sum(long l , long m , long n , long o) {
		return l + m + n + o;
	}
	public static long Factorial(int n) {
		long result = 1;
		for (int i = 1 ; i <= n ; i++) {
			result = result * i;
		}
		return result;
	}
}
