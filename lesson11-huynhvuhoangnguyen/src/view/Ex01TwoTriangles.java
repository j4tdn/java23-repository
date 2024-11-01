package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01TwoTriangles {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int n = 0;
		while(true) {
			try {
				System.out.println("Enter n:");
				n = ip.nextInt();
				
				if(n <=0) {
					System.out.println("Please enter a positive number.");
				} else {
					break;
				}
			} catch(InputMismatchException e) {
				System.out.println("Please enter a number");
				ip.next();
			}
		}
		
		for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2*(n - i) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Phần dưới của tam giác
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2*(n - i) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
		ip.close();
	}
	
}