package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import bean.EnglishDictionary;

public class Ex04EnglishDictionaryApp {
	
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		var words = new ArrayList<>(mockData());
		
		generate("Danh sách từ vựng", words);
		
		var newWord= addWord();
		
		words.add(newWord);
		
		// Failed when adding a duplicate word :((
		for (EnglishDictionary word : words) 
			if(word.getWord() == null) {
				System.out.println("--> Từ này đã có, không thể thêm !");
				words.remove(word);
				break;
			}
		
		generate("\n1. Danh sách CD sau khi thêm mới", words);
		
		lookUpDictionary(words);
		
	}
	
	private static void lookUpDictionary(List<EnglishDictionary> words) {
		System.out.print("Nhập từ cần tra cứu: ");
		String text = ip.nextLine();
		for(EnglishDictionary word: words)
			if(word.getWord().equalsIgnoreCase(text)) {
				System.out.println(word);
				System.exit(0);	
			}
		System.out.println("Không tìm thấy từ cần tra cứu !");
	}
	
	private static EnglishDictionary addWord(){
		
		var copy = new ArrayList<>(mockData());
		
		System.out.println("--Nhập thông tin từ vựng cần thêm--");
		System.out.print("Nhập từ: ");
		String word = ip.nextLine();
		System.out.print("Nhập nghĩa: ");
		String meaning = ip.nextLine();
		System.out.print("Nhập từ loại: ");
		String type = ip.nextLine();
		System.out.print("Nhập ghi chú: ");
		String notes = ip.nextLine();
		
		EnglishDictionary newWord = new EnglishDictionary(word, meaning, type, notes);
		if(!copy.contains(newWord))
			return newWord;
		else 
			return new EnglishDictionary();
	}
	
	private static List<EnglishDictionary> mockData(){
		return List.of(
				new EnglishDictionary("goat", "An animal related to sheep that usually has horns and a beard", "Noun", "Other meaning: greatest of all time"),
				new EnglishDictionary("aberration", "A departure from the usual", "Noun", "Used in contexts like optics"),
				new EnglishDictionary("capitulate", "To surrender", "Verb", "Common in military terms"),
				new EnglishDictionary("disparate", "Essentially different", "Adjective", "Often in social discussions"),
				new EnglishDictionary("ebullient", "Cheerful and energetic", "Adjective", "From Latin 'ebullire'"),
				new EnglishDictionary("facilitate", "To make easier", "Verb", "Common in business contexts"),
				new EnglishDictionary("garrulous", "Excessively talkative", "Adjective", "Describes chatty people"),
				new EnglishDictionary("harangue", "A lengthy aggressive speech", "Noun", "Emotional and forceful"),
				new EnglishDictionary("innuendo", "An indirect hint", "Noun", "Used in gossip"),
				new EnglishDictionary("juxtaposition", "Close contrast of things", "Noun", "Common in art and literature")
				);
	}
	
	private static <T> void generate(String prefix, Collection<T> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(element -> System.out.println("  + " + element));
		System.out.println("}\n");
	}
}
