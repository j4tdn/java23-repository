package bean;

public class Transaction {

	int id;
    Trader trader;
    int year;
    String createdItem;
    int value;

    public Transaction(int id, Trader trader, int year, String createdItem, int value) {
        this.id = id;
        this.trader = trader;
        this.year = year;
        this.createdItem = createdItem;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Transaction{id=" + id + ", trader=" + trader + ", value=" + value + "}";
    }
	
}
