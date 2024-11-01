package bean;

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
    public String toString() {
        return "Meaning: " + meaning + "\nType: " + type + "\nNote: " + note;
    }

}
