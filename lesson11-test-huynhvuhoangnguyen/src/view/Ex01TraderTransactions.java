package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;

public class Ex01TraderTransactions {

	public static void main(String[] args) {

		Ex01TraderTransactions app = new Ex01TraderTransactions();
		
		List<Trader> traders = tradersData();
		List<Transaction> transactions = transactionsData(traders);
		System.out.println("1.All transactions in the year 2011 and sort them by value (small to high):");
		
		List<Transaction> transactionIn2011 = app.findTransactionIn2011(transactions);
		System.out.println(transactionIn2011);
		
		System.out.println("\n2. All transactions have value greater than 300 and sort them by trader’s city:");
		List<Transaction> transactionsGreaterThan300 = app.findTransactionGreaterThan300(transactions);
		System.out.println(transactionsGreaterThan300);
		
		
		
	}

	// Find all transactions in the year 2011 and sort them by value (small to
	// high).
	private List<Transaction> findTransactionIn2011(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getCreatedItem().startsWith("2011")) {
				result.add(transaction);
			}
		}
		result.sort((t1, t2) -> Double.compare(t1.getValue(), t2.getValue()));
		return result;
	}

	// Find all transactions have value greater than 300 and sort them by trader’s
	// city
	private List<Transaction> findTransactionGreaterThan300(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > 300) {
				result.add(transaction);
			}
		}
		result.sort((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		return result;
	}

	// What are all the unique cities where the traders work ?
	private Set<String> getUniqueCities(List<Trader> traders) {
		Set<String> cities = new HashSet<>();
		for (Trader trader : traders) {
			cities.add(trader.getCity());
		}
		return cities;
	}

	// Find all traders from Cambridge and sort them by name desc.
	private List<Trader> findTradesFromCambridge(List<Trader> traders) {
		List<Trader> result = new ArrayList<>();
		for (Trader trader : traders) {
			if ("Cambridge".equals(trader.getCity())) {
				result.add(trader);
			}
		}
		result.sort((t1, t2) -> t2.getName().compareTo(t1.getName()));
		return result;
	}

	// Return a string of all traders’ names sorted alphabetically.
	private String getAllTradersName(List<Trader> traders) {
		List<String> names = new ArrayList<>();
		for (Trader trader : traders) {
			names.add(trader.getName());
		}
		Collections.sort(names);
		return String.join(", ", names);
	}

	// traders based in Milan
	private boolean anyTradersInMilan(List<Trader> traders) {
		for (Trader trader : traders) {
			if ("Milan".equals(trader.getCity())) {
				return true;
			}
		}
		return false;
	}

	// Count the number of traders in Milan.
	private int tradersInMilan(List<Trader> traders) {
		int count = 0;
		for (Trader trader : traders) {
			if ("Milan".equals(trader.getCity())) {
				count++;
			}
		}
		return count;
	}

	// Print all transactions’ values from the traders living in Cambridge.
	private List<Double> allTransactionsFromCambridge(List<Transaction> transactions) {
		List<Double> values = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if ("Cambridge".equals(transaction.getTrader().getCity())) {
				values.add(transaction.getValue());
			}
		}
		return values;
	}

	// highest value of all the transactions
	private double highestValue(List<Transaction> transactions) {
		if (transactions.isEmpty()) {
			return -1;
		}

		double maxValue = transactions.get(0).getValue();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > maxValue) {
				maxValue = transaction.getValue();
			}
		}

		return maxValue;
	}

	private double smallestValue(List<Transaction> transactions) {
		if (transactions.isEmpty()) {
			return -1;
		}

		double minValue = transactions.get(0).getValue();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() < minValue) {
				minValue = transaction.getValue();
			}
		}

		return minValue;
	}

	private static List<Trader> tradersData() {
		List<Trader> traders = new ArrayList<>();
		traders.add(new Trader(1, "Dave", "London"));
		traders.add(new Trader(2, "Chad", "Cambridge"));
		traders.add(new Trader(3, "Ron", "Milan"));
		traders.add(new Trader(4, "Dave", "London"));
		traders.add(new Trader(5, "Dave", "Cambridge"));
		return traders;
	}

	private static List<Transaction> transactionsData(List<Trader> traders) {
		List<Transaction> transactions = new ArrayList<>();
		transactions.add(new Transaction(1, traders.get(0), "2011-06-15", 500));
		transactions.add(new Transaction(2, traders.get(1), "2015-09-15", 700));
		transactions.add(new Transaction(3, traders.get(2), "2012-04-01", 900));
		transactions.add(new Transaction(4, traders.get(3), "2011-03-05", 100));
		transactions.add(new Transaction(5, traders.get(4), "2016-06-08", 300));
		return transactions;
	}

}
