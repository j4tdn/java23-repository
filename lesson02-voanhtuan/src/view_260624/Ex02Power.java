package view_260624;

import utils.IoUtils;

public class Ex02Power {

	public static void main(String[] args) {
		// 5 lan nhap sai toi da
		int number = IoUtils.input(3);
		System.out.println("Is " + number + " power of 2? --> " + isPowerOf2(number));
	}
	
	// Một số N là lũy của 2 nếu 2^x = n
	// Yêu cầu: x phải là số nguyên >= 0
	
	private static boolean isPowerOf2(int n) {
		// n = 8 	--> 8(chc2) 4 (chc2) 2 --> true
		// n = 10	--> 10(chc2) 5 (!chc2) --> false
		// lam nguoc lai tu duoi len 2 nhan ...
		
		// neu pow la so nguyen thi n la boi cua 2
		// pow = 2.333 -> false
		// pow = 2.000 -> true
		// pow = 5.777 -> false
		double pow = Math.log(n) / Math.log(2);
		return Math.ceil(pow) == Math.floor(pow); // check xem lam tron tren va lam tron duoi co = nhau hay khong // neu co thi no la so nguyen //
	}
	
}
