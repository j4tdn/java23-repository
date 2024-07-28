package ex05;

public class References extends Book{
	private double tax;
	
	public References() {
		// TODO Auto-generated constructor stub
	}

	public References(String string, double salesPrices, String publisher, double tax) {
		super(string, salesPrices, publisher);
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
		return "References [tax=" + tax + "]" + super.toString();
	}
	
	
}
