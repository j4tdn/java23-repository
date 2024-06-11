package view;

import java.util.Scanner;

public class Ex05CheckPalindrome {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		while(true) {
			System.out.println("Enter N with 2 letters");
			String input = x.nextLine();
			try {
				int N = Integer.parseInt(input);
				if(N >= 10) {
					if(check(N)== true) {
						System.out.println(N + "--> true");
					}else {
						System.out.println(N + "--> false");
					}
				}
			} catch (Exception e) {
				System.out.println("Error please enter");
			}
		}
	}
	private static boolean check(int n) {
		int valueInntial  = n;
		int valueLast = 0;
		while(n != 0) {
			int lastNumber = n % 10 ; 
			valueLast = valueLast*10 + lastNumber;
			n/=10;
		}
		if(valueInntial == valueLast ) {
			return true;
		}else {
			return false;
		}
	}
}
