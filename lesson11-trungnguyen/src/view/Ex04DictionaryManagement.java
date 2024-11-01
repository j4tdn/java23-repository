package view;

import java.util.Scanner;
import java.util.Set;

import bean.Word;
import model.DictionaryDataModel;

public class Ex04DictionaryManagement {

	public static void main(String[] args) {
		Set<Word> words = DictionaryDataModel.generateMockData();
		
		System.out.println(" =============== Hiển thị các từ ===============");
		showDictionary(words);
		
		System.out.println(" =============== Tìm từ ===============");
		findWord(words);
		
		System.out.println(" =============== Thêm từ ===============");
		addWord(words);
		
		System.out.println(" =============== Hiển thị các từ ===============");
		showDictionary(words);
	}
	
	public static boolean addWord(Set<Word> dictionary) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập từ: ");
        String term = scanner.nextLine();
        System.out.print("Nhập nghĩa: ");
        String meaning = scanner.nextLine();
        System.out.print("Nhập loại từ (danh từ, động từ, tính từ, ...): ");
        String type = scanner.nextLine();
        System.out.print("Nhập ghi chú: ");
        String note = scanner.nextLine();

        Word word = new Word(term, meaning, type, note);
        if (dictionary.add(word)) {
            System.out.println("Đã thêm từ: " + word.getTerm());
            scanner.close();
            return true;
        } else {
            System.out.println("Từ '" + word.getTerm() + "' đã tồn tại trong từ điển.");
            scanner.close();
            return false;
        }
	}
	public static void findWord(Set<Word> dictionary) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập từ cần tra");
		String searchTerm = scanner.nextLine();
		for (Word word : dictionary) {
            if (word.getTerm().equalsIgnoreCase(searchTerm)) {
            	System.out.println("Tìm thấy " + word);
            	return;
            }
        }
		System.out.println("Không tìm thấy từ");
	}
	
	public static void showDictionary(Set<Word> dictionary) {
		if (dictionary.isEmpty()) {
			System.out.println("Từ điển trống.");
		} else {
			for (Word word : dictionary) {
				System.out.println(word);
				System.out.println("------------");
			}
		}
	}
}
