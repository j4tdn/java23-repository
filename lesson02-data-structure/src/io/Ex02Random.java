package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		//Random
		int a = rd.nextInt();

		//Random in range [0;n) or [a;b);
		int b = rd.nextInt(20);
		
		int c = rd.nextInt(3,15);
	}
}
