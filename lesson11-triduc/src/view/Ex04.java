package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Word;
import model.DataModel;
import utils.CollectionUtils;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<Word> words = new ArrayList<>(DataModel.mockDataWords());

		System.out.println("Welcome to bookshop");
		System.out.println("Select the number of action");
		int selection = 0;
		do {
			System.out.println("1. List Words: ");
			System.out.println("2. Add new Words: ");
			System.out.println("3. Search word (by word): ");
			System.out.println("4. Exit");
			
			selection = sc.nextInt();

			sc.nextLine();

			if (selection == 1) {
				CollectionUtils.generate("List words: ", words);
			}

			else if (selection == 2) {
				Word newWord = new Word();
				newWord.setWord(enterString("Enter Word:"));
				newWord.setMeaning(enterString("Enter meaning: "));
				newWord.setType(enterString("Enter type: "));
				newWord.setNote(enterString("Enter note: "));

				words.add(newWord);
				System.out.println("Add successful");
			}

			else if (selection == 3) {
				String search = enterString("Enter the word: ");
				words.forEach(word -> {
					if (word.getWord().equalsIgnoreCase(search))
						System.out.println(word);
				});
				}
			else if (selection == 4)
				break;
			else
				System.out.println("Wrong number, enter again");
		}
		while (selection != 4);
	}

	private static String enterString(String prefix) {
		System.out.print(prefix);
		return sc.nextLine();
	}

}
