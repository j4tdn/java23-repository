package test03.ex05;

public class ReferenceBook extends Book{
	
	private Double taxInPercent;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, Double salesPrice, String publisher, Double taxInPercent) {
		super(id, salesPrice, publisher);
		this.setTaxInPercent(taxInPercent);
	}

	public Double getTaxInPercent() {
		return taxInPercent;
	}

	public void setTaxInPercent(Double taxInPercent) {
		this.taxInPercent = taxInPercent;
	}
	
	@Override
	public String toString() {
		return "ReferenceBook [id=" + getId() + ", salesPrice=" + getSalesPrice()
				+ ", publisher=" + getPublisher() + ", taxInPercent=" + getTaxInPercent() + "]";
	}
	
}
