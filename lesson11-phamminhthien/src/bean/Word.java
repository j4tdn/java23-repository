package bean;

public class Word {
	private String word;    
    private String meaning; 
    private String type;    
    private String notes;
    public Word() {
	}
	public Word(String word, String meaning, String type, String notes) {
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
	public String toString() {
		return "Word [word=" + word + ", meaning=" + meaning + ", type=" + type + ", notes=" + notes + "]";
	}
    
    
}
