package bean;

public abstract class Book {
	private String bookId;
	private double price;
	private String publisher;
	private String condition;
	
	public Book() {
	}
	
	public Book (String bookId, double price, String publisher, String condition ) {
		this.bookId = bookId;
		this.price = price;
		this.publisher = publisher;
		this.condition  = condition ;
	}
	
	public String getBookId() {
		return bookId;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getCondition() {
		return condition;
	}
	
	public abstract double calculateTotalPrice();
}
