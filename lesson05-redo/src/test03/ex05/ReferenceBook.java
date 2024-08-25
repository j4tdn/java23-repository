package test03.ex05;

public class ReferenceBook extends Book{

	private Double taxInPercent;
	public ReferenceBook() {
	}
	public ReferenceBook(String id, Double salePrice, String publisher, Double taxInPercent) {
		super(id, salePrice, publisher);
		this.taxInPercent = taxInPercent;
	}
	public Double getTaxInPercent() {
		return taxInPercent;
	}
	public void setTaxInPercent(Double taxInPercent) {
		this.taxInPercent = taxInPercent;
	}
	@Override
	public String toString() {
		return "ReferenceBook [Id()=" + getId() + ", SalePrice()="
				+ getSalePrice() + ", Publisher()=" + getPublisher() + ", getTaxInPercent()=" + getTaxInPercent() + "]";
	}
	
}
