package bean;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	private Map<String, Word> dictionary;

    public Dictionary() {
    	dictionary = new HashMap<>();
    }

   
    public void addWord(String word, String meaning, String type, String note) {
        Word newWord = new Word(meaning, type, note);
        dictionary.put(word, newWord);
        System.out.println("Added word: " + word);
    }



	public void lookupWord(String word) {
        if (dictionary.containsKey(word)) {
            System.out.println("Word: " + word);
            System.out.println(dictionary.get(word));
        } else {
            System.out.println("Word not found!");
        }
	}
	
}
