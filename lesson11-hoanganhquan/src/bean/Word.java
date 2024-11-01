package bean;

import java.util.Objects;

public class Word {

	
	private String meaning;
    private String type;
    private String note;

    public Word(String meaning, String type, String note) {
        this.meaning = meaning;
        this.type = type;
        this.note = note;
    }
    
    

    @Override
	public int hashCode() {
		return Objects.hash(meaning, note, type);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(meaning, other.meaning) && Objects.equals(note, other.note)
				&& Objects.equals(type, other.type);
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



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	@Override
    public String toString() {
        return "Meaning: " + meaning + "\nType: " + type + "\nNote: " + note;
    }
    
    
}
