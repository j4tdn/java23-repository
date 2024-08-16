package view;

import java.util.Scanner;

public class Ex01 {

	public static boolean isValidEmail(String email) {
        // Regular expression for valid email prefix
        String emailRegex = "^[a-zA-Z0-9]+([._-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        
        // Check if the email matches the regex
        return email.matches(emailRegex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        // Loop until a valid email is entered
        while (true) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();

            if (isValidEmail(email)) {
                System.out.println("Valid email: " + email);
                break;  // Exit the loop if the email is valid
            } else {
                System.out.println("Invalid email. Please try again.");
            }
        }
        
        scanner.close();
    }
	
}
