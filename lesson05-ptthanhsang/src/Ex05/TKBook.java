package Ex05;

public class TKBook extends Book {
	
	private Double ThuePhantram;
	
	public TKBook(String Id, Double Price, String Publisher, Double ThuePhantram ) {
		super(Id, Price, Publisher);
		this.ThuePhantram = ThuePhantram;
		
	}
	
	public Double CaculatePrice() {
		return Price * ( 1 + ThuePhantram/100);
	}
	

}
