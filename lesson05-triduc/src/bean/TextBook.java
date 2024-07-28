package bean;

public class TextBook extends Book{
	private int status;
	
	public TextBook() {
	}

	public TextBook(String idBook, Double money, String publisher, int status) {
		super(idBook, money, publisher);
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "TextBook [idBook=" + getIdBook() + ", money=" + getMoney() + 
				", publisher=" + getPublisher() + ", Status = " + getStatus() + "]";
	}
}
