package inheritance.cclass;

public class Book {
	
	private Integer id;
	private String name;
	private Double salesPrice;
	private String publisher;
	
	public Book() {
	}

	public Book(Integer id, String name, Double salesPrice, String publisher) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.publisher = publisher;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", publisher=" + publisher + "]";
	}
}