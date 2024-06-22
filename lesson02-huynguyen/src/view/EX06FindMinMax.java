package view;

import java.util.Scanner;

public class EX06FindMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c less than 20");
		System.out.println("Enter a: ");
		int a = checkInt();
		System.out.println("Enter b: ");
		int b = checkInt();
		System.out.println("Enter c: ");
		int c =  checkInt();
		System.out.println("MAX = " + Max(a, b, c));
		System.out.println("MIN = " + Min(a, b, c));

	}

	private static boolean checkNumber(String n) {
		try {
			int i = Integer.parseInt(n);
			return true;

		} catch (NumberFormatException e) {
			return false;
		}
	}
	private static int checkInt() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			String n= sc.nextLine();
			if(checkNumber(n)) {
				if(Integer.parseInt(n) >=0 && Integer.parseInt(n)<20) {
					return Integer.parseInt(n);
				}else {
					System.out.println("Number in interval from 0 to 19");
				}
				}else {
					System.out.println("Re-enter");
			}
		}
	}
	private static int Max(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c)
			return b;
		else
			return c;
	}

	private static int Min(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c)
			return b;
		else
			return c;
	}

}
