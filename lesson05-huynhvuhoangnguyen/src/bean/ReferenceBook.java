package bean;

public class ReferenceBook extends Book{
	
	private double taxRate;

	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String other, double taxRate) {
		super(id, price, other);
		this.taxRate = taxRate;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public String toString() {
		return "ReferenceBook [taxRate=" + taxRate + ", getId()=" + getId() + ", getPrice()=" + getPrice()
				+ ", getAuthor()=" + getAuthor() + "]";
	}
	
	public double getPrice() {
		return price * (1 + taxRate / 100);
	}
	
}
