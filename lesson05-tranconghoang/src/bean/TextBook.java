package bean;

public class TextBook extends Book {

	private String condition;
	
	public TextBook() {
	}


	public TextBook(String id, Double salesPrice, String publisher, String condition) {
		super(id, salesPrice, publisher);
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
		return "TextBook [id=" + getId() + ", salesPrice=" + getSalesPrice() + ", publisher=" + getPublisher() 
		+ ", condition=" + condition + "]";
	}

	
}
