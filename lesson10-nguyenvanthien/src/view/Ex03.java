package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "A", 25, 101));
		items.add(new Item(2, "B", 90, 102));
		items.add(new Item(3, "C", 88, 102));
		items.add(new Item(4, "D", 40, 101));
		items.add(new Item(5, "E", 60, 102));
		items.add(new Item(6, "F", 18, 101));

		Item maxPriceItem = findMaxPriceItem(items);

		if (maxPriceItem != null) {
			System.out.println("Sản phẩm cao nhất " + maxPriceItem);
		} else {
			System.out.println("null");
		}
	}

	// find
	public static Item findMaxPriceItem(List<Item> items) {
		Item maxItem = null;
		for (Item item : items) {
			if (maxItem == null || item.getSalesPrice() > maxItem.getSalesPrice()) {
				maxItem = item;
			}
		}

		return maxItem;
	}
}