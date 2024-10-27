package view;

import java.util.Arrays;
import java.util.List;
import bean.Trader;
import bean.Transaction;

public class Ex01TraderExecutingTransactions {
	public static void main(String[] args) {
		List<Trader> traders = Arrays.asList(new Trader(1, "Hoang Minh Quan", "Da Nang"),
				new Trader(2, "Thien Thanh", "TP Ho Chi Minh"), new Trader(3, "Lam Quang Duy", "TP Ho Chi Minh"),
				new Trader(4, "Song Hoang", "Quang Nam"), new Trader(5, "Dang Bang Tam", "Quang Tri"),
				new Trader(6, "Hoang Huy", "Da Nang"), new Trader(7, "Katty How", "TP Ho Chi Minh"));

		List<Transaction> transactions = Arrays.asList(new Transaction(1, traders.get(0), "2011-01-04", 100),
				new Transaction(2, traders.get(1), "2013-05-06", 200),
				new Transaction(3, traders.get(2), "2015-07-08", 150),
				new Transaction(4, traders.get(4), "2017-09-10", 300),
				new Transaction(5, traders.get(3), "2011-10-11", 200),
				new Transaction(6, traders.get(5), "2013-12-04", 250),
				new Transaction(7, traders.get(0), "2016-7-31", 200),
				new Transaction(5, traders.get(3), "2018-09-30", 150),
				new Transaction(6, traders.get(5), "2012-10-04", 100),
				new Transaction(7, traders.get(0), "2014-02-28", 250));
		
		
		
	}
	
	public void printTransactionsIn

}
