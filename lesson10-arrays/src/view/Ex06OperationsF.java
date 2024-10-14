package view;

import bean.Item;
import functional.Transformer;

public class Ex06OperationsF {

	public static void main(String[] args) {
		Item[] items = mockData();
		
		System.out.println("id -> " + transform(items, item -> item.getId()));
		System.out.println("name -> " + transform(items, item -> item.getName()));
	}
	private static Item[] mockData() {
		return new Item[] {
			new Item(1, "Item A1", 11d),
			new Item(2, "Item A2", 12d),
			new Item(3, "Item A3", 13d),
			new Item(4, "Item A4", 14d),
			new Item(5, "Item A5", 15d),
			
		};
	}
	private static String transform(Item[] items, Transformer transformer ) {
		StringBuilder result = new StringBuilder();
		for(Item item: items) {
			result = result.append(transformer.strategy(item)).append(" ");
		}
		return result.toString();
	}
	private static String getIds(Item[] items ) {
		StringBuilder result = new StringBuilder();
		for(Item item: items) {
			result = result.append(item.getId()) .append(" ");
		}
		return result.toString();
	}
	private static String getNames(Item [] items) {
		StringBuilder result = new StringBuilder();
		for(Item item: items) {
			result = result.append(item.getName()) .append(", ");
		}
		return result.toString();
	}
	}


