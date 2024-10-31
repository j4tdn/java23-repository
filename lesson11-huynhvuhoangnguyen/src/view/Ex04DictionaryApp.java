package view;

import java.util.Scanner;

import bean.Dictionary;

public class Ex04DictionaryApp {

	public static void main(String[] args) {
		
		Dictionary dictionary = new Dictionary();
		Scanner ip = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add a new word:");
            System.out.println("2. Look up: ");
            System.out.println("0. Exit!");
            System.out.print("Choose a function: ");
            
            int choice = ip.nextInt();
            ip.nextLine();
            
            switch(choice) {
            	case 1:
            		System.out.println("Enter word:");
            		String word = ip.nextLine();
            		System.out.println("Enter meaning:");
            		String meaning = ip.nextLine();
            		System.out.println("Enter word's catagory:");
            		String wordsCatagory = ip.nextLine();
            		System.out.println("Enter note:");
            		String note = ip.nextLine();
            		dictionary.add(word, meaning, wordsCatagory, note);
            		break;
            	case 2:
            		System.out.println("Enter word to look up:");
            		String lookUpWord = ip.nextLine();
            		dictionary.lookUp(lookUpWord);
            		break;
            	case 0:
            		System.out.println("Close the dictionary!!!");
            		ip.close();
            		return;
            	default:
            		System.out.println("Invalid choice. Please try agian!!!");
            }
		}
		
	}
	
}