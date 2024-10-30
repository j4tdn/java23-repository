package bean;

import java.time.LocalDateTime;
import java.util.Objects;

public class TransactionFix {

	private Integer id;
	private TraderFix trader;
	private LocalDateTime createdTime;
	private Double value;
	
	public TransactionFix() {
	}

	public TransactionFix(Integer id, TraderFix trader, LocalDateTime createdTime, Double value) {
		this.id = id;
		this.trader = trader;
		this.createdTime = createdTime;
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TraderFix getTrader() {
		return trader;
	}

	public void setTrader(TraderFix trader) {
		this.trader = trader;
	}

	public LocalDateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public Integer getTraderId() {
		return getTrader().getId();
	}

	public String getTraderName() {
		return getTrader().getName();
	}

	public String getTraderCity() {
		return getTrader().getCity();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if(!(o instanceof TransactionFix that)) {
			return false;
		}
		
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "TransactionFix [id=" + id + ", trader=" + trader + ", createdTime=" + createdTime + ", value=" + value
				+ "]";
	}
	
}
