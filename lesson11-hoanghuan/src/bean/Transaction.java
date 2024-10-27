package bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
	int id;
	Trader trader;
	LocalDate created_item;
	double value;
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", created_item=" + created_item + ", value=" + value
				+ "]";
	}
	public Transaction(int id, Trader trader, String created_item, double value) {
		super();
		this.id = id;
		this.trader = trader;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-d");
		this.created_item = LocalDate.parse(created_item, formatter);
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
	public LocalDate getCreated_item() {
		return created_item;
	}
	public void setCreated_item(LocalDate created_item) {
		this.created_item = created_item;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
}
