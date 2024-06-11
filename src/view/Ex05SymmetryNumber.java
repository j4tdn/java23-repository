package view;

import java.util.Scanner;

public class Ex05SymmetryNumber {
	
	 public static boolean checkString (String str) {
		 for (int i = 0 ; i < str.length(); i++) {
			 if (!Character.isDigit(str.charAt(i))) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 private static int reverse_num(int n){
		  int reverse = 0; 
		  while (n > 0) {
		      reverse = reverse * 10 + n % 10;
		      n /= 10;
		  }
		  return reverse;
	}
		    
	private static int symmetrical_num(int n){ 
		  int flag =0;
		  if (reverse_num(n) == n) flag = 1;
		  return flag;
	}    
	 
	 public static void main (String args[]) {
		 Scanner scanner = new Scanner(System.in);
		 int n =0;
		 do {
			 System.out.print("Enter the integer N:  ");
			 String str = scanner.nextLine();
			 if (checkString(str)) {
				 n = Integer.parseInt(str);	 			 
			 } 
			 else {
				 System.out.println("N is not integer.");
				 continue;
			 }
			 if (n <10) {
				 System.out.println("N has at least 2 digits.");
			 }
		 } while (n < 10);
		 
		 int check = symmetrical_num(n);
		 if ( check == 1 ) {
			 System.out.println(n + " is symmetry number" ) ;
		 }
	        else System.out.println(n+ " is not symmetry number" ) ;
	 }
			 
}
	
	

