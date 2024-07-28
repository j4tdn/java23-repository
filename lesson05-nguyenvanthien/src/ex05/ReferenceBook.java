package ex05;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook(String itemCode, String name, int quantity, String publisher, double price, double tax) {
		super(itemCode, name, quantity, publisher, price);
		this.tax = tax;
	}

	@Override
	public double calculatePrice() {
		return price * (1 + tax / 100);
	}
}