package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import beam.Trader;
import beam.Transaction;

public class DataModel {
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
	public static List<Trader> mockTrader(){
		return List.of(
				new Trader(1, "Trader 1" , "Viet Nam"),
				new Trader(2, "Trader 2" , "Lao"),
				new Trader(3, "Trader 3" , "Campuchia"),
				new Trader(4, "Trader 4" , "Thai Lan"),
				new Trader(5, "Trader 5" , "Singapore")
				);
				
	}
	public DataModel() {
	}
	public static List<Transaction> mockTransaction(){
		List<Trader> traders = mockTrader();
		return List.of(
				new Transaction(12, traders.get(0), toDate("29.09.2024"), 100d),
				new Transaction(43, traders.get(1), toDate("30.10.2018"), 500d),
				new Transaction(21, traders.get(2), toDate("16.03.2011"), 300d),
				new Transaction(16, traders.get(3), toDate("02.11.2020"), 600d),
				new Transaction(56, traders.get(4), toDate("17.08.2021"), 400d)
				
				);
	}
	public static LocalDate toDate(String sDate) {
		return LocalDate.parse(sDate, df );
	}
}
