package bean;

import java.time.LocalDate;

public class Item {
	
	private Integer id;
	private String name;
	private Double salesPrice;
	private Integer storeId;
	
	public Item() {
	}

	public Item(Integer id, String name, Double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	public Item(Integer id, String name, Double salesPrice, Integer storeId) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
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
	
	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice 
				+ ", storeId=" + storeId + "]";
	}
}