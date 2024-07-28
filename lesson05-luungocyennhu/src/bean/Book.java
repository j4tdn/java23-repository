package bean;

public abstract class Book {
	private String idBook;
	private Double price;
	private String nxb;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String idBook, Double price, String nxb) {
		this.idBook = idBook;
		this.price = price;
		this.nxb = nxb;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", price=" + price + ", nxb=" + nxb + "]";
	}
	
	public abstract double totalAmount(Book[] books);
	
}
