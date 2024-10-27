package bean;

public class Transaction {

	private int id;
	private Trader trader;
	private String createdItem ;
	private int value;
	
	public Transaction() {
	}

	public Transaction(int id, Trader trader, String createdItem, int value) {
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

	public String getCreatedItem() {
		return createdItem;
	}

	public void setCreatedItem(String createdItem) {
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
