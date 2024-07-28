package ex05;

public class TextBook extends Book {
	private String condition;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String string, double salesPrices, String publisher, String condition) {
		super(string, salesPrices, publisher);
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "TextBook [condition=" + condition + "]" + super.toString();
	}
	
	
}
