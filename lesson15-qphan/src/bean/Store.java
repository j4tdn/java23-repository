package bean;

import java.math.BigDecimal;
import java.util.Objects;

<<<<<<< HEAD
public class Store {
	private Long storeId;
	private Long referenceStoreId;
	private BigDecimal stockPreviousDay;
	private BigDecimal expectedSales;
	private Boolean isSelected;

	public Store() {

	}

	public Store(final Long storeId, final Long referenceStoreId, final BigDecimal stockPreviousDay,
			final BigDecimal expectedSales, final Boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(final Long storeId) {
		this.storeId = storeId;
	}

	public Long getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(final Long referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public BigDecimal getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(final BigDecimal stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}

	public BigDecimal getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(final BigDecimal expectedSales) {
		this.expectedSales = expectedSales;
	}

	public Boolean getSelected() {
		return isSelected;
	}

	public void setSelected(final Boolean selected) {
		isSelected = selected;
	}

	@Override
	public boolean equals(final Object o) {
=======
/**
 * Store: Cửa hàng
 * + id: mã cửa hàng
 * + desc: mô tả
 * + potential: số mặt hàng cần có để bán
 * + whId: mã kho, kho hàng chuyển mặt hàng đến cửa hàng
 */
public class Store {

	private Integer id;
	private String desc;
	private BigDecimal potential;
	private Integer whId;

	public Store() {
	}

	public Store(Integer id, String desc, BigDecimal potential, Integer whId) {
		this.id = id;
		this.desc = desc;
		this.potential = potential;
		this.whId = whId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public BigDecimal getPotential() {
		return potential;
	}

	public void setPotential(BigDecimal potential) {
		this.potential = potential;
	}

	public Integer getWhId() {
		return whId;
	}

	public void setWhId(Integer whId) {
		this.whId = whId;
	}

	@Override
	public boolean equals(Object o) {
>>>>>>> fccdfd1 (initial data 12.01.2025)
		if (this == o) {
			return true;
		}

<<<<<<< HEAD
		if (o instanceof Store) {
			return false;
		}

		final Store store = (Store) o;

		return getStoreId().equals(store.getStoreId());
=======
		if (!(o instanceof Store)) {
			return false;
		}

		Store that = (Store) o;

		return getId().equals(that.getId());
>>>>>>> fccdfd1 (initial data 12.01.2025)
	}

	@Override
	public int hashCode() {
<<<<<<< HEAD
		return Objects.hash(storeId);
=======
		return Objects.hash(getId());
>>>>>>> fccdfd1 (initial data 12.01.2025)
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
	};
}
=======
		return "Store [id=" + id + ", desc=" + desc + ", potential=" + potential + ", whId=" + whId + "]";
	}
}
>>>>>>> fccdfd1 (initial data 12.01.2025)
