package view;

import java.util.Scanner;
import java.util.regex.Pattern;

import exception.NoDigitException;
import exception.NoLowerCaseCharacterException;
import exception.NoSpecialCharacterException;
import exception.NoUpperCaseCharacterException;
import exception.PasswordTooLongException;
import exception.PasswordTooShortException;

public class Ex02Register {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("Enter password: ");
	            String password = scanner.nextLine();

	            try {
	                validatePassword(password);
	                System.out.println("Account registration successful!");
	                break; 
	            } catch (PasswordTooShortException | PasswordTooLongException | NoUpperCaseCharacterException |
	                     NoLowerCaseCharacterException | NoDigitException | NoSpecialCharacterException e) {
	                System.out.println("Error: " + e.getMessage());
	                System.out.println("Please try again.");
	            }
	        }

	        scanner.close();
	}
	
	private static void validatePassword(String password) throws PasswordTooShortException, PasswordTooLongException,
    NoUpperCaseCharacterException, NoLowerCaseCharacterException, NoDigitException,
    NoSpecialCharacterException {

if (password.length() < 8) {
    throw new PasswordTooShortException("Password must be at least 8 characters long.");
}

if (password.length() > 256) {
    throw new PasswordTooLongException("Password must not exceed 256 characters.");
}

if (!Pattern.compile("[A-Z]").matcher(password).find()) {
    throw new NoUpperCaseCharacterException("Password must contain at least one uppercase letter.");
}

if (!Pattern.compile("[a-z]").matcher(password).find()) {
    throw new NoLowerCaseCharacterException("Password must contain at least one lowercase letter.");
}

if (!Pattern.compile("[0-9]").matcher(password).find()) {
    throw new NoDigitException("Password must contain at least one digit.");
}

if (!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) {
    throw new NoSpecialCharacterException("Password must contain at least one special character.");
}
}
}
