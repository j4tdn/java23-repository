package bean;

public class Book {

	private String bookId;
	protected double price;
	private String author;
	
	public Book() {
	}

	public Book(String id, double price, String other) {
		super();
		this.bookId = id;
		this.price = price;
		this.author = other;
	}

	public String getId() {
		return bookId;
	}

	public void setId(String id) {
		this.bookId = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setOther(String other) {
		this.author = other;
	}

	@Override
	public String toString() {
		return "Book [id=" + bookId + ", price=" + price + ", other=" + author + "]";
	}
	
	
	
}
