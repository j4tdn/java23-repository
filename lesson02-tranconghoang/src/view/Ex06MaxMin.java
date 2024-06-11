package view;

import java.util.Scanner;

public class Ex06MaxMin {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
	    System.out.print("Nhap a = ");
	    String a = ip.nextLine();
	    while(!checkString(a)) {
	    	System.out.println("Nhap sai, vui long nhap lai !");
			System.out.print("Nhap a = ");
			a = ip.nextLine();
	    }
	    System.out.print("Nhap b = ");
	    String b = ip.nextLine();
	    while(!checkString(b)) {
	    	System.out.println("Nhap sai, vui long nhap lai !");
			System.out.print("Nhap b = ");
			b = ip.nextLine();
	    }
	    System.out.print("Nhap c = ");
	    String c = ip.nextLine();
	    while(!checkString(c)) {
	    	System.out.println("Nhap sai, vui long nhap lai !");
			System.out.print("Nhap c = ");
			c = ip.nextLine();
	    }
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		System.out.println("So lon nhat la " + findMax(a1, b1, c1));
		System.out.println("So lon nhat la " + findMin(a1, b1, c1));
	}
	private static boolean checkString(String n) {
		if(n.length() > 2 ) return false;
		if(n.length() == 2) 
			if(n.charAt(0) > 49) return false;
		for(int i = 0; i < n.length(); i++)
			if(n.charAt(i) < 48 || n.charAt(i) > 57)
				return false;
		return true;
	}
	private static int findMax(int a, int b, int c) {
		if(a > b)
			if(a > c)
				return a;
			else return c;
		if(b > c)
			return b;
		else return c;
	}
	private static int findMin(int a, int b, int c) {
		return (a < b) ? (a < c) ? a : c : (b < c) ? b : c;
	}
}
