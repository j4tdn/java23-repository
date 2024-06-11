package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		// Tao 1 so nguyen nhau nhien [min, max] Integer.MIN_VALUE Integer.MAX_VALUE
		int a = rd.nextInt();
		// Tao 1so nguyen ngau nhien [0, n)
		int b = rd.nextInt(20);
		//Tao 1 so nguyen ngau nhien [a, b)
		int c = rd.nextInt(2, 10);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);

		
	}
}
