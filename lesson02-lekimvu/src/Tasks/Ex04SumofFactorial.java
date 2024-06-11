package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Ex04SumofFactorial {

	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);
            System.out.println("Sum of factorial " + a + "+" + b + "+" + c + "+" + d + "=" +sum(a,b,c,d)); 

		
	}

	public static int findFactorial(int n) {
		int x = 1;
		int i = 0;
		do {
			x = x * n;
			n--;
		} while (i < n);
		return x;
	}

	public static int sum(int a, int b, int c, int d) {
		return findFactorial(a) + findFactorial(b) + findFactorial(c) + findFactorial(d);
	}

}