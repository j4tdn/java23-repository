package bean;

public class TextBook extends Book{
	
	private String condition;

	public TextBook(String bookID, double price, String publisher, String condition)
	{
		super(bookID, price, publisher);
		this.condition = condition;
	}
	
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	@Override
    public double getFinalPrice() {
        if ("old".equalsIgnoreCase(condition)) {
            return getPrice() * 0.7;
        }
        return getPrice();
    }
	
	@Override
	public String toString() {
		return "TextBook [" +
				"bookID=" + getBookID() +
				", price=" + getPrice() +
				", publisher=" + getPublisher() +
				", condition=" + getCondition() + "]";
	}
	
}
