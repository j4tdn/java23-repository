package bean;

public class Item {
    private Integer itemId;
    private String name;
    private Integer salesPrice;
    private Integer storeId;

    public Item(Integer itemId, String name, Integer salesPrice, Integer storeId) {
        this.itemId = itemId;
        this.name = name;
        this.salesPrice = salesPrice;
        this.storeId = storeId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public Integer getSalesPrice() {
        return salesPrice;
    }

    public Integer getStoreId() {
        return storeId;
    }

    @Override
    public String toString() {
        return "ItemId: " + itemId + ", Name: " + name + ", SalesPrice: " + salesPrice + ", StoreId: " + storeId;
    }
}
