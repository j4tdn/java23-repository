package inheritance.cclass;

public class ReferenceBook extends Book{
	
	private Double tax;
	public ReferenceBook() {
	}
	
	public ReferenceBook(Integer id, String name, Double salesPice, String publisher, Double tax) {
		super(id, name, salesPice, publisher);
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
		return "ReferenceBook [id=" + getId() + ", name=" + getName() + ", salesPice=" + getSalesPice() + ", publisher=" + getPublisher() + ", tax=" + getTax() +"]";
	}
	
}
