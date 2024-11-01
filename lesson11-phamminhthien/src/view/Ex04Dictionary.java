package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Word;

public class Ex04Dictionary {

	private static List<Word> words;

	public static void main(String[] args) {
		Ex04Dictionary dic = new Ex04Dictionary();
		dic.runDictionary();
	}

	public Ex04Dictionary() {
		words = new ArrayList<>();
	}

	private static List<Word> addWord() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = ip.nextLine();

		System.out.print("Enter meaning: ");
		String meaning = ip.nextLine();

		System.out.print("Enter type (e.g., noun, verb): ");
		String type = ip.nextLine();

		System.out.print("Enter notes: ");
		String notes = ip.nextLine();

		Word newWord = new Word(word, meaning, type, notes);
		words.add(newWord);

		System.out.println("Added new word: " + newWord.getWord());
		return words;
	}

	private static Word searchWord(String keyword) {
		for (Word word : words) {
			if (word.getWord().equalsIgnoreCase(keyword)) {
				return word;
			}
		}
		return null; // Trả về null nếu không tìm thấy từ
	}

	private void runDictionary() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Dictionary Program");
			System.out.println("1. Add a new word");
			System.out.println("2. Search for a word");
			System.out.println("3. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addWord();
				break;

			case 2:
				System.out.print("Enter word to search: ");
				String keyword = scanner.nextLine();
				Word result = searchWord(keyword);

				if (result != null) {
					System.out.println("Found word:\n" + result);
				} else {
					System.out.println("Word not found.");
				}
				break;

			case 3:
				System.out.println("Exiting the program.");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
