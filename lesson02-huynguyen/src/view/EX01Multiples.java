package view;

import java.util.Scanner;

public class EX01Multiples {
	public static void main(String[] args) {
		checkInt();
	}
	private static boolean checkNumber(String n) {
		try {
			int i = Integer.parseInt(n);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
		private static void checkInt() {
			Scanner sc  = new Scanner(System.in); 
			System.out.println("Enter N: ");
			int count = 1;
			do {
				String n = sc.nextLine();
				if(checkNumber(n)) {
					if(Integer.parseInt(n) % 2 == 0) {
						System.out.println(n+" is a Multiples of 2");
					}else {
						System.out.println(n+" is not a Multiples of 2");
					}
				}else {
					count++;
					System.out.println("Re-enter");
				}
				
			} while (count<=5);
		}
	}
