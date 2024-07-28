package bean;

public class RefrenceBook extends Book {

	private int tax;
	
	public RefrenceBook() {
	}

	public RefrenceBook(String id, float price, String nxb, int tax) {
		super(id, price, nxb);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "RefrenceBook [tax=" + tax + "]";
	}

	
	
}
