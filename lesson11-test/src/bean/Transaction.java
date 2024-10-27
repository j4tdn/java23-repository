package bean;

public class Transaction {

	private Integer id;
	private String trader;
	private Integer created_item;
	private Double value;	
	
	public Transaction() {
	}

	public Transaction(Integer id, String trader, Integer created_item, Double value) {
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

	public String getTrader() {
		return trader;
	}

	public void setTrader(String trader) {
		this.trader = trader;
	}

	public Integer getCreated_item() {
		return created_item;
	}

	public void setCreated_item(Integer created_item) {
		this.created_item = created_item;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Transaction )) {
			return false;
		}
         Transaction that = (Transaction)o;
         return getId() == that.getId();
	}
	
}
