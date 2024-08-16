package view;

import java.util.Scanner;

class InvalidPasswordException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3993065749959068480L;

	public InvalidPasswordException() {
		super();
		System.out.println("Invalid password");
	}

	public InvalidPasswordException(String msg) {
		super(msg);
	}
}

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			System.out.println("Enter password");
			String password = sc.nextLine();
			try {
				validatePassword(password);
				System.out.println("Success!");
				break;
			} catch (InvalidPasswordException e) {
				System.out.println("error -> " + e.getMessage());
			}
		} while (true);
	}

	private static void validatePassword(String password) throws InvalidPasswordException {
		if (password.length() < 8 || password.length() > 256) {
			throw new InvalidPasswordException("Password is only legit in range 8-256 characters");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new InvalidPasswordException("Password need to have at least 1 lower case character");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new InvalidPasswordException("Password need to have at least 1 upper case character");
		}
		if (!password.matches(".*\\d.*")) {
			throw new InvalidPasswordException("Password need to have at least 1 number");
		}
		if (!password.matches(".*[!@#$%^&*(),.?\\\":{}|<>].*")) {
			throw new InvalidPasswordException("Password need to have at least 1 special character");
		}
	}
}
