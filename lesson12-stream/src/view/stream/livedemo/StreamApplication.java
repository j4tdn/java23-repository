package view.stream.livedemo;

import java.util.Comparator;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import static java.util.Comparator.*;
import static utils.CollectionUtils.*;
import model.DataModel;

public class StreamApplication {

	public static void main(String[] args) {
		var transactions = DataModel.getTransactions();
		
		generate(
			"1. Find all transactions in the year 2024 and sort them by value (small to high)",
			transactions.stream()
					.filter(t -> t.getCreatedTime().toLocalDate().getYear() == 2024)
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
				.map(t -> t.getTrader().getCity())
//				.distinct()
//				.toList()
				.collect(Collectors.toSet())
		);
		
		generate("4. Find all traders from Cambridge and sort them by name desc.", 
				transactions.stream()
				.filter(t -> "Cambridge".equals(t.getTraderCity()))
				.map(Transaction::getTrader)
				.sorted(Comparator.comparing(Trader::getName).reversed())
				.collect(Collectors.toSet())
				);

		System.out.println("5. Return a string of all traders’ names sorted alphabetically: " +
				transactions.stream()
		        .map(Transaction::getTraderName)
		        .distinct()
		        .collect(Collectors.joining(", ", "[", "]"))
		);

		System.out.println("\n6. Are any traders based in Milan? " + 
				transactions.stream()
				.anyMatch(t -> t.getTrader().getCity().equals("Milan"))
				);
		
		System.out.println("\n7. Count the number of traders in Milan: " + 
				transactions.stream()
				.map(Transaction::getTrader)
				.distinct()
				.filter(t -> "Milan".equals(t.getCity()))
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
				.orElse(0d)
		);
		
		System.out.printf("\n10. Find the transaction with the smallest value:\n %s",
				transactions.stream()
				.reduce((result, element) -> result.getValue() > element.getValue() ? element : result)
		);
		
		
		// Task làm bây giờ
		// làm 9 câu còn lại : 9h40 - 10h30
		// làm xong add, commit push lên nhánh workspace-hoten
	}
}
