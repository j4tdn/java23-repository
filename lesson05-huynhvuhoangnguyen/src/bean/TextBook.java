package bean;

public class TextBook extends Book{
	
	private String condition;
	
	public TextBook() {
	}

	public TextBook(String id, double price, String other, String condition) {
		super(id, price, other);
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
		return "TextBook [condition=" + condition + ", getCondition()=" + getCondition() + ", getId()=" + getId()
				+ ", getPrice()=" + getPrice() + ", getOther()=" + getAuthor() + "]";
	}

	public double getPrice() {
		if (condition.equals("old")) {
			return price * 0.7;
		}
		return price;
	}

}
