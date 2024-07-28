package bean;

public class TextBooks extends Book {
	private String state;
	
	public TextBooks() {
		// TODO Auto-generated constructor stub
	}

	public TextBooks(String idBook, Double price, String nxb, String state) {
		super(idBook, price, nxb);
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "TextBooks [idBook= " + getIdBook() 
		+ ", price= " + getPrice() 
		+ ", nxb= " + getNxb()
		+ ", state=" + state + "]";
	}
	
	public double totalAmount(Book[] bs) {
		double sum = 0;
		for (Book b : bs) {
			if (b instanceof TextBooks t) {
				if (t.getState() == "Cũ") {
					sum += t.getPrice() * 0.7;
				}
				sum += t.getPrice();
			}
		}
		return sum;
	}

}
