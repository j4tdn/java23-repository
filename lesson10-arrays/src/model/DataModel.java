package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import bean.Item;

public class DataModel {
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
	private DataModel() {
		
	}
	
	public static Item[] mockItems() {
		return new Item[] {
			new Item(18, "Item A18", 28d, toDate("29.09.2024"), 101 ),
			new Item(22, "Item A22", 58d, toDate("09.09.2024"), 101 ),
			new Item(77, "Item A77", 22d, toDate("27.09.2024"), 101 ),
			new Item(81, "Item A81", 26d, toDate("24.09.2024"), 102 ),
			new Item(45, "Item A45", 46d, toDate("20.09.2024"), 102 ),
			new Item(56, "Item A56", 86d, toDate("23.09.2024"), 103 ),
			new Item(99, "Item A99", 19d, toDate("04.09.2024"), 103 ),
			new Item(83, "Item A83", 85d, toDate("16.09.2024"), 101 ),
				
		};
	}
	
	private static LocalDate toDate(String sDate) {
		return LocalDate.parse(sDate, df);
	}

}
