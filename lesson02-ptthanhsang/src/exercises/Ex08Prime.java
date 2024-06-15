package exercises;

import java.util.Scanner;

public class Ex08Prime {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = 0;
	        int count = 0;

	        while (count < 5) {
	            System.out.print("N = ");
	            if (scanner.hasNextInt()) {
	                N = scanner.nextInt(); 
	            } 
	            count++;
	        }

	            if (isPrime(N)) {
	                System.out.println(N + " là số nguyên tố.");
	            } else {
	                System.out.println(N + " không phải là số nguyên tố.");
	            }
	  
	    }
	    private static boolean isPrime(int N) {
			
			for (int i = 2; i < N; i++) {
			    if(N%i == 0) return false;
			}
			return true;
		}
	}


