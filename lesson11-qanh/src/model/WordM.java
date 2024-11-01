package model;

import bean.WordB;
import java.util.ArrayList;
import java.util.List;

public class WordM {
    private List<WordB> words;

    public WordM() {
    	words = new ArrayList<>();
    } 
    public void addWord(String vocabulary, String meaning, String wordType, String notes) {
        WordB newWord = new WordB(vocabulary, meaning, wordType, notes);
        words.add(newWord);
        System.out.println("Add vocabularys : " + vocabulary);
    }
    public void searchWord(String vocabulary) {
        boolean found = false;
        for (WordB word : words) {
            if (word.getVocabulary().equalsIgnoreCase(vocabulary)) {
                System.out.println("The word found is :");
                System.out.println(word);  
                found = true;
                break;
            }        
        }
    }
}
