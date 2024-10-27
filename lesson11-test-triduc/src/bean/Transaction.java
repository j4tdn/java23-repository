package bean;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
	private Integer id;
	private Trader trader;
	private LocalDate created_item;
	private Double value;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the trader
	 */
	public Trader getTrader() {
		return trader;
	}

	/**
	 * @param trader the trader to set
	 */
	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	/**
	 * @return the created_item
	 */
	public LocalDate getCreated_item() {
		return created_item;
	}

	/**
	 * @param created_item the created_item to set
	 */
	public void setCreated_item(LocalDate created_item) {
		this.created_item = created_item;
	}

	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(created_item, id, trader, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(created_item, other.created_item) && Objects.equals(id, other.id)
				&& Objects.equals(trader, other.trader) && Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", trader=" + trader + ", created_item=" + created_item + ", value=" + value
				+ "]";
	}


}
