package view;

import java.util.Scanner;

public class Ex01 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			try {
				System.out.println("Enter a: ");
				int a = Integer.parseInt(sc.nextLine());
				System.out.println("Enter b: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.println("Solution: " + a + "X + " + b + " = 0");
				
				if ( a!= 0) {
					if(b == 0) {
						System.out.println("Solution of the equation: x = 0 " );
					}else {
						System.out.println("Solution of the equation: x = " + -b/a);
					}
				}else {
					if (b == 0) {
						System.out.println("Equation with countless solutions. ");
					}else {
						System.out.println("Unsolved equation. ");
					}
				}
				break;
			}catch(NumberFormatException e) {
				System.out.println("Invalid coefficient, Please enter again: ");
			}
		}
		
	}
	
}
