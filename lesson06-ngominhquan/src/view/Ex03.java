package view;

import java.util.Scanner;

public class Ex03 {
	
	public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9]+([._-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        
        return email.matches(emailRegex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        while (true) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();

            if (isValidEmail(email)) {
                System.out.println("Valid email: " + email);
                break;
            } else {
                System.out.println("Invalid email. Please try again.");
            }
        }
        
        scanner.close();
    }

}
