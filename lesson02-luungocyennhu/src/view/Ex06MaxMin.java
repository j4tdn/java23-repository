package view;

import java.util.Scanner;

public class Ex06MaxMin {
	
	public static int getNumber() {
		int n;
		Scanner ip = new Scanner(System.in);
		while(true) {
			n = Integer.parseInt(ip.nextLine());
			if(n >= 0 && n < 20) {
				return n;
			} else {
				System.out.println("Please enter an integer from 0 to less than 20");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Enter a: ");
		a = getNumber();
		
		System.out.println("Enter b: ");
		b = getNumber();
		
		System.out.println("Enter c: ");
		c = getNumber();
		
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		
		System.out.println("-> Số lớn nhất là: " + max);
		System.out.println("-> Số bé nhất là: " + min);
	}
}
