package test03.ex05;

public class Book  {
	
	private String id;
	private Double salePrice;
	private String publisher;
	
	public Book() {	
	}

	public Book(String id, Double salePrice, String publisher) {
		this.id = id;
		this.salePrice = salePrice;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
