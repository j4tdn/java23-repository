 package view.livedemo;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import  static ultisl.CollectionUtils.*;
import bean.Transaction;
import model.DataModel;

public class lesson12text {

	public static void main(String[] args) {
		var transactions = DataModel.getTransactions();
		
		generate(
			"1. Find all transactions in the year 2024 and sort them by value (small to high)",
			transactions.stream().filter(t -> t.getCreatedTime().toLocalDate().getYear() == 2024)
			.sorted(Comparator.comparing(Transaction :: getValue))
			.toList()
		);
		generate(
				"2. Find all transactions have value greater than 2000 and sort them by trader’s city",
				transactions.stream()
						.filter(t -> t.getValue() > 3000)
						.sorted(Comparator.comparing(Transaction :: getTraderCity))
						.toList()
			);
		generate(
				"3. What are all the unique cities where the traders work",
				transactions.stream().map(t -> t.getTraderCity()).collect(Collectors.toSet())
			);
		generate(
				"4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream().filter(t -> t.getTraderCity().equals("Cambridge"))
									.sorted(Comparator.comparing(Transaction :: getTraderName))
									.toList()
			);
		generate(
				"5. Return a string of all traders’ names sorted alphabetically",
				transactions.stream().map(t -> t.getTraderCity()).collect(Collectors.toSet())
			);
		generate(
				"6. Are any traders based in Milan",
				transactions.stream().filter(t -> t.getTraderCity().endsWith("Milan")).toList()
			);
		long n = transactions.stream().filter(t -> t.getTraderCity().endsWith("Milan")).count();
		
		System.out.println("7 The number of traders in Milan = " +
				transactions.stream().filter(t -> t.getTraderCity().endsWith("Milan")).count());	
				
			
		generate(
				"8. Print all transactions's values from the traders living in Cambridge",
				transactions.stream().filter(t -> t.getTraderCity().equals("Cambridge"))
				.map(t-> t.getValue())
				.toList()
			);
		System.out.println("9. What’s the highest value of all the transactions = "+
				transactions.stream().mapToDouble(Transaction::getValue).max().orElse(0d)
			);	
				
			
		System.out.println("10. Find the transaction with the smallest value= " + 
				transactions.stream().reduce((t1,t2) -> t1.getValue() > t2.getValue() ? t1:t2)
		);	
			
		
	}
	
	
}
