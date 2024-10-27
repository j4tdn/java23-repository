package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DataModel {

	public static List<Trader> getTraders() {
		List<Trader> traders = new ArrayList<>();
        traders.add(new Trader(1, "Trung", "Phú Lộc"));
        traders.add(new Trader(2, "Trình", "Lệ Thuỷ"));
        traders.add(new Trader(3, "Cường", "Hồng Lĩnh"));
        traders.add(new Trader(4, "Bùm Bùm", "Hồng Lĩnh"));
        traders.add(new Trader(5, "Faker", "Phú Lộc"));


        return traders;
	}
	public static List<Transaction> getTransactions(List<Trader> traders) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, traders.get(0), LocalDateTime.of(2011, 5, 23, 14, 30), 250.0));
        transactions.add(new Transaction(2, traders.get(1), LocalDateTime.of(2011, 8, 19, 9, 45), 400.0));
        transactions.add(new Transaction(3, traders.get(2), LocalDateTime.of(2010, 12, 12, 11, 15), 150.0));
        transactions.add(new Transaction(4, traders.get(3), LocalDateTime.of(2011, 7, 14, 16, 20), 320.0));
        transactions.add(new Transaction(5, traders.get(4), LocalDateTime.of(2012, 3, 11, 10, 10), 500.0));
        transactions.add(new Transaction(6, traders.get(2), LocalDateTime.of(2011, 1, 3, 8, 50), 330.0));
        transactions.add(new Transaction(7, traders.get(0), LocalDateTime.of(2011, 11, 15, 13, 40), 600.0));
        return transactions;
    }
}
