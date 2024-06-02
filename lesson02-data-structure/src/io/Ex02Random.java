package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		 //tao so nguyen ngau nhien [min,max]
		int a = rd.nextInt();
		//tao ngau nhien
		 int b = rd.nextInt(20);
		 //tao ngau nhien [a,b)
		 int c = rd.nextInt(2,10);
		 
		 System.out.println("a -> "+a);
		 System.out.println("b -> "+b);
		 System.out.println("c -> "+c);
		
		// tao so nguyen ngau nhien min->max Int
	}
}
