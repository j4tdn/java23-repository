package view;

import java.util.Scanner;

public class Ex05SymmectricalNumber {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String n;
		do {
			System.out.print("Nhap N = ");
			n = ip.nextLine(); 
			if(!checkString(n)) 
				System.out.println("Nhap sai, vui long nhap lai !");
		}
		while(!checkString(n));
		int n1 = Integer.parseInt(n);
		if(checkSymetricalNumber(n1))
			System.out.println(n + " la so doi xung");
		else 
			System.out.println(n + " khong phai la so doi xung");
	}
	private static boolean checkString(String n) {
		if(n.length() < 2) return false;
		for(int i = 0; i < n.length(); i++)
			if(n.charAt(i) < 48 || n.charAt(i) > 57)
				return false;
		return true;
	}
	private static boolean checkSymetricalNumber(int n) {
		int reverse = 0, temp1, temp2 = n;
		while(n != 0) {
			temp1 = n % 10;
			reverse = reverse * 10 + temp1;
			n = n / 10;
		}
		if(reverse == temp2) 
			return true;
		else
			return false;
	}
}
