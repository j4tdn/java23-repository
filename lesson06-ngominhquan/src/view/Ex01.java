package view;

import java.util.Scanner;

public class Ex01 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double k = 0;
		double h = 0;
		
		do  {
			try  {
				System.out.print("Enter number a: ");
				String a = sc.nextLine();
				NumberChecker(a);
				k = Double.parseDouble(a);
				if (k == 0) {
					System.out.println("a cannot be 0");
				}
				else { break; }
			}
			catch (NumberFormatException  e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		while (true);
		
		do  {
			try  {
				System.out.print("Enter number b: ");
				String b = sc.nextLine();
				NumberChecker(b);
				h = Double.parseDouble(b);
				break;
			}
			catch (NumberFormatException  e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		while (true);
		
		double x = -k/h;
		
		System.out.print("Value of x: " + x);
		
	}
	
	public static void NumberChecker (String a) throws NumberFormatException {
		
		if (!a.matches("\\d+")) {
			throw new NumberFormatException("a must be a number");
		}
	}
	
}
