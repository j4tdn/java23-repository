package bean;

public class TextBook extends Book {
	private String status;
	
	public TextBook() {

	}

	public TextBook(int id, double salesPrice, String owner,String status) {
		super(id, salesPrice, owner);
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
		return "TextBook [id=" + getId() 
				+  ", salesPrice=" + getSalesPrice() 
				+ ", owner=" + getOwner() 
				+ "status=" + status + "]";
	}

	@Override
	public double sum() {
    if(status == "old") {
		return getSalesPrice()/0.3;			
		} else {
			return getSalesPrice();

	}
	}}
	
