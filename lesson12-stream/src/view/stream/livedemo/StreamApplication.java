package view.stream.livedemo;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import bean.Transaction;
import model.DataModel;
import utils.CollectionUtils;
import static utils.CollectionUtils.*;
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
				.sorted(Comparator.comparing(Transaction::getTraderName).reversed())
				.toList()
				);
		
		String traderNames = transactions.stream()
		        .map(Transaction::getTraderName) 
		        .sorted() 
		        .distinct() 
		        .collect(Collectors.joining(", "));

		generate("5. Return a string of all traders’ names sorted alphabetically",
				traderNames);
		
		generate("6. Are any traders based in Milan ?",
				transactions.stream()
				.anyMatch(t -> t.getTraderCity().equals("Milan"))
				);
	   
		generate("7. Count the number of traders in Milan",
				transactions.stream()
				.filter(t -> t.getTraderCity().equals("Milan"))
				.count()
				);
		
		CollectionUtils.generate("8. Print all transactions’ values from the traders living in Cambridge.",
				transactions.stream()
				.filter(t -> t.getTraderCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.toList()
				);
		
		System.out.printf("9. What’s the highest value of all the transactions ? --> %s",
				transactions.stream()
				.mapToDouble(Transaction::getValue)
				.max());
				 
		
		System.out.printf("\n10. Find the transaction with the smallest value --> %s",
				transactions.stream()
				.mapToDouble(Transaction::getValue)
				.min());
	}
	
	private static <T> void generate(String question, boolean value) {
		System.out.println(question + " --> " + value + "\n");
	}
	
	private static <T> void generate(String question, long value) {
		System.out.println(question + " --> " + value + "\n");
	}
	
	private static <T> void generate(String question, String value) {
		System.out.println(question + " --> " + value + "\n");
	}
}
