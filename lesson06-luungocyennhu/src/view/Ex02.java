package view;

import java.util.Scanner;

import exception.InvalidPasswordException;

public class Ex02 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		do {
			try {
				System.out.println("Enter password: ");
				String password = ip.nextLine();
				validatePassword(password);
				break;
			} catch (InvalidPasswordException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} while (true);

	}

	private static void validatePassword(String password) throws InvalidPasswordException {
		if (password.length() < 8) {
			throw new InvalidPasswordException("At least 8 characters!");
		}

		if (password.length() > 256) {
			throw new InvalidPasswordException("At most 256 characters!");
		}

		if (!password.matches(".*[a-z].*")) {
			throw new InvalidPasswordException("At least 1 lowercase alphabetic character (a, b, c,...)");
		}

		if (!password.matches(".*[A-Z].*")) {
			throw new InvalidPasswordException("At least 1 uppercase alphabetic character (A, B, C,...)");
		}

		if (!password.matches(".*\\d.*")) {
			throw new InvalidPasswordException("At least 1 number (1, 2, 3,...)");
		}

		if (!password.matches(".*[@+*].*")) {
			throw new InvalidPasswordException("At least 1 special character (~!@#, ...)");
		}
	}
}
