package view.stream.livedemo;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;
import utils.CollectionUtils;
public class StreamApplication {

	public static void main(String[] args) {
		var transactions = DataModel.getTransactions();
		
		CollectionUtils.generate("1. Find all transactions in the year 2024 and sort them by value (small to high)",
				transactions.stream()
				.filter(t -> t.getCreatedTime().toLocalDate().getYear() == 2024)
				.sorted(Comparator.comparing(Transaction::getValue))
				.toList()
				);
		
		CollectionUtils.generate("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				transactions.stream()
				.filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(Transaction::getTraderCity))
				.toList()
				);
		
		CollectionUtils.generate("3. What are all the unique cities where the traders work ?",
				transactions.stream()
				.map(Transaction::getTraderCity)
				.collect(Collectors.toSet())
				);
		
		CollectionUtils.generate("4. Find all traders from Cambridge and sort them by name desc",
				transactions.stream()
				.filter(t -> t.getTraderCity().equals("Cambridge"))
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getName).reversed())
				.collect(Collectors.toSet())
				);
		
		String traderNames = transactions.stream()
		        .map(Transaction::getTraderName) 
		        .distinct() 
		        .sorted()
		        .collect(Collectors.joining(", ", "[", "]"));

		generate("5. Return a string of all traders’ names sorted alphabetically",
				traderNames);
		
		generate("6. Are any traders based in Milan ?",
				transactions.stream()
				.anyMatch(t -> "Milan".equals(t.getTraderCity()))
				);
	   
		System.out.printf("7. Count the number of traders in Milan --> %s\n\n",
				transactions.stream()
				.map(Transaction::getTrader)
				.distinct()
				.filter(t -> "Milan".equals(t.getCity())).count()
				);
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.printf("8. Print all transactions’ values from the traders living in Cambridge --> %s\n\n",
				transactions.stream()
				.filter(t -> "Cambridge".equals(t.getTraderCity()))
				.map(t -> df.format(t.getValue()))
				.collect(Collectors.joining(" "))
				);
		
		System.out.printf("9. What’s the highest value of all the transactions ? --> %s\n\n",
				df.format(
						transactions.stream()
									.mapToDouble(Transaction::getValue)
									.max()
									.orElseThrow())
				);
				 
		
		System.out.printf("10. Find the transaction with the smallest value --> %s",
				df.format(
						transactions.stream()
									.mapToDouble(Transaction::getValue)
									.min()
									.orElseThrow())
				);
	}
	
	private static <T> void generate(String question, boolean value) {
		System.out.println(question + " --> " + value + "\n");
	}
	
	private static <T> void generate(String question, String value) {
		System.out.println(question + " --> " + value + "\n");
	}
}
