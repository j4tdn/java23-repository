package view;

import java.util.Scanner;

public class Ex05HappyNumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int number = ip.nextInt();
		if(isHappyNumber(number)) {
			System.out.println(number + " is happy number");
		}else {
			System.out.println(number + " is not  happy number");
		}
	}
	private static boolean isHappyNumber(int n) {
		for(int i = 0; i < n; i++) {
			n = getHappyNumber(n);
			if(n == 1) {
				return true;
			}
		}
		return false;
	}
	private static int getHappyNumber(int n) {
		int result = 0;
		while(n > 0) {
			int end = n % 10; 
			result += end*end;
			n=n/10;
		}
			return result;
		}

	}
	


