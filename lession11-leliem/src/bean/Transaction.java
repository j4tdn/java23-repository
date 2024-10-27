package bean;

public class Transaction {

	private int id;
	private Trader trader;
	private int createdItem;
	private int value;
	public Transaction() {
	}
	public Transaction(int id, Trader trader, int createdItem, int value) {
		super();
		this.id = id;
		this.trader = trader;
		this.createdItem = createdItem;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getCreatedItem() {
		return createdItem;
	}
	public void setCreatedItem(int createdItem) {
		this.createdItem = createdItem;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", createdItem=" + createdItem + ", value=" + value
				+ "]";
	}
	
}
