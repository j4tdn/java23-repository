package review;

import utils.IoUtils;

public class Ex01Multiple {
	public static void main(String[] args) {
		// 5 là số lần nhập sai tối đa
		int number = IoUtils.input(5);
		
		System.out.println("Is" + number + "multiple of 2 --> " + isMultipleOf2(number));

	}
	
	private static boolean isMultipleOf2(int n) {
		return n % 2 == 0;
	}
}
