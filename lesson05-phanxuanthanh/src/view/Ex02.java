package view;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(11);
		System.out.println(number + " is special number " + " --> " + isSpecialNumber(number) );
	}
	
	public static boolean isSpecialNumber(int number) {
		int n = 0;
		for (int i = 1; i < number; i++) {
			n += i;
			if (n == number && number == 1) {
				return true;
			}
		}
		return false;
	}
}
