package view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TraderExecutingTransactions {

	public static void main(String[] args) {

		List<Trader> traders = DataModel.mockTraders();
		List<Transaction> transactions = DataModel.mockTransactions();

		// Bài 1:
		List<Transaction> transactions2011 = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getCreatedItem().getYear() == 2011) { // Check the year directly using LocalDate
				transactions2011.add(t);
			}
		}
		transactions2011.sort((t1, t2) -> Integer.compare(t1.getValues(), t2.getValues()));
		System.out.println("1. Transactions in 2011 sorted by value: " + transactions2011);

		// Bài 2:
		List<Transaction> transactionsAbove300 = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getValues() > 300) {
				transactionsAbove300.add(t);
			}
		}
		transactionsAbove300.sort(Comparator.comparing(t -> t.getTrader().getCity()));
		System.out.println("2. Transactions above 300 sorted by trader's city: " + transactionsAbove300);

		// Bài 3:
		Set<String> uniqueCities = new HashSet<>();
		for (Trader t : traders) {
			uniqueCities.add(t.getCity());
		}
		System.out.println("3. Unique cities where traders work: " + uniqueCities);

		// Bài 4:
		List<Trader> cambridgeTraders = new ArrayList<>();
		for (Trader t : traders) {
			if ("Da Nang".equals(t.getCity())) {
				cambridgeTraders.add(t);
			}
		}
		cambridgeTraders.sort((t1, t2) -> t2.getName().compareTo(t1.getName()));
		System.out.println("4.Traders from Da Nang sorted by name desc: " + cambridgeTraders);
	}

}
