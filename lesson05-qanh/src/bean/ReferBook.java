package bean;

public class ReferBook extends Book {
    private double tax;

    public ReferBook(String id, double price, String publisher, double tax) {
        super(id, price, publisher);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public double calculatePrice() {
        return price * (1 + tax);
    }
}


