package bean;

public class ReferenceBook extends Book {

	private Double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, Double salesPrice, String publisher, Double tax) {
		super(id, salesPrice, publisher);
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
		return "ReferenceBook [id=" + getId() + ", salesPrice=" + getSalesPrice() + ", publisher=" + getPublisher() 
		+ ", tax=" + tax + "]";
	}
	
	
}
