package Ex05;

public class GKBook extends Book {
	private Boolean isNew;
	
	public GKBook (String Id, Double Price, String Publisher, Boolean isNew) {
		super(Id, Price, Publisher);
		this.isNew = isNew;
	}
	
	public Double CaculatePrice() {
		if(isNew) {
			return Price();
		} else {
			return Price()*0.7;
		}
	}

	private Double Price() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
