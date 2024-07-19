package inheritance.cclass;

public class Book {
	
	private Integer id;
	private String name;
	private Double salesPice;
	private String publisher;
	
	public Book() {
	}

	public Book(Integer id, String name, Double salesPice, String publisher) {
		this.id = id;
		this.name = name;
		this.salesPice = salesPice;
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

	public Double getSalesPice() {
		return salesPice;
	}

	public void setSalesPice(Double salesPice) {
		this.salesPice = salesPice;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", salesPice=" + salesPice + ", publisher=" + publisher + "]";
	}
	
	
}
