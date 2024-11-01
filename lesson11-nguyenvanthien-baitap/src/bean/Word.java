package bean;

public class Word {
    private String word;
    private String meaning;
    private String type; //  danh từ, động từ
    private String note;

    public Word(String word, String meaning, String type, String note) {
        this.word = word;
        this.meaning = meaning;
        this.type = type;
        this.note = note;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getType() {
        return type;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Từ: " + word + "\nNghĩa: " + meaning + "\nLoại từ: " + type + "\nGhi chú: " + note;
    }
}
