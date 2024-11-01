package view;

import model.WordM;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordM dictionary = new WordM();
        int choice;

        do {
            System.out.println("\n------English Dictionary------- ");
            System.out.println("1. Add new word");
            System.out.println("2. search word");
            System.out.println("3. out");
            
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter vocabulary : ");
                    String vocabulary = sc.nextLine();
                    System.out.print("Enter meaning    : ");
                    String meaning = sc.nextLine();
                    System.out.print("Enter type       : "); 
                    String wordType = sc.nextLine();
                    System.out.print("Enter notes      : ");
                    String notes = sc.nextLine();
                    dictionary.addWord(vocabulary, meaning, wordType, notes);
                    break;
                case 2:
                    System.out.print("Enter ửod to search: ");
                    String searchVocabulary = sc.nextLine();
                    dictionary.searchWord(searchVocabulary);
                    break;
                case 3:
                    System.out.println("Exit");
                default:
                    System.out.println("select again. please select from 1 - 3 ");
            }
        } while (choice != 3); 
    }
}
