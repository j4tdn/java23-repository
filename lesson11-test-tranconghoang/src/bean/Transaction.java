package bean;

public class Transaction {

	private Integer id;
	private Trader trader;
	private String created_item;
	private Double value;
	
	public Transaction() {
	}

	public Transaction(Integer id, Trader trader, String created_item, Double value) {
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

	public String getCreated_item() {
		return created_item;
	}

	public void setCreated_item(String created_item) {
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
