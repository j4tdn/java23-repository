package view;

import java.util.Scanner;

import utils.IoUtils;

public class Ex01Multiple {

	/*
	 Kiểm tra số nguyên N có phải là bội của 2 hay ko
	 Yêu cầu: N là số nguyên dương đc nhập từ bàn phím, bắt buộc nhập lại nếu N ko hợp lệ (tối đa 5 lần)
	 */
	
	public static void main(String[] args) {
		
		// 5 là số lần nhập sai tối đa
		int number = IoUtils.input(5);
		
		System.out.println("==> Is " + number + " multiple of 2 --> " + isMultipleOf2(number));
	}
	
	private static boolean isMultipleOf2(int n) {
		return n % 2 == 0;
	}
	
}
