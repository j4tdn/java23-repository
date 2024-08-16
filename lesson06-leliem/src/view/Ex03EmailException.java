package view;

import java.util.Scanner;

import exception.InvalidEmailException;

public class Ex03EmailException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isValid = false;
		do {
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();

            try {
                validateEmail(email);
                isValid = true;
                System.out.println("Valid email address: " + email);
            } catch (InvalidEmailException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!isValid);

	}
	
	 private static void validateEmail(String email) throws InvalidEmailException {
	        if (!email.contains("@")) {
	            throw new InvalidEmailException("Email must contain the '@' character.");
	        }

	        String[] parts = email.split("@");
	        if (parts.length != 2) {
	            throw new InvalidEmailException("Email must contain only one '@' character.");
	        }

	        String prefix = parts[0];
	        String domain = parts[1];

	        if (!isValidPrefix(prefix)) {
	            throw new InvalidEmailException("Invalid email prefix.");
	        }

	        if (!isValidDomain(domain)) {
	            throw new InvalidEmailException("Invalid email domain.");
	        }
	    }

	private static boolean isValidPrefix(String prefix) {
		String prefixRegex = "^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*$";
		return prefix.matches(prefixRegex);
	}

	private static boolean isValidDomain(String domain) {
		String domainRegex = "^[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";
		return domain.matches(domainRegex);
	}
}
