package view;

import java.util.Scanner;

public class Ex07BaseConversion {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a N: ");
		int N = scanner.nextInt();
		if (N < 0) {
            System.out.println("Please enter a non-negative integer.");
        }
		
		 System.out.print("The binary representation of N is: ");
		 
		 if (N == 0) {
			 System.out.print(0);
		 }	
		 else {
			 int[] b = new int[10]; 
	         int i = 0;  
	            while (N > 0) {
	                b[i] = N % 2;
	                N = N / 2;
	                i++;
	            }
	       	     for (int j = i - 1; j >= 0; j--) {
		                System.out.print(b[j]);
	       	     }
	     }
	}
}

