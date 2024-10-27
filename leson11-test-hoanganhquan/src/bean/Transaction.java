package bean;

import java.util.Date;

public class Transaction {

	private Integer id;
	private Trader trader;
	private Date createdItem;
	private Integer value;
	
	public Transaction() {
	}
	
	public Transaction(Integer id, Trader trader, Date createdItem, Integer value) {
		this.id = id;
		this.trader = trader;
		this.createdItem = createdItem;
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

	public Date getCreatedItem() {
		return createdItem;
	}

	public void setCreatedItem(Date createdItem) {
		this.createdItem = createdItem;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", createdItem=" + createdItem + ", value=" + value
				+ "]";
	}
	
	
}
