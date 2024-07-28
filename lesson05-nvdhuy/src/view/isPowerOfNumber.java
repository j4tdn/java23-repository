package view;

import java.util.Scanner;

public class isPowerOfNumber {
	public static void main(String[] args) {
		double a = 8;
		double b = 2;
		
	if (isPowerOf(a,b) ) {
		System.out.println("a va b la luy thua cua nhau");
	} else {
		System.out.println("a va ko phai la luy thua cua nhau");
	}
	}
	private static boolean isPowerOf (double a, double b) {
		if(b == Math.sqrt(a)) { 
			return false;
		}
		return true;
	}
}
