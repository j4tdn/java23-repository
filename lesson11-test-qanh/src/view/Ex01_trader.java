package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class Ex01_trader {
	
	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        List<Trader> traders = List.of(
                new Trader(1, "anh", "Da Nang"),
                new Trader(2, "cuong", "Ha Noi"),
                new Trader(3, "duc", "Sai Gon")
        );

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, traders.get(0), toDate("1.01.2011", df), 500.0));
        transactions.add(new Transaction(2, traders.get(0), toDate("3.08.2011", df), 501.0)); 
        transactions.add(new Transaction(3, traders.get(0), toDate("11.11.2012", df), 5021.0)); 
        transactions.add(new Transaction(4, traders.get(1), toDate("19.02.2010", df), 700.0)); 
        transactions.add(new Transaction(5, traders.get(1), toDate("1.10.2014", df), 250.0)); 

//s1
        List<Transaction> transactions2011 = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getCreatedItem().getYear() == 2011) { 
                transactions2011.add(t);
            }
        }
        transactions2011.sort((t1, t2) -> Double.compare(t1.getValue(), t2.getValue())); 
        System.out.println("1. Transactions in 2011 sorted by value: " + transactions2011);
	}

	private static LocalDate toDate(String sDate, DateTimeFormatter df) {
		return LocalDate.parse(sDate, df);
	}
}
