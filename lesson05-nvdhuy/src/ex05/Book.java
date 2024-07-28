package ex05;

public class Book {
	private String id;
	private double salesPrices;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String string, double salesPrices, String publisher) {
		super();
		this.id = string;
		this.salesPrices = salesPrices;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalesPrices() {
		return salesPrices;
	}

	public void setSalesPrices(double salesPrices) {
		this.salesPrices = salesPrices;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", salesPrices=" + salesPrices + ", publisher=" + publisher + "]" + super.toString();
	}
	
	
}
