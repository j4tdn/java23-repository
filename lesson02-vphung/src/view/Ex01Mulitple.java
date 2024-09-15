package view;

import utils.IoUtils;

public class Ex01Mulitple {

	/*
	 Bài 1: Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
	Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ (tối
	đa 5 lần)
	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
	
	= 4 → true
	= 6 → true
	= 7 → false
	 */
	public static void main(String[] args) {
		
		// 5 là số lần nhập sai tối đa
		int number = IoUtils.input(5);
		
		System.out.println("Is " + number + " multiple of 2 --> " + isMultipleOf2(number));
		
	}
	// require n > 0
	private static boolean isMultipleOf2(int n) {
		return n % 2 == 0;
	}
	
}