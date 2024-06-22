package view;

import java.util.Scanner;

public class Ex01Multiples {

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
		if(n1 % 2 == 0)
			System.out.println(n + " la boi cua 2");
		else 
			System.out.println(n + " khong phai la boi cua 2");
	}
	private static boolean checkString(String n) {
		for(int i = 0; i < n.length(); i++)
			if(n.charAt(i) < 48 || n.charAt(i) > 57)
				return false;
		return true;
	}
}
