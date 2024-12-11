package view.stream.livedemo;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

import static utils.CollectionUtils.*;
public class Ex01TransactionApp {
	
	private static List<Transaction> transactions = DataModel.getTransactions();
	
	public static void main(String[] args) {
		
        generate(
			"1. Find all transactions in the year 2021 and sort them by value (small to high)",
			transactions.stream()
					.filter(t -> t.getCreatedTime().toLocalDate().getYear() == 2021)
					.sorted(Comparator.comparing(Transaction::getValue))
					.toList()
		);
		
		generate(
				"2. Find all transactions have value greater than 300 and sort them by trader’s city",
				transactions.stream()
                .filter(t -> t.getValue() > 300)
                .sorted(Comparator.comparing(Transaction::getTraderCity))
                .toList()
         );
				
		generate("3. What are all the unique cities where the traders work?",
				transactions.stream()
				.map(Transaction::getTraderCity)
				.distinct()
				.toList()
		);
		
		generate("4. Find all traders from Cambridge and sort them by name desc.", 
				transactions.stream()
				.filter(t -> t.getTraderCity().equals("Cambridge"))
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getName).reversed())
				.toList()
				);

		System.out.println("5. Return a string of all traders’ names sorted alphabetically: " +
				transactions.stream()
		        .map(Transaction::getTraderName)
		        .sorted()
		        .distinct()
		        .collect(Collectors.joining(", "))
		);

		System.out.println("\n6. Are any traders based in Milan? " + 
				transactions.stream()
				.anyMatch(t -> "Milan".equals(t.getTraderCity()))
				);
		
		System.out.println("\n7. Count the number of traders in Milan: " + 
				transactions.stream()
				.filter(t -> "Milan".equals(t.getTraderCity()))
				.map(Transaction::getTrader)
				.distinct()
				.count()
		);
		
		generate("\n8. Print all transactions’ values from the traders living in Cambridge: ",
				transactions.stream()
				.filter(t -> "Cambridge".equals(t.getTraderCity()))
				.map(Transaction::getValue)
				.toList()
		);
		
		System.out.println("9. What’s the highest value of all the transactions? " +
				transactions.stream()
				.mapToDouble(Transaction::getValue)
				.max()
				.orElse(Double.MIN_VALUE)
		);
		
		System.out.printf("\n10. Find the transaction with the smallest value:\n %s",
				transactions.stream()
				.reduce((result, element) -> result.getValue() > element.getValue() ? element : result)
		);
	}
	
}
