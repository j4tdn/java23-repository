package view;

import utils.IoUtils;

public class Ex02Power {
	
	/* 
	 Bài 2: Viết chương trình(hàm) kiểm tra số nguyên N có phải là lũy thừa của 2 hay không
	Biết rằng N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N không hợp lệ
	(tối đa 5 lần) hoặc khai báo biến có sẵn giá trị hợp lệ
	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
	
	= 4 → true
	= 6 → false
	= 8 → true
	= 9 → false
	
	 */
	public static void main(String[] args) {
		
		int number = IoUtils.input(5);
		
		System.out.println(" ==> Is " + number + " power of 2 ==> " + isPowerOf2(number));
		
		// Cho 2 số a, b. Viết hàm kiểm tra a, b có phải là lũy thừa của số còn lại không
		
	}
	
	// 1 -> true 2^0
	// 2 -> true 2^1
	// 3 -> false 
	// 4 -> true 2^2
	// 6 -> false
	// 8 -> true 2^3
	// 10 -> false
	
	// Một số N là lũy thừa của 2 nếu 2^x = N
	// Yêu cầu: x phải là số nguyên >= 0
	
	
	private static boolean isPowerOf2(int n) {
		// n = 8 --> 8(chc2) 4(chc2) 2(chc2) --> true
		// n - 10 --> 10(chc20 5(!chc2) --> false
		// làm ngược lại từ dưới lên 2 nhân ...
		
		/*
		 Cách 1:
		 while(true) {
			if (n == 2) {
				return true;
			}
			if (n % 2 == 0) {
				n = n /2 ;
				continue;
			}
			return false;
		}
		 */
		double pow = Math.log(n) / Math.log(2);
		return Math.ceil(pow) == Math.floor(pow);
	}
}
