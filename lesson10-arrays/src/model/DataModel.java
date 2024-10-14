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
        		new Item(18,"Item A18",28d,toDate("29.09.2024"),101),
        		new Item(22,"Item A22",42d,toDate("28.09.2024"),101),
        		new Item(77,"Item A77",42d,toDate("27.09.2024"),101),
        		new Item(71,"Item A71",77d,toDate("26.09.2024"),102),
        		new Item(45,"Item A45",28d,toDate("25.09.2024"),102),
        		new Item(59,"Item A59",42d,toDate("30.09.2024"),103),
        		new Item(99,"Item A99",28d,toDate("01.09.2024"),103),
        		new Item(83,"Item A83",77d,toDate("18.09.2024"),101),
        };
   }
   
   private static LocalDate toDate(String sDate) {
	   return LocalDate.parse(sDate,df);
   }
   
}
