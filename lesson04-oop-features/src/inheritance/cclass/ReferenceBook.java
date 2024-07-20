package inheritance.cclass;

public class ReferenceBook extends Book {
	private Double tax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(Integer id, String name, Double salesPrice, String publisher, Double tax) {
		super(id, name, salesPrice, publisher);
		this.setTax(tax);
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	@Override
	public String toString () {
		return  "TextBook [id=" + getId() + ", name=" + getName() + ", salesPrice=" + getSalesPrice()
		+ ", publisher=" + getPublisher() + ","
		+ ", tax=" + getTax() + "]";
	}
	
}
