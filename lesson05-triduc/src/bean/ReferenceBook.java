package bean;

public class ReferenceBook extends Book{
	private Double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String idBook, Double money, String publisher, Double tax) {
		super(idBook, money, publisher);
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
		return "ReferenceBook [idBook=" + getIdBook() + ", money=" + getMoney() + 
				", publisher=" + getPublisher() + ", Tax = " + getTax() + "]";
	}
}
