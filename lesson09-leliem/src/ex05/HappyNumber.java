package ex05;

import java.util.Scanner;

public class HappyNumber {
	 public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);
	        System.out.println("Enter your number: ");
	        int number = ip.nextInt();
	       
	        if (isHappyNumber(number)) {
	            System.out.println(number + " is a happy number.");
	        } else {
	            System.out.println(number + " is not a happy number.");
	        }
	        ip.close();
	    }

	    public static boolean isHappyNumber(int n) {
	        for (int i = 0; i < 1000; i++) {
	            n = sumOfSquares(n);
	            if (n == 1) {
	                return true; 
	            }
	        }
	        return false; 
	    }

	    public static int sumOfSquares(int num) {
	        int sum = 0;
            while(num > 0) {
            	int digit = num % 10;
            	sum += digit * digit;
            	num /= 10;
            }
            return sum;
	    }
}
