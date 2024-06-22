package view;

import java.util.Scanner;

public class Ex08PrimeNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String n;
		int count = 0;
		do {
			System.out.print("Nhap N = ");
			n = ip.nextLine();
			if(count == 4) {
				System.out.println("Ban nhap sai qua nhieu lan !!!");
				System.exit(0);
			}
			if(!checkString(n)) {
				System.out.println("Nhap sai, vui long nhap lai !");
				count++;
			}
		}
		while(!checkString(n));
		int n1 = Integer.parseInt(n);
		if(checkPrimeNumber(n1))
			System.out.println(n + " la so nguyen to");
		else
			System.out.println(n + " khong phai la so nguyen to");
		
	}
	private static boolean checkString(String n) {
		for(int i = 0; i < n.length(); i++)
			if(n.charAt(i) < 48 || n.charAt(i) > 57)
				return false;
		return true;
	}
	private static boolean checkPrimeNumber(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= n/2; i++ )
			if(n % i == 0) return false;
		return true;
	}
}
