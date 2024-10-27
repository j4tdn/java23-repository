package ex01;

public class Transaction {
	private String id;
	private Trader trader;
	private Integer value;
	private String item;
	private Integer year;



	public Transaction(String id, Trader trader, Integer value, String item, Integer year) {
		this.id = id;
		this.trader = trader;
		this.value = value;
		this.item = item;
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", value=" + value + ", item=" + item + ", year=" + year
				+ "]";
	}

}
