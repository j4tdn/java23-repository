package bean;

public class ReferenceBook extends Book {
	private float tax;

	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String id, float price, String bookPublisher, float tax) {
		super(id, price, bookPublisher);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "RefrenceBook [tax=" + tax + "]";
	}
}
