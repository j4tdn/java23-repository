package view;

import java.util.Scanner;

public class Ex08PrimeNumbers {
	
	public static boolean checkString (String str) {
		 for (int i = 0 ; i < str.length(); i++) {
			 if (!Character.isDigit(str.charAt(i))) {
				 return false;
			 }
		 }
		 return true;
	 }
	
	public static boolean isPrime (int n) {
		if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}

	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		 int attempts = 1;
		 do {
			 System.out.print("Enter the integer N:  ");
			 String str = scanner.nextLine();
			 if (checkString(str)) {
				 int n = Integer.parseInt(str);
				 if (isPrime(n)) {
					 System.out.println("Number "+n+" is prime number." );
					 break;
				 }
				 else {
					 System.out.println("Number "+n+" is not prime number." );
					 break;
				 }
			 }	else {
				 System.out.println("This number is invalid." );
				 attempts ++;
			 }
		 }	while(attempts <=5);
	}
}
