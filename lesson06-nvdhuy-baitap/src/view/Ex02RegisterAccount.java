package view;
import java.util.Scanner;
import java.util.regex.Pattern;

import java.util.Scanner;
import java.util.regex.Pattern;

//Ngoại lệ cho mật khẩu không hợp lệ
	class InvalidPasswordException extends Exception {
	    public InvalidPasswordException(String message) {
	        super(message);
	    }
	}
public class Ex02RegisterAccount {
	public class PasswordValidator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String password;
	        String email = null; 
	        while (true) {
	            System.out.print("Enter your password: ");
	            password = scanner.nextLine();

	            try {
	                validatePassword(password, email);
	                System.out.println("Password is valid! Account created successfully.");
	                break;
	            } catch (InvalidPasswordException e) {
	                System.out.println("Password is invalid: " + e.getMessage());
	                System.out.println("Please try again.");
	            }
	        }

	        scanner.close();
	    }

	   
	    public static void validatePassword(String password, String email) throws InvalidPasswordException {
	       
	        if (password.length() < 8 || password.length() > 256) {
	            throw new InvalidPasswordException("Password must be between 8 and 256 characters.");
	        }

	      
	        if (!Pattern.compile("[a-z]").matcher(password).find()) {
	            throw new InvalidPasswordException("Password must contain at least one lowercase letter.");
	        }

	       
	        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
	            throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
	        }

	        if (!Pattern.compile("[0-9]").matcher(password).find()) {
	            throw new InvalidPasswordException("Password must contain at least one digit.");
	        }

	       
	        if (!Pattern.compile("[~!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?/]").matcher(password).find()) {
	            throw new InvalidPasswordException("Password must contain at least one special character.");
	        }

	        if (password.toLowerCase().contains(email.split("@")[0].toLowerCase())) {
	            throw new InvalidPasswordException("Password must not contain your email address.");
	        }
	    }
	}

}
