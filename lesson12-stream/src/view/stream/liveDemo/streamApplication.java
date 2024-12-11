package view.stream.liveDemo;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

import bean.Transaction;
import model.DataModel;

import static utils.CollectionUtils.*;

public class streamApplication {

	 public static void main (String[] args) {
		 var transactions = DataModel.getTransactions();
			
			generate(
				"1. Find all transactions in the year 2024 and sort them by value (small to high)",
				transactions.stream()
					.filter(t -> t.getCreatedTime().getYear() == 2024)
					.sorted(Comparator.comparing(Transaction::getValue))
					.collect(Collectors.toList())
			);
			
			generate(
				"2. Find all transactions have value greater than 2000 and sort them by trader’s city",
				transactions.stream()
					.filter(t -> t.getValue() > 2000)
					.sorted(Comparator.comparing(Transaction::getTraderCity))
					.collect(Collectors.toList())
			);
			
			generate(
				"3. What are all the unique cities where the traders work",
				transactions.stream()
					.map(Transaction::getTraderCity)
					.collect(Collectors.toSet())
			);
			
			generate(
				"4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream()
					.filter(t -> t.getTraderCity().equals("Cambridge"))
					.map(Transaction::getTrader)
					.collect(Collectors.toSet())
			);
			
			var tNames = transactions.stream()
				.map(Transaction::getTraderName)
				.collect(Collectors.toCollection(TreeSet::new));
			
			System.out.printf(
					"5. Return a string of all traders’ names sorted alphabetically --> %s\n\n", 
					String.join(", ", tNames));
			
			System.out.printf("6. Are any traders based in Milan --> %s\n\n",
					transactions.stream().anyMatch(t -> t.getTraderCity().equals("Milan")));
			
			System.out.printf("7 Count the number of traders in Milan --> %s\n\n",
					transactions.stream()
						.filter(t -> t.getTraderCity().equals("Milan"))
						.map(Transaction::getTrader)
						.collect(Collectors.toSet())
						.size());
			
			generate(
				"8. Print all transactions's values from the traders living in Cambridge",
				transactions.stream()
					.filter(t -> t.getTraderCity().equals("Cambridge"))
					.map(Transaction::getValue)
					.collect(Collectors.toList())
			);
			
			System.out.printf("9. What’s the highest value of all the transactions --> %s\n\n", 
					transactions.stream()
						.map(Transaction::getValue)
						.reduce(Double.MIN_VALUE, Double::max));
			
			System.out.printf("10. Find the transaction with the smallest value --> %s\n\n", 
					transactions.stream()
						.map(Transaction::getValue)
						.reduce(Double.MAX_VALUE, Double::min));
	 }
	
}
