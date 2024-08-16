package view;

import java.util.Scanner;

import exception.FormatEmailException;

public class Ex03 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter your email: ");
				String email = sc.nextLine();
				emailChecker(email);
				break;
			}
			catch (FormatEmailException e) {
				System.out.print("Error: " + e.getMessage());
				
			}
		}	while (true);
	}
	
	public static void emailChecker (String email) throws FormatEmailException{
		
		if (!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
			throw new FormatEmailException ("email is't valid");
		}
	}
}
