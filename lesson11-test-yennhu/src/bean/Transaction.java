package bean;

import java.time.LocalDateTime;

public class Transaction extends Trader {

	private Integer id;
	private LocalDateTime created_item;
	private Double value;
	private Trader trader;
	
	public Transaction() {
	}

	public Transaction(Integer id,Trader trader, LocalDateTime created_item, Double value) {
		
		this.id = id;
		this.trader = trader;
		this.created_item = created_item;
		this.value = value;
	}

	public Transaction(Integer id, String name, String city) {
		super(id, name, city);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", created_item=" + created_item + ", value=" + value + ", trader=" + trader
				+ "]";
	}
}
