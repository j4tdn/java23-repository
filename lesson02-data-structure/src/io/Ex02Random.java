package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		// Tạo 1 số nguyên ngẫu nhiên [min, max] Integer.MIN_VALUE Integer.MAX_VALUE
		int a = rd.nextInt();
		System.out.println(a);
		
		// Tạo 1 số nguyên ngẫu nhiên [0, n)
		int b = rd.nextInt(20);
		System.out.println(b);
		
		// Tạo 1 số nguyên ngẫu nhiên [a, b)
		int c = rd.nextInt(2, 10);
		System.out.println(c);

	}
}
