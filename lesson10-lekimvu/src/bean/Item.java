package bean;

public class Item {

	private Integer itemId;
	private String name;
	private Integer salesrice;
	private String storeId;
	
	public Item() {

	}

	public Item(Integer itemId, String name, Integer salesrice, String storeId) {
		this.itemId = itemId;
		this.name = name;
		this.salesrice = salesrice;
		this.storeId = storeId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalesrice() {
		return salesrice;
	}

	public void setSalesrice(Integer salesrice) {
		this.salesrice = salesrice;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	
	
}
