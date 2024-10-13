package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item> {

	private Integer id;
	private String name;
	private Double salesPrice;
	private LocalDate expiredDate;
	private Integer storeId;

	public Item() {
	}

	public Item(Integer id, String name, Double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	public Item(Integer id, String name, Double salesPrice, LocalDate expiredDate, Integer storeId) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.expiredDate = expiredDate;
		this.storeId = storeId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	// this.compareTo(item)
	// strategy: if (
	
	@Override
	public int compareTo(Item item) {
		Item i1 = this;
		Item i2 = item;
		
		// Yêu cầu 1: tăng dần theo salesPrice
		// return Double.compare(i1.getSalesPrice(), i2.getSalesPrice());
	
		// Yêu cầu 2: giảm dần theo expiredDate
		return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expiredDate=" + expiredDate
				+ ", storeId=" + storeId + "]";
	}

}
