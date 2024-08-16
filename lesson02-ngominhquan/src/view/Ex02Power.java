package view;

import java.util.Scanner;

import utils.IoUtils;

public class Ex02Power {
	
	/*
	Kiểm tra số nguyên N có phải là lũy thừa của 2 hay ko
	Yêu cầu: N là "số nguyên dương" đc nhập từ bàn phím, bắt buộc nhập lại nếu N ko hợp lệ (tối đa 3 lần)
	 */


	public static void main(String[] args) {
		int number = IoUtils.input(3);
		System.out.println("==> Is " + number + " power of 2 ==> " + isPowerOf2(number));
		
		// Cho 2 số a, b, viết hàm kiểm tra a, b có phải là lũy thừa của số còn lại ko
	}

	
	private static boolean isPowerOf2(int n) {
		double pow = Math.log(n) / Math.log(2);
		return Math.ceil(pow) == Math.floor(pow);
	}
}
