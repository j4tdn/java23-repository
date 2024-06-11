package io;

import java.util.Random;

public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		//tạo 1 số nguyên ngẫu nhiên[min,max] Integer.Min_value Integer.Max_value
		int a =rd.nextInt();
		
		//tạo số nguyên ngẫu nhiên từ [0,n]
		int b=rd.nextInt(20);
		
		//tạo số ngẫu nhiên từ [a,b]
		int c=rd.nextInt(2,10);
		
	
		System.out.println("a->"+a);
		System.out.println("b->"+b);
		System.out.println("c->"+c);
		
		//cho danh sách sinh viên
		//chọn 2 sinh viên ngẫu nhiên - không được trùng nhau
	}
	
}
