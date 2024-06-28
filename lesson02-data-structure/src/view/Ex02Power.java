package view;

import java.util.Scanner;

public class Ex02Power {

	/*
	 Kiểm tra số nguyên tố N có phải là lũy thừa của 2 hay ko
	 Yêu cầu: N là "số nguyên dương" đc nhập từ bàn phím,
	          Bắt buộc nhập lại nếu N ko hợp lệ (tối đa 5 lần)
	 */ 
	
	public static void main(String[] args) {
		System.out.println("Test 1 -> " + isPowerOf2(1));
		System.out.println("Test 4 -> " + isPowerOf2(4));
		System.out.println("Test 6 -> " + isPowerOf2(6));
		System.out.println("Test 7 -> " + isPowerOf2(7));
		System.out.println("Test 8 -> " + isPowerOf2(8));
		System.out.println("Test 10 -> " + isPowerOf2(10));
		
	}
	
	private static boolean isPowerOf2(int n) {
		double pow = Math.log(n) / Math.log(2);
		return Math.ceil(pow) == Math.floor(pow);
	}
}
