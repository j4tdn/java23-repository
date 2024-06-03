package io;

import java.util.Random;

public class Ex02Random {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int a = rd.nextInt();
		
		int b = rd.nextInt(20);
		
		int c = rd.nextInt(2, 10);
		
		
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		System.out.println("c -> " + c);
		
		
	}

}
