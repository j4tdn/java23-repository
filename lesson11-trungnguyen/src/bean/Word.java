package bean;

import java.util.Objects;

public class Word {
	
	private String term;
	private String meaning;
	private String type;
	private String note;
	
	public Word() {
	}

	public Word(String term, String meaning, String type, String note) {
		super();
		this.term = term;
		this.meaning = meaning;
		this.type = type;
		this.note = note;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
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
	public int hashCode() {
		return Objects.hash(term);
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
		return term.equalsIgnoreCase(other.getTerm());
	}

	@Override
	public String toString() {
		return "Word [term=" + term + ", meaning=" + meaning + ", type=" + type + ", note=" + note + "]";
	}
	
}
