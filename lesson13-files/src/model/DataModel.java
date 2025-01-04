package model;

import java.math.BigDecimal;
import java.util.List;

import bean.Dish;
import bean.Item;
import common.Kind;

public class DataModel {

	public DataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Item> mockItem() {
		return List.of(
				new Item(1, "Item A1", bd(18d)),
				new Item(2, "Item A2", bd(22d)),
				new Item(3, "Item B1", bd(30d)),
				new Item(4, "Item B1", bd(40d)),
				new Item(5, "Item C1", bd(62d)),
				new Item(6, "Item C2", bd(16d)),
				new Item(7, "Item C3", bd(20d)),
				new Item(8, "Item D1", bd(88d))
				);
	}
	
	public static List<Dish> mockDishes() {
		return List.of(
			new Dish("1", "D1", 308d, Kind.EGG, false),
			new Dish("2", "D2", 220d, Kind.OTHER, true),
			new Dish("3", "D3", 880d, Kind.EGG, false),
			new Dish("4", "D4", 86d, Kind.FISH, false),
			new Dish("5", "D5", 22d, Kind.MEAT, false),
			new Dish("6", "D6", 707d, Kind.MEAT, false),
			new Dish("7", "D2", 101d, Kind.OTHER, true),
			new Dish("8", "D8", 292d, Kind.OTHER, true)
		);
	}
	
	public static BigDecimal bd(Double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
