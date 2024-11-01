package model;

import java.util.ArrayList;
import java.util.List;

import bean.Word;

public class Dictionary {
    private List<Word> words;

    public Dictionary() {
        words = new ArrayList<>();
    }

   
    public void addWord(Word word) {
        words.add(word);
        System.out.println("Đã thêm từ: " + word.getWord());
    }


    public Word lookup(String word) {
        for (Word w : words) {
            if (w.getWord().equalsIgnoreCase(word)) {
                return w;
            }
        }
        return null;
    }
}

