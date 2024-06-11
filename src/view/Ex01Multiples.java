package view;

import java.util.Scanner;

public class Ex01Multiples {
	
	 public static boolean checkString (String str) {
		 for (int i = 0 ; i < str.length(); i++) {
			 if (!Character.isDigit(str.charAt(i))) {
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
				 if ((n > 0) && (n % 2 == 0)) {
					 System.out.println("N is a multiple of 2");
					 break;
				 }
				 else {
					 System.out.println("N is not a multiple of 2");
					break;
				 }
			 }
			 System.out.println("This number is invalid");
			 attempts ++;
		 }	while (attempts <= 5);
		 
		if (attempts > 5) {
			System.out.println("You have entered more than the specified number of times");
			System.exit(0);
		}
	 }
}
