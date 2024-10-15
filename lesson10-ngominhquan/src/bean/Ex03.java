package bean;

import java.util.ArrayList;
import java.util.List;
import bean.Item;
import model.DataModel;

public class Ex03 {

public static void main(String[] args) {
		
		List<Item> items = DataModel.mockItems();
		printf("items", items);
        findHighestPricePerStore(items);
    }
	private static void findHighestPricePerStore(List<Item> items) {
        List<Item> maxPriceItems = new ArrayList<>();
        for (Item item : items) {
            boolean found = false;
            for (int i = 0; i < maxPriceItems.size(); i++) {
                if (maxPriceItems.get(i).getStoreId() == item.getStoreId()) {
                    found = true;
                    if (item.getSalesPrice() > maxPriceItems.get(i).getSalesPrice()) {
                        maxPriceItems.set(i, item);
                    }
                    break;
                }
            }
            if (!found) {
                maxPriceItems.add(item);
            }
        }
        printf(" - Mặt hàng có giá bán cao nhất của mỗi cửa hàng:\n", maxPriceItems);
    }
	
	private static void printf(String prefix, List<Item> items) {
		System.out.println(prefix + "--> {");
		for (Item item : items) {
			System.out.println("     + " + item);
		}
		System.out.println("}\n");
	}
	
}
