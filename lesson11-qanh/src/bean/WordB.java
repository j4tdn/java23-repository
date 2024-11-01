package bean;

public class WordB {
    private String vocabulary;       
    private String meaning;    
    private String wordType;  
    private String notes;      

    // Constructor
    public WordB(String vocabulary, String meaning, String wordType, String notes) {
        this.vocabulary = vocabulary;
        this.meaning = meaning;
        this.wordType = wordType;
        this.notes = notes;
    }

	public String getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
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
	public String toString() {
		return "dictionary [vocabulary=" + vocabulary + ", meaning=" + meaning + ", wordType=" + wordType + ", notes="
				+ notes + "]";
	}

   

}
