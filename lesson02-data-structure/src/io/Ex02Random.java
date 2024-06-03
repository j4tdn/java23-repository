package io;

import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		Random rd = new Random();
		// tạo một số nguyên ngẫu nhiên [ min , max ] integer min value integer max value
		
		int a = rd.nextInt(10); // từ 0 -> n
		
		int b = rd.nextInt();
		
		int c = rd.nextInt(3, 7);
		
		System.out.println("a -> "+a);
		System.out.println("b -> "+b);
		System.out.println("c -> "+c);
		
		// cho danh sách sinh viên 
		// chọn hai sinh viên trùng nhau .

	}

}
