package bean;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	private Map<String, Word> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }

    // Phương thức thêm từ mới vào từ điển
    public void addWord(String word, String meaning, String type, String note) {
        Word newWord = new Word(meaning, type, note);
        Dictionary.put(word, newWord);
        System.out.println("Added word: " + word);
    }

    // Phương thức tra cứu từ
    private static void put(String word, Word newWord) {
		// TODO Auto-generated method stub
		
	}

	public void lookupWord(String word) {
        if (Dictionary.containsKey(word)) {
            System.out.println("Word: " + word);
            System.out.println(Dictionary.get(word));
        } else {
            System.out.println("Word not found!");
        }
	
}

	private static char[] get(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean containsKey(String word) {
		// TODO Auto-generated method stub
		return false;
	}
}
