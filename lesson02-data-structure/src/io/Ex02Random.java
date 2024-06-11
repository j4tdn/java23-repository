package io;

import java.util.Random;

public class Ex02Random {
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		// Tạo 1 số nguyên ngẫu nhiên [min, max] Integer.MIN_VALUE Integer.MAX_VALUE
		int a = rd.nextInt();
		
		// Tạo 1 số nguyên ngẫu nhiên [0, n)
		int b = rd.nextInt(20);
		
		// Tạo 1 số nguyên ngẫu nhiên [a, b)
		int c = rd.nextInt(2, 10);
		
		System.out.println("a -> " + a);
		System.out.println("b -> " + b);
		System.out.println("c -> " + c);
		
		// Cho danh sách sinh viên
		// Chọn 2 sinh viên ngẫu nhiên - ko được trùng nhau
		
	}
	