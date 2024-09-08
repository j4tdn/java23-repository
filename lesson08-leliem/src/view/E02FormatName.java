package view;

import java.util.Scanner;

public class E02FormatName {
	 public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);

	        System.out.println("Enter a name [A-Za-z ]):");
	        String inputName = ip.nextLine();

	        if (!inputName.matches("[A-Za-z ]+")) {
	            System.out.println("Invalid name. Please enter a valid name..");
	            return;
	        }

	        String formattedName = formatName(inputName);

	        System.out.println("Result:");
	        System.out.println(formattedName);

	    }

	    private static String formatName(String name) {
	        String[] words = name.trim().split("\\s+");
	        StringBuilder formattedName = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
	                formattedName.append(formattedWord).append(" ");
	            }
	        }
	        return formattedName.toString().trim();
	    }
}
