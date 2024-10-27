package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DataModel {

	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
	private DataModel() {
	}
	
	public static List<Trader> mockTraders(){
		return List.of(
				new Trader (1, "Tuan", "Da Nang"),
				new Trader (2, "Khoa", "Ha Noi"),
				new Trader (3, "My", "Ho Chi Minh"),
				new Trader (4, "Ly", "Da Nang")
				);
	}
	
	public static List<Transaction> mockTransactions(){
		List<Trader> traders = mockTraders();
		return List.of(
				new Transaction(101, traders.get(3), toDate("15.01.2011"), 300),
	            new Transaction(102, traders.get(0), toDate("20.05.2012"), 1000),
	            new Transaction(103, traders.get(0), toDate("11.06.2013"), 400),
	            new Transaction(104, traders.get(1), toDate("14.02.2011"), 710),
	            new Transaction(105, traders.get(1), toDate("18.02.2013"), 700),
	            new Transaction(106, traders.get(2), toDate("23.09.2012"), 950)
				);
	}
	
	public static LocalDate toDate(String sDate) {
		return LocalDate.parse(sDate, df);
	}
	
}
