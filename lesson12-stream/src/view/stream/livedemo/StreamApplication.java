package view.stream.livedemo;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toSet;
import static utils.CollectionUtils.generate;

import java.text.DecimalFormat;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class StreamApplication {
	
	public static void main(String[] args) {
		
		var transactions = DataModel.getTransactions();
		
		generate("1. Find all transactions in the year 2024 and sort them by value",
				transactions.stream()
					.filter(t -> t.getCreatedTime().toLocalDate().getYear() == 2024)
					.sorted(comparing(Transaction::getValue))
				    .toList()
				);
		
		// t -> t.getValue() --> Transaction::getValue
		// t -> t.getTrader().getCity() --> Transaction::getTrader::getCity
		// t -> t.getTraderCity() --> Transaction::getTraderCity
		
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted(comparing(Transaction::getTraderCity))
				    .toList()
				);
		
		generate("3. What are all the unique cities where the traders work",
				transactions.stream()
					.map(t -> t.getTraderCity())
					.collect(toSet())
				);
		
		generate("4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream()
					.filter(t -> "Cambridge".equals(t.getTraderCity()))
					.map(Transaction::getTrader)
					.sorted(comparing(Trader::getName, reverseOrder()))
					.collect(toSet())
				);
		
		System.out.printf(
				"5. Return a string of all traders’ names sorted alphabetically: %s",
				transactions.stream()
					.map(t -> t.getTraderName()) // Stream<String>
					.distinct()
					.collect(Collectors.joining(", ", "[", "]"))
				);
		
		System.out.printf("\n\n6. Are any traders based in Iran --> %s ",
				transactions.stream().anyMatch(t -> "Iran ".equals(t.getTraderCity()) )
		);
		
		// 7. Count the number of traders in Milan.
		System.out.printf("\n\n7. Count the number of traders in Milan. ",
				transactions.stream()
				.map(Transaction::getTrader)
				.distinct()
				.filter(t -> "QuangNinh".equals(t.getCity())).count()
		);
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.printf(
				"8. Print all transactions’ values from the traders living in Cambridge %s\n\n"
				,transactions.stream()
					.filter(t -> "Cambridge".equals(t.getTraderCity()))
					.map(t ->df.format(t.getValue()))
					.collect(Collectors.joining(" "))
		);
		
		// 9. What’s the highest value of all the transactions?
		System.out.printf(
				"9. What’s the highest value of all the transactions --> %s\n\n",
				transactions.stream()
						.mapToDouble(Transaction::getValue)
						.max()
						.orElseThrow()
		);
		// 10. Find the transaction with the smallest value.
		System.out.printf(
				"10. Find the transaction with the smallest value --> %s",
				transactions.stream()
						.mapToDouble(Transaction::getValue)
						.min()
						.orElseThrow()
		);
	}
	
}
