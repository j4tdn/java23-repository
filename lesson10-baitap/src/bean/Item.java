package bean;

public class Item {
	private int ItemId;
	private String Name;
	private int SalesPrice;
	private int StoreID;
	public Item() {
	}
	public Item(int itemId, String name, int salesPrice, int storeID) {
		ItemId = itemId;
		Name = name;
		SalesPrice = salesPrice;
		StoreID = storeID;
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalesPrice() {
		return SalesPrice;
	}
	public void setSalesPrice(int salesPrice) {
		SalesPrice = salesPrice;
	}
	public int getStoreID() {
		return StoreID;
	}
	public void setStoreID(int storeID) {
		StoreID = storeID;
	}
	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", Name=" + Name + ", SalesPrice=" + SalesPrice + ", StoreID=" + StoreID
				+ "]";
	}
	
	
	
}
