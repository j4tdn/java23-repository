package bean;

import java.time.LocalDateTime;

public class Transaction {
	
	Integer id;
	Trader trader;
	LocalDateTime created_item;
	Double value;
	
	public Transaction() {
	}

	public Transaction(Integer id, Trader trader, LocalDateTime created_item, Double value) {
		super();
		this.id = id;
		this.trader = trader;
		this.created_item = created_item;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public LocalDateTime getCreated_item() {
		return created_item;
	}

	public void setCreated_item(LocalDateTime created_item) {
		this.created_item = created_item;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", created_item=" + created_item + ", value=" + value
				+ "]";
	}
	
	
}
