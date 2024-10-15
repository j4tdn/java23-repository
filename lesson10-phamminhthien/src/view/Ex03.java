package view;
import bean.Item;
public class Ex03 {

	public static void main(String[] args) {
		Item[] items = mockData();
		printf(items);
		
		System.out.println("\nNhững mặt hàng có giá bán cao nhất của mỗi cửa hàng: ");
		Item[] highestPricedItems = findHighestPricedItems(items);
		printf(highestPricedItems);
	}
	
	private static Item[] mockData() {
		return new Item[]{
				new Item(18, "Item A18", 28d, 101),
				new Item(22, "Item A22", 42d, 101),
				new Item(77, "Item A77", 42d, 101),
				new Item(71, "Item A71", 77d, 102),
				new Item(45, "Item A45", 28d, 102), 
				new Item(56, "Item A56", 42d, 103),
				new Item(99, "Item A99", 28d, 103),
				new Item(83, "Item A83", 77d, 101)
		};
	}
	
	private static Item[] findHighestPricedItems(Item[] items) {
		Item[] highestPricedItems = new Item[3];
		for(Item item:items) {
			int storeIndex = item.getStoreId() - 101;
			if(highestPricedItems[storeIndex] == null || item.getSalesPrice() > highestPricedItems[storeIndex].getSalesPrice()) {
				highestPricedItems[storeIndex]=item;
			}
		}
		return highestPricedItems;
	}
	
	private static void printf(Item[] items) {
		for(Item item:items) {
			 System.out.println(item);
		}
	}
	
}
