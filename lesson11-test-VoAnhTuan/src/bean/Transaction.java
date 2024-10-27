package bean;

import java.time.LocalDate;

public class Transaction {

	private int id;
	private Trader trader;
	private LocalDate createdItem;
	private int values;

	public Transaction() {
	}

	public Transaction(int id, Trader trader, LocalDate createdItem, int values) {
		this.id = id;
		this.trader = trader;
		this.createdItem = createdItem;
		this.values = values;
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

	public LocalDate getCreatedItem() {
		return createdItem;
	}

	public void setCreatedItem(LocalDate createdItem) {
		this.createdItem = createdItem;
	}

	public int getValues() {
		return values;
	}

	public void setValues(int values) {
		this.values = values;
	}
	

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", createdItem=" + createdItem + ", values=" + values
				+ "]";
	}
	
}