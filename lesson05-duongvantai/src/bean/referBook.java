package bean;

public class referBook extends book {
		
	private Double tax;
	
	public referBook(String id, double price, String publisher, Double tax) {
		super(id,price,publisher);
		this.tax = tax;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return super.toString()+"referBook [tax=" + tax + "]";
	}

}
