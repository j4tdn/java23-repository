package bean;

import java.util.Objects;

public class Word {
	private String word;
	private String meaning;
	private String wordType;
	private String notes;
	public Word(String word, String meaning, String wordType, String notes) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.wordType = wordType;
		this.notes = notes;
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
	public String getWordType() {
		return wordType;
	}
	public void setWordType(String wordType) {
		this.wordType = wordType;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
	
	@Override
	public String toString() {
		return "word [word=" + word + ", meaning=" + meaning + ", wordType=" + wordType + ", notes=" + notes + "]";
	}
	
}
