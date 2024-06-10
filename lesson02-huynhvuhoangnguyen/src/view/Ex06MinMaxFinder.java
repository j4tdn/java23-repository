package view;

import java.util.Scanner;

public class Ex06MinMaxFinder {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		
		// Nhập a
		while (true) {
			System.out.println("Input a between [0, 19): ");
			if (ip.hasNextInt()) {
				a = ip.nextInt();
				if (a >= 0 && a < 20) {
					break;
				} else {
					System.out.println("a must be between [0, 20). Please try again");
				}
			} else {
				System.out.println("Invalid input. Please enter a positive integer");
				ip.next();
			}
		}
			
		// Nhập b
		while (true) {
			System.out.println("Input b between [0, 19): ");
			if (ip.hasNextInt()) {
				b = ip.nextInt();
				if (b >= 0 && b < 20) {
					break;
				} else {
					System.out.println("b must be between [0, 20). Please try again");
				}
			} else {
				System.out.println("Invalid input. Please enter a positive integer");
				ip.next();
			}
		}
				
		// Nhập a
		while (true) {
			System.out.println("Input c between [0, 19): ");
			if (ip.hasNextInt()) {
				c = ip.nextInt();
				if (c >= 0 && c < 20) {
					break;
				} else {
					System.out.println("c must be between [0, 20). Please try again");
				}
			} else {
				System.out.println("Invalid input. Please enter a positive integer");
				ip.next();
			}
		}
		
		// Tìm Min và M
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		
		// In ra Min và Max
		System.out.println("Min value is: " + min + ", and Max value is: " + max);
		ip.close();
	}
}
	
