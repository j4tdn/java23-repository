package inheritance.cclass;

public class ReferencaBook extends Book {

	private Double tax;

	public ReferencaBook() {
	}
    
	public ReferencaBook(Integer id, String name, Double salesPrice, String publisher,Double tax) {
		super(id, name, salesPrice, publisher);
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
		return "TextBook [getId()=" + getId()
				+ ", getName()=" + getName() 
				+ ", getSalesPrice()=" + getSalesPrice() 
				+ ", getPublisher()=" + getPublisher() 
				+ ", getTax()=" + getTax();
	}
	
}
