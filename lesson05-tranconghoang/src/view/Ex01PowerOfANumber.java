package view;

import java.util.Scanner;

public class Ex01PowerOfANumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap a = ");
		int a = ip.nextInt();
		System.out.print("Nhap b = ");
		int b = ip.nextInt();
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if(isPowerOf(a, b)) System.out.println("--> true");
		else System.out.println("--> false");
	}
	
	private static boolean isPowerOf(int a, int b) {
		if(a < 1 || b < 1) return false;
		if(a == 1 || b == 1) return true;
		while(a >= b) {
			if(a % b == 0)
				a = a / b;
			else
				return false;
		}
		if(a == 1) return true;
		else
			return false;
	}
	
}
