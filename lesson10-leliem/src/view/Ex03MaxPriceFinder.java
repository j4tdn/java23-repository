package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;

public class Ex03MaxPriceFinder {

	public static void main(String[] args) {
		List<Item> items = Arrays.asList(new Item(1, "A", 25, 101), new Item(2, "B", 90, 102),
				new Item(3, "C", 88, 102), new Item(4, "D", 40, 101), new Item(5, "E", 60, 102),
				new Item(6, "F", 18, 101));

		Map<Integer, Item> maxPriceItemPerStore = new HashMap<>();

		for (Item item : items) {
			if (!maxPriceItemPerStore.containsKey(item.getStoreId())
					|| item.getSalesPrice() > maxPriceItemPerStore.get(item.getStoreId()).getSalesPrice()) {
				maxPriceItemPerStore.put(item.getStoreId(), item);
			}
		}

		for (Map.Entry<Integer, Item> entry : maxPriceItemPerStore.entrySet()) {
			Item maxItem = entry.getValue();
			System.out.println("Cửa hàng " + entry.getKey() + " có mặt hàng giá cao nhất:");
			System.out.println("Mã mặt hàng: " + maxItem.getItemId() + ", Tên mặt hàng: " + maxItem.getName() + ", Giá bán: "
					+ maxItem.getSalesPrice());
		}
	}
}
