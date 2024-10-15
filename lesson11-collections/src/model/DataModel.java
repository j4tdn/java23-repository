package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import bean.Item;

public class DataModel {

	private static DateTimeFormatter df = 
			DateTimeFormatter.ofPattern("dd.MM.yyyy");
	private DataModel() {
	}
	
	public static List<Item> mockItems() {
		// immutable list with non null value
		return List.of(  
				new Item(18, "Item A18" , 28d, toDate("29.09.2024"), 101),
				new Item(22, "Item A22" , 42d, toDate("28.09.2024"), 101),
				new Item(44, "Item A44" , 42d, toDate("27.09.2024"), 101),
				new Item(46, "Item A46" , 77d, toDate("26.09.2024"), 102),
				new Item(24, "Item A24" , 26d, toDate("25.09.2024"), 102),
				new Item(65, "Item A65" , 23d, toDate("30.09.2024"), 104),
				new Item(88, "Item A56" , 97d, toDate("01.09.2024"), 104),
				new Item(99, "Item A99" , 77d, toDate("18.09.2024"), 103),
				new Item(83, "Item A84" , 23d, toDate("29.09.2024"), 103),
				new Item(83, "Item A83" , 23d, toDate("30.09.2024"), 103)

		);
	}
	public static LocalDate toDate(String sDate) {
		return LocalDate.parse(sDate, df);
	}
	
}
