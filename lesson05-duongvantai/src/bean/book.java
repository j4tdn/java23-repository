package bean;

public class book {
	private String id;
	double price;
	String publisher;
	
	public book() {
		// TODO Auto-generated constructor stub
	}

	public book(String id, double price, String publisher) {
		super();
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", price=" + price + ", publisher=" + publisher + "]";
	}

}
