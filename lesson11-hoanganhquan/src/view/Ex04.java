package view;

import java.util.Scanner;

import bean.Dictionary;

public class Ex04 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Dictionary myDictionary = new Dictionary();

        while (true) {
            System.out.println("\nDictionary Menu:");
            System.out.println("1. Add new word");
            System.out.println("2. Look up word");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter meaning: ");
                    String meaning = scanner.nextLine();
                    System.out.print("Enter type (e.g., noun, verb): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter note: ");
                    String note = scanner.nextLine();
                    myDictionary.addWord(word, meaning, type, note);
                    break;

                case 2:
                    System.out.print("Enter word to look up: ");
                    String lookupWord = scanner.nextLine();
                    myDictionary.lookupWord(lookupWord);
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
		
	}

}
