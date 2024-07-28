package bean;

public class Book {
	private String id;
	private float price;
	private String bookPublisher;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String id, float price, String bookPublisher) {
		super();
		this.id = id;
		this.price = price;
		this.bookPublisher = bookPublisher;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", bookPublisher=" + bookPublisher + "]";
	}
	
}
