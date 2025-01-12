package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Store {
	private Long storeId;
	private Long referenceStoreId;
	private BigDecimal stockPreviousDay;
	private BigDecimal expectedSales;
	private Boolean isSelected;

	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(Long storeId, Long referenceStoreId, BigDecimal stockPreviousDay, BigDecimal expectedSales,
			Boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(Long referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public BigDecimal getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(BigDecimal stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}

	public BigDecimal getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(BigDecimal expectedSales) {
		this.expectedSales = expectedSales;
	}

	public Boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public int hashCode() {
		return Objects.hash(expectedSales, isSelected, referenceStoreId, stockPreviousDay, storeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		return Objects.equals(expectedSales, other.expectedSales) && Objects.equals(isSelected, other.isSelected)
				&& Objects.equals(referenceStoreId, other.referenceStoreId)
				&& Objects.equals(stockPreviousDay, other.stockPreviousDay) && Objects.equals(storeId, other.storeId);
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
	}

}
