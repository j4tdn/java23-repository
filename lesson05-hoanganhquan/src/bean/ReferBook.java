package bean;

public class ReferBook extends Book {
	private double tax;

    public ReferBook(String id, double price, String publisher, double tax) {
        super(id, price, publisher, publisher);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * (1 + tax / 100);
    }
}
