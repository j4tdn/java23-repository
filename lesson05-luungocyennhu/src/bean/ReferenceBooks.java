package bean;

public class ReferenceBooks extends Book {
	private Double tax;
	
	public ReferenceBooks() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBooks(String idBook, Double price, String nxb, Double tax) {
		super(idBook, price, nxb);
		this.tax = tax;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBooks [idBook= " + getIdBook() 
		+ ", price= " + getPrice() 
		+ ", nxb= " + getNxb()
		+ " [tax=" + tax + "]";
	}
	
	public double totalAmount(Book[] books) {
		double sum = 0;
		for (Book b : books) {
			if (b instanceof ReferenceBooks r) {
				sum += r.getPrice() * (1 + r.tax);
			}
		}
		return sum;
	}

}
