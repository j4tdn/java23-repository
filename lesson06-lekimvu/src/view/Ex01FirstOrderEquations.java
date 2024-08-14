package view;

import java.util.Scanner;

public class Ex01FirstOrderEquations {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				System.out.println("Input number a: ");
				double a = Double.parseDouble(sc.nextLine());
				System.out.println("Input number b: ");
				double b = Double.parseDouble(sc.nextLine());
				double div = -b / a;
				System.out.println("The result is: " + div);
			} catch (ArithmeticException e) {
				System.out.println("The demon should not be a zero --> " + e.getMessage());
				System.out.println("Please input again");

			}
			 catch (NumberFormatException e) {
				System.out.println("Inavailable number: " + e.getMessage());
				System.out.println("Please input again");
//			} catch (ArithmeticException e) {
//				System.out.println("The demon should not be a zero --> " + e.getMessage());
//				System.out.println("Please input again");
//
			}
		} while (true);
	}

//	private static int divide() {
//		do {
//			try {
//				int a = Integer.parseInt(sc.nextLine());
//				int b = Integer.parseInt(sc.nextLine());
//			}catch(NumberFormatException e ) {
//				 System.out.println("The valid should be a number --> " +e.getMessage());
//		    	  System.out.println("Please input availd number");
//			}
//		}while(true);
//	}
}
