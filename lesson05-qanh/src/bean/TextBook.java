package bean;

public class TextBook extends Book {
    private String condition; 

    public TextBook(String id, double price, String publisher, String condition) {
        super(id, price, publisher);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    @Override
    public double calculatePrice() {
        if (condition.equalsIgnoreCase("old")) {
            return price * 0.7; 
        } else {
            return price;
        }
    }
}
