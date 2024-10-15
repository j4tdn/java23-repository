package view;
import bean.Item;

public class Ex03FindHighestSalesPrice {

	public static void main(String[] args) {
		Item[] items = mockData();
		
		Item[] highestPriceItems = new Item[2];  

        for (Item item : items) {
            int storeId = item.getStoreId();
            int index = storeId - 101; // storeId 101 sẽ là index 0, storeId 102 sẽ là index 1

            if (highestPriceItems[index] == null || item.getSalesPrice() > highestPriceItems[index].getSalesPrice())
                highestPriceItems[index] = item;
        }

        System.out.println("Mặt hàng có giá bán cao nhất: ");
        for(int i = 0; i < highestPriceItems.length; i++) 
                System.out.println(highestPriceItems[i]);
        }
	
	private static Item[] mockData() {
		return new Item[] {
				 new Item(1, "A", 25d, 101),
				 new Item(2, "B", 90d, 102),
				 new Item(3, "C", 88d, 102),
				 new Item(4, "D", 40d, 101),
				 new Item(5, "E", 60d, 102),
				 new Item(6, "F", 18d, 101)
		};
	}
}
