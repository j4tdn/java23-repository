package view;

import java.util.Random;

public class Ex10RandomInteger {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int a = rd.nextInt(20,31);
		int b = rd.nextInt(20,31);
		int c = rd.nextInt(20,31);
		int d = rd.nextInt(20,31);
		int e = rd.nextInt(20,31);
		
		while(a == b || a == c || a == d || a == e || b == c || b == d || b == e || c == d || c == e || d == e) {
			 a = rd.nextInt(20,31);
			 b = rd.nextInt(20,31);
			 c = rd.nextInt(20,31);
			 d = rd.nextInt(20,31);
			 e = rd.nextInt(20,31);
		}
		System.out.println("5 so nguyen ngau nhien: ");
		System.out.print(a + " " + b + " " + c + " " + d + " " + e);
	}
}
