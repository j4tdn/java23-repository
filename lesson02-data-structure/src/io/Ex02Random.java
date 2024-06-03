package io;

import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) throws InterruptedException {
		
		Random rd = new Random();
//		Tạo 1 sô nguyên ngẫu nhiên [min,max] Integer.MIN_VALUE Integer.Max_VA
		int a = rd.nextInt();
		
//		Tạo 1 số nguyên ngẫu nhiên [0,n)
		int c = rd.nextInt(20);
		
//		Tạo 1 số nguyên ngẫu nhiên a,b
		int b = rd.nextInt(1, 15);
		
		
		System.out.println("số a = " +a);
		System.out.println("số b = " +b);
		System.out.println("số c = " +c);
		
		
	}
}
