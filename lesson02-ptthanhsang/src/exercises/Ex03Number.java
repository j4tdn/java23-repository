package exercises;

import java.util.Scanner;

public class Ex03Number {


	    public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);

	        System.out.print("Nhập N =  ");
	        int N = ip.nextInt();


	        System.out.print(N + "! = ");
	        int result = 1;
	        for (int i = N; i >= 1; i--) {
	            System.out.print(i);
	            result *= i;
	            if (i > 1) {
	                System.out.print(" * ");
	            }
	        }
	        System.out.println(" = " + result);

	        
	    }
	}

