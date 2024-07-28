package ex05;

public class TextBook extends Book {
	private boolean isNew;

	public TextBook(String itemCode, String name, int quantity, String publisher, double price, boolean isNew) {
		super(itemCode, name, quantity, publisher, price);
		this.isNew = isNew;
	}

	@Override
	public double calculatePrice() {
		if (!isNew) {
			return price * 0.3;
		}
		return price;
	}
}
