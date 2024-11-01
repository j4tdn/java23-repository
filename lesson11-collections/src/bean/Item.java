package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item>{

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
	
	public Item(Integer id, String name, Double salesPrice, LocalDate expireDate, Integer storeId) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.expiredDate = expireDate;
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
	
	public LocalDate getExpireDate() {
		return expiredDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expiredDate = expireDate;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	
	// Mặc định equals --> compare theo địa chỉ
	// override --> compare theo giá trị của thuộc tính mà mình chọn
	//			--> 2 items equal với nhau khi trùng id
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if(!(o instanceof Item)) {
			return false;
		}
		
		Item that = (Item) o;
		return getId() == that.getId();
	}
	
	@Override
	public int compareTo(Item o) {
		return getId().compareTo(o.getId());
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expireDate=" + expiredDate
				+ ", storeId=" + storeId + "]";
	}

}