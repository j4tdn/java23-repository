package view;

import java.util.Scanner;

public class Ex2SpecialNumber {
		
	public static boolean isSpecialNumber(int n) {
		if(n < 1) {
			return false;
		}
		int S = 0;
		int i = 1;
		while(S < n) {
			S += i;
			i++;
		}
		return S == n;
		
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = x.nextInt();
		
		if(isSpecialNumber(number) ) System.out.println(" Number is Special Number");
		else System.out.println("Number is not Special Number");
	}

}
