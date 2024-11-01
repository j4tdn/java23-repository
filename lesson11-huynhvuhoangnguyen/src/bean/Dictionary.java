package bean;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	private Map<String, Word> words;
	
	public Dictionary() {
		words = new HashMap<>();
	}
	
	public void add(String word, String meaning, String wordsCatagory, String note) {
		if(!words.containsKey(word)) {
			words.put(word, new Word(word, meaning, wordsCatagory, note));
			System.out.println("\"" + word + "\" is added to the dictionary.");
		} else {
			System.out.println("\"" + word + "\" alredy existed in the dictionary.");
		}
	}
	
	public void lookUp(String word) {
		Word w = words.get(word);
		if(w != null) {
			System.out.println(w);
		} else {
			System.out.println("Can't find \"" + word + "\" in the dictionary");
		}
	}
	
}