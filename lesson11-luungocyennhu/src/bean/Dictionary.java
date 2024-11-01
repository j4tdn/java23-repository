package bean;

public class Dictionary {

	private String word;
	private String meanings;
	private String wordTypes;
	private String notes;
	
	public Dictionary() {
	}

	public Dictionary(String word, String meanings, String wordTypes, String notes) {
		this.word = word;
		this.meanings = meanings;
		this.wordTypes = wordTypes;
		this.notes = notes;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeanings() {
		return meanings;
	}

	public void setMeanings(String meanings) {
		this.meanings = meanings;
	}

	public String getWordTypes() {
		return wordTypes;
	}

	public void setWordTypes(String wordTypes) {
		this.wordTypes = wordTypes;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", meanings=" + meanings + ", wordTypes=" + wordTypes + ", notes=" + notes
				+ "]";
	}
}
