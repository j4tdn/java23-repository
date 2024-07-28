package bean;

public class TextBook extends Book{
	private String status;
	
	public TextBook() {
	}

	public TextBook(String id, float price, String nxb, String status) {
		super(id, price, nxb);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + getId() + ", price=" + getPrice() + ", nxb=" + getNxb() + "status=" + getStatus() + "]";
	}
	
	
}
