package bean;

public class Book {
    protected String id;
    protected double price;
    protected String publisher;

    public Book(String id, double price, String publisher) {
        this.id = id;
        this.price = price;
        this.publisher = publisher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    
    public double calculatePrice() {
        return price;
    }
}

