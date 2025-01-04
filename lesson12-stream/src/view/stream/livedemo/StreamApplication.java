package view.stream.livedemo;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;
import static utils.CollectionUtils.generate;

import java.text.DecimalFormat;
import java.util.stream.Collector;
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
							.sorted(comparing(Transaction::getTraderCity))
							.toList());
			
			generate(
				"3. What are all the unique cities where the traders work",
				transactions.stream()
							.map(t -> t.getTraderCity())
							.collect(toSet())
			);
			
			generate(
				"4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream()
							.filter(t -> "Cambridge".equals(t.getTraderCity()))
							.map(Transaction::getTrader)
							.sorted(comparing(Trader::getName, reverseOrder()))
							.collect(toSet())
			);
			
			System.out.printf("5. Return a string of all traders’ names sorted alphabetically --> %s\n\n"
					, transactions.stream()
					 .map(Transaction::getTraderName)
					 .distinct()
					 .sorted()
					 .collect(joining(", ", "[", "]")));
			
			System.out.printf("6. Are any traders based in Milan --> %s\n\n",
					transactions.stream()
					.anyMatch(t -> "Milan".equals(t.getTraderCity())));
			
			System.out.printf("7 The number of traders in Milan --> %s\n\n",
					transactions.stream()
								.map(Transaction::getTrader)
								.distinct()
								.filter(t -> "Milan".equals(t.getCity()))
								.count());
			
			DecimalFormat df = new DecimalFormat("#,###");
			System.out.printf(
				"8. All transactions's values from the traders living in Cambridge --> %s\n\n",
				transactions.stream()
							.filter(t -> "Cambridge".equals(t.getTraderCity()))
							.map(t -> df.format(t.getValue()))
							.collect(Collectors.joining(" "))
			);
			
			
			System.out.printf("9. The highest value of all the transactions --> %s\n\n", 
					df.format(
							transactions.stream()
							.mapToDouble(Transaction::getValue)
							.max()
							.orElseThrow()
							)
					);
			
			System.out.printf("10. The transaction with the smallest value --> %s\n\n", 
					df.format(
							transactions.stream()
							.mapToDouble(Transaction::getValue)
							.min()
							.orElseThrow()));
		
	}
	
}
