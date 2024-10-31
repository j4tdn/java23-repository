package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Word;
import model.DataModel;

public class Ex04Dictionary {

	public static void main(String[] args) {

		List<Word> dictionary = new ArrayList<>(DataModel.generateWords());

		System.out.println("~~~~~~English Dictionary~~~~~~\n");

		// Thêm mới từ vựng
		Word newWord = new Word("sun", "mặt trời", "noun", "Ngôi sao ngay chính giữa trong hệ mặt trời");
		dictionary.add(newWord);
		System.out.println("Added new word: " + newWord);

		// Tra từ điển
		Scanner ip = new Scanner(System.in);
		System.out.print("\nEnter word to look up: ");
		String keyword = ip.nextLine();
		Word result = searchWord(dictionary, keyword);

		if (result != null) {
			System.out.println("Word found: " + result);
		} else {
			System.out.println("Word not found in dictionary.");
		}
	}

	// Phương thức tra từ điển
	private static Word searchWord(List<Word> dictionary, String keyword) {
		for (Word word : dictionary) {
			if (word.getWord().equalsIgnoreCase(keyword)) {
				return word;
			}
		}
		return null;
	}

}
