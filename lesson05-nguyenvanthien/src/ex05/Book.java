package ex05;

public abstract class Book {
	protected String itemCode;
	protected String name;
	protected int quantity;
	protected String publisher;
	protected double price;

	public Book(String itemCode, String name, int quantity, String publisher, double price) {
		this.itemCode = itemCode;
		this.name = name;
		this.quantity = quantity;
		this.publisher = publisher;
		this.price = price;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract double calculatePrice();

	@Override
	public String toString() {
		return String.format("%s: %s, %s, Qty: %d, Pub: %s, Price: %.2f", itemCode, name, publisher, quantity,
				calculatePrice());
	}
	public static void main(String[] args) {
		Text Book  tb1 = new TextBook{"SGK",2000,} 
	}

}