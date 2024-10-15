
package model;

import java.util.List;

import bean.Item;

public class DataModel {

	private DataModel() {
	}

	public static List<Item> mockItems() {
		return List.of(
				new Item(1, "A", 25d, 101), 
				new Item(2, "B", 90d, 102), 
				new Item(3, "C", 88d, 102),
				new Item(4, "D", 40d, 101), 
				new Item(5, "E", 60d, 102), 
				new Item(6, "F", 18d, 101)
				);
	}

}
