package view;

import bean.Item;
import functional.Transformer;

public class Ex06perationsF {
	public static void main(String[] args) {
		Item[] items = mockData();

		System.out.println("Ids: " + transform(items, item -> item.getId()));
	}

	private static Item[] mockData() {
		return new Item[] {
			new Item(1, "Item A1", 11d),
			new Item(2, "Item A2", 12d),
			new Item(3, "Item A3", 13d),
			new Item(4, "Item A4", 14d),
			new Item(5, "Item A5", 1d),
			new Item(6, "Item A6", 16d)
		};
	}

	private static String transform(Item[] items, Transformer transformer) {
		StringBuilder result = new StringBuilder();
		for (Item item : items) {
			result = result.append(transformer.strategy(item)).append(" ");
		}
		return result.toString();
	}
}
