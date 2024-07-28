package view;

import java.util.Scanner;

public class Ex01PowerCheck {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number: ");
		while(!ip.hasNextInt()) {
			System.out.println("Enter a number;");
			ip.next();
		}
		int num = ip.nextInt();
		
		System.out.println("Enter exponential");
		while(!ip.hasNextInt()) {
			System.out.println("Enter a number;");
			ip.next();
		}
		int exponential = ip.nextInt();
		
		System.out.println(num + " is exexponential of " + exponential + ": "  
					+ isPowerOf(num, exponential));
		
		ip.close();
	}
	
	public static boolean isPowerOf(int num, int exponential) {
		if (num <= 1 || exponential <= 1) {
			return false;
		}
		
		while (num > 1) {
			if(num % exponential != 0) {
				return false;
			}
			num /= exponential;
		}
		
		return num == 1;
		
	}
	
}
