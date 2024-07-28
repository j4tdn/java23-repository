package bean;

public class ReferenceBook extends Book{
	private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, double salePrices, String publisher, double tax) {
		super(id, salePrices, publisher);
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
		return "Book [id=" + getId() + ", cost=" + getSalePrices() + ", publisher=" + getPublisher() + ", Tax(%)=" + tax + "]";
	}
	
	
}
