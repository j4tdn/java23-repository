package bean;

import java.util.Objects;

public class Word {
	
	private String word;
	private String meaning;
	private String wordsCatagory;
	private String note;
	
	public Word() {
	}

	public Word(String word, String meaning, String wordsCatagory, String note) {
		this.word = word;
		this.meaning = meaning;
		this.wordsCatagory = wordsCatagory;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getWordsCatagory() {
		return wordsCatagory;
	}

	public void setWordsCatagory(String wordsCatagory) {
		this.wordsCatagory = wordsCatagory;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if(!(o instanceof Word that)) {
			return false;
		}
		
		return getWord() == that.getWord();
	}

	@Override
	public String toString() {
		return "Word: " + word + "\n" +
	               "Meaning: " + meaning + "\n" +
	               "Word's Catagory: " + wordsCatagory + "\n" +
	               "Note: " + note + "\n";
	}
	
}