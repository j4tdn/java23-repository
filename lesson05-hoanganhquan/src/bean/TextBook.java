package bean;

public class TextBook extends Book {
	private String condition;

    public TextBook(String id, double price, String publisher, String condition) {
        super(id, price, publisher, condition);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public double calculateTotalPrice() {
        if (condition.equalsIgnoreCase("cũ")) {
            return getPrice() * 0.7; 
        }
        return getPrice();
    }
}
