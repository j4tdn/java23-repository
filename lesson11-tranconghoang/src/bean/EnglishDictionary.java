package bean;

import java.util.Objects;

public class EnglishDictionary {

	private String word;
	private String meaning;
	private String type;
	private String notes;
	
	public EnglishDictionary() {
	}

	public EnglishDictionary(String word, String meaning, String type, String notes) {
		this.word = word;
		this.meaning = meaning;
		this.type = type;
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
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof EnglishDictionary))
			return false;
		EnglishDictionary that = (EnglishDictionary)o;
		return getWord().equalsIgnoreCase(that.getWord());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getWord());
	}
	
	@Override
	public String toString() {
		return "EnglishDictionary [word=" + word + ", meaning=" + meaning + ", type=" + type + ", notes=" + notes + "]";
	}
}
