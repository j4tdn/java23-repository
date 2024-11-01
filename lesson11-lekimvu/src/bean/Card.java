package bean;

public class Card {

   private String genre;
   private String value;
   
    public Card() {
	}

	public Card(String genre, String value) {
		this.genre = genre;
		this.value = value;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return   value +" "+  genre ;
	}
    
}