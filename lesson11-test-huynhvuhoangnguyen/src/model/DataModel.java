package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import bean.TraderFix;
import bean.TransactionFix;

public class DataModel {
	
	private DataModel() {
	}
	
	public static List<TransactionFix> getTransactions() {
		TraderFix t1 = new TraderFix(1, "Trader T1", "Milan");
		TraderFix t2 = new TraderFix(2, "Trader T2", "Cambridge");
		TraderFix t3 = new TraderFix(3, "Trader T3", "London");
		TraderFix t4 = new TraderFix(4, "Trader T4", "DaNang");
		TraderFix t5 = new TraderFix(5, "Trader T5", "Cambridge");
		TraderFix t6 = new TraderFix(6, "Trader T6", "QuangNinh");
		
		return List.of(
				new TransactionFix(101, t1, strToDate("30.10.2022 11:12:20"), 6200d),
				new TransactionFix(102, t1, strToDate("29.10.2024 12:12:20"), 1200d),
				new TransactionFix(103, t1, strToDate("28.10.2023 13:12:20"), 2200d),
				new TransactionFix(104, t2, strToDate("12.10.2021 14:12:20"), 1800d),
				new TransactionFix(105, t2, strToDate("22.11.2022 15:12:20"), 3456d),
				new TransactionFix(106, t3, strToDate("30.10.2024 18:12:20"), 1456d),
				new TransactionFix(107, t6, strToDate("14.10.2018 18:12:20"), 2589d),
				new TransactionFix(108, t4, strToDate("30.12.2024 22:12:20"), 1111d),
				new TransactionFix(109, t4, strToDate("25.12.2012 18:12:20"), 3698d),
				new TransactionFix(110, t5, strToDate("30.10.2011 14:12:20"), 1593d),
				new TransactionFix(111, t3, strToDate("30.11.2024 18:12:20"), 2580d),
				new TransactionFix(112, t2, strToDate("30.10.2015 11:12:20"), 4000d)
		);
		
		
	}
	
	private static LocalDateTime strToDate(String str) {
		return LocalDateTime.parse(str, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
	}

}
