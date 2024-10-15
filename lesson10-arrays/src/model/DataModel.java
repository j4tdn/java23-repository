package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import bean.Item;

public class DataModel {
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");

	private DataModel() {
		// TODO Auto-generated constructor stub
	}

	public static Item[] mockItems() {
		return new Item[] {
				new Item(18, "Item A18", 28d, 101, toDate("29.09.2024")),
				new Item(22, "Item A22", 42d, 101, toDate("28.09.2024")),
				new Item(77, "Item A77", 42d, 103, toDate("27.09.2024")),
				new Item(71, "Item A71", 77d, 102, toDate("26.09.2024")),
				new Item(45, "Item A45", 28d, 101, toDate("28.09.2024")),
				new Item(56, "Item A56", 42d, 103, toDate("03.09.2024")),
				new Item(99, "Item A99", 28d, 102, toDate("20.09.2024")),
				new Item(83, "Item A83", 77d, 101, toDate("15.09.2024")),
				new Item(15, "Item A15", 66d, 103, toDate("06.09.2024"))
		};
	}

	private static LocalDate toDate(String sDate) {
		return LocalDate.parse(sDate, df);
	}
}
