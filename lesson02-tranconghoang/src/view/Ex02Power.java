package view;

import java.util.Scanner;

public class Ex02Power {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int count = 0;
		System.out.print("Nhap N = ");
		String n = ip.nextLine();
		while(!checkString(n)) {
			System.out.println("Nhap sai, vui long nhap lai !");
			System.out.print("Nhap N = ");
			n = ip.nextLine();
			if(count == 4) {
				System.out.println("Ban nhap sai qua nhieu lan !!!");
				System.exit(0);
			}
			if(!checkString(n)) 
				count++;
		}
		int n1 = Integer.parseInt(n);
		if(checkPowerOfTwo(n1))
			System.out.println(n + " la luy thua cua 2");
		else
			System.out.println(n + " khong phai la luy thua cua 2");
	}
	private static boolean checkString(String n) {
		for(int i = 0; i < n.length(); i++)
			if(n.charAt(i) < 48 || n.charAt(i) > 57)
				return false;
		return true;
	}
	private static boolean checkPowerOfTwo(int n) {
		if(n == 1) return true;
		if(n % 2 != 0) return false;
		while(n != 1) {
			if(n % 2 != 0) return false;
			n = n / 2;
		}
		return true;
	}
}
