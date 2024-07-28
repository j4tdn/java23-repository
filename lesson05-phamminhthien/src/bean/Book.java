package bean;

public class Book {
	private String id;
	private float price;
	private String nxb;
	
	public Book() {
	}

	public Book(String id, float price, String nxb) {
		super();
		this.id = id;
		this.price = price;
		this.nxb = nxb;
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

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", nxb=" + nxb + "]";
	}
	
	
}
