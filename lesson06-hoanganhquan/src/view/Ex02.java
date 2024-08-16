package view;

import java.util.Scanner;

import exception.InvalidPasswordException;

public class Ex02 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		do  {
			try  {
				System.out.print("Enter your password: ");
				String password = sc.nextLine();
				validatePassword(password);
				break;
			}
			catch (InvalidPasswordException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		while (true);
		
	}
	
	private static void validatePassword (String password) throws InvalidPasswordException{
		if (password.length() < 8) {
			throw new InvalidPasswordException("password must contain at least 8 character");
		}
		
		if (password.length() > 256) {
			throw new InvalidPasswordException("password must contain at most 256 charater");
		}
		
		if (!password.matches(".*[a-z].*")) {
			throw new InvalidPasswordException("password must contain at least 1 lowcase alphabetic chacrater");
		}
		
		if (!password.matches(".*[A-Z].*")) {
			throw new InvalidPasswordException("password musr contain at least 1 uppercase alphabetic character");
		}
		
		if (!password.matches(".*//d.*")) {
			throw new InvalidPasswordException("password must contain at least 1 number");
		}
		
		if (!password.matches(".*[@+*].*")) {
			throw new InvalidPasswordException("password musr contain at least 1 special character");
		}
	}
}
