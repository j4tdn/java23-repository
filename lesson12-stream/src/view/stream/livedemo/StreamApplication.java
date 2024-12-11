package view.stream.livedemo;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;
import static utils.CollectionUtils.generate;

import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class StreamApplication {

	public static void main(String[] args) {
		
		var transactions = DataModel.getTransactions();
		
		generate(
				"1. Find all transactions in the year 2024 and sort them by value (small to high)",
				transactions.stream()
							.filter(t -> t.getCreatedTime().toLocalDate().getYear() == 2024)
							.sorted(comparing(Transaction::getValue))
			);
			
			generate(
				"2. Find all transactions have value greater than 2000 and sort them by trader’s city",
				transactions.stream()
							.filter(t -> t.getValue() > 2000)
							.sorted(comparing(t -> t.getTraderCity()))
			);
			
			generate(
				"3. What are all the unique cities where the traders work",
				transactions.stream()
							.map(t -> t.getTraderCity())
							.distinct()
							.toList()
			);
			
			generate(
				"4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream()
							.map(t -> t.getTrader())
							.filter(trader -> "Cambridge".equals(trader.getCity()))
							.distinct()
							.sorted(comparing(Trader::getName).reversed())
							.toList()
			);
			
			var tNames = transactions.stream()
									 .map(Transaction::getTraderName)
									 .distinct()
									 .sorted()
									 .collect(joining(", "));
			System.out.printf("5. Return a string of all traders’ names sorted alphabetically --> %s\n\n"
					, tNames);
			
			System.out.printf("6. Are any traders based in Milan --> %s\n\n",
					transactions.stream()
					.anyMatch(t -> t.getTraderCity().equals("Milan")));
			
			System.out.printf("7 The number of traders in Milan --> %s\n\n",
					transactions.stream()
								.filter(t -> t.getTraderCity().equals("Cambridge"))
								.count());
			
			generate(
				"8. All transactions's values from the traders living in Cambridge",
				transactions.stream()
							.filter(t -> t.getTraderCity().equals("Cambridge"))
							.map(Transaction::getValue)
							.collect(toList())
			);
			
			
			System.out.printf("9. The highest value of all the transactions --> %s\n\n", 
					transactions.stream()
								.mapToDouble(Transaction::getValue)
								.max()
								.orElse(Double.MIN_VALUE));
			
			System.out.printf("10. The transaction with the smallest value --> %s\n\n", 
					transactions.stream()
								.min(comparingDouble(Transaction::getValue))
								.orElse(null));
		
	}
	
}
