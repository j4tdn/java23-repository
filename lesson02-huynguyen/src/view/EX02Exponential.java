package view;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class EX02Exponential {
	public static void main(String[] args) {
		checkInt();
	}
	private static void checkInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int count =1 ;
		do {
			String n = sc.nextLine();
			if(checkNumber(n)) {
				if(checkExponential(Integer.parseInt(n))) {
					System.out.println(n+" is a Exponential");
					break;
				}else {
					System.out.println(n+" is not a Exponential");
					break;
				}
				
			}else {
				count++;
				System.out.println("Re-enter");
			}
			
		} while (count<=5);
		
	}
	private static boolean checkNumber(String n) {
		try {
			int i = Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	private static boolean checkExponential(int n) {
		if(n<=0)
			return false;
		
		while(n%2 == 0) {
				n/=2;
		}
		return n ==1;
	}

}
