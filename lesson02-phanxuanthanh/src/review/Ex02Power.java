package review;

import utils.IoUtils;

public class Ex02Power {
	public static void main(String[] args) {
		int number = IoUtils.input(5);
		
		System.out.println("Is" + number + "power of 2 --> " + isPowerOf2(number));
		
		// Cho 2 số a,b. Viết hàm kiểm tra a,b có phải là lũy thừa của số còn lại không
	}
	
	private static boolean isPowerOf2(int n) {
		double pow = Math.log(n) / Math.log(2);
		return Math.ceil(pow) == Math.floor(pow);	
	}
}
