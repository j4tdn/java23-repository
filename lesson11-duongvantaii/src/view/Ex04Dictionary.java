package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import bean.Word;
import model.DataModel;

public class Ex04Dictionary {
	public static void main(String[] args) {
		List<Word> word = new ArrayList<>(DataModel.mockWord());
		Word t1 = new Word("ngủ" , "sleep", "động từ" , "trạng thái của cơ thể");
		// thêm từ vựng mới
		word.add(t1);
		System.out.println("1.Thêm mới từ vựng");
		generate(word);
		System.out.println("2.Tra từ điển");
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập từ cần tìm:  ");
		String newWord = ip.nextLine();
		Word dictionary = looUpDictionary(word, newWord);
		System.out.println(dictionary);
	}
	private static Word looUpDictionary(List<Word> words, String newWord) {
		for(var word : words) {
			if(word.getWord().equals(newWord));
			return word;
		}
		return null;
	}
	private static <T> void generate(Collection<T> elements) {
		elements.forEach(element -> System.out.println("   " + element));

	}
}