package view;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double a = 0, b = 0;

		while (true) {
			try {
				System.out.print("Enter a: ");
				a = Double.parseDouble(ip.nextLine());

				if (a == 0) {
					System.out.println("a cannot be 0. Please re-enter");
				} else {
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("error >> " + e.getMessage());
			}
		}

		while (true) {
			try {
				System.out.print("Enter b: ");
				b = Double.parseDouble(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("error >> " + e.getMessage());
			}
		}

		double x = -b / a;
		System.out.println("  ==> x = " + x);
	}
}
