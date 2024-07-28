package bean;

public class ReferenceBook extends Book {
	
	private double tax;
	
	public ReferenceBook() {

	}

	public ReferenceBook(int id, double salesPrice, String owner,double tax) {
		super(id, salesPrice, owner);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [id=" + getId() 
				+  ", salesPrice=" + getSalesPrice() 
				+ ", owner=" + getOwner() 
				+ "tax=" + tax + "]";
	}

	@Override
	public double sum() {
		return getSalesPrice()*(1+tax/100);
	}
	
	
	

	
}
