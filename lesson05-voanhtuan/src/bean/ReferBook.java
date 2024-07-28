package bean;

public class ReferBook extends Book{
	private double tax;

	public ReferBook(String bookID, double price, String publisher, double tax)
	{
		super(bookID, price, publisher);
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
		return "ReferBook [" +
				"bookID=" + getBookID() +
				", price=" + getPrice() +
				", publisher=" + getPublisher() +
				", tax=" + getTax() + "]";
	}

	@Override
    public double getFinalPrice() {
        return getPrice() * (1 + tax / 100);
    }
	
	
}
