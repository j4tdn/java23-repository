package view.online.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01Transaction {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();

		// 1. Find trans in 2011, sort by value (small to high).
		List<Transaction> transactionsOpt1 = transactions.stream()
					.filter(tran -> tran.getYear() == 2011)
					.sorted(Comparator.comparing(Transaction::getValue))
					.toList();
		
		// 2. Find tran with value > 300. sort by city

		
		List<Transaction> t2 = transactions.stream()
				.filter(tran -> tran.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
				.toList();

		// 3. What are all the unique cities where traders work?
		
		// Map -> chuyển về Stream<City> (String)
		// -> set để unique
		transactions.stream()
			.map(t -> t.getTrader().getCity())
			.collect(Collectors.toSet());

		// 4. All traders from cambridge and sort by name desc
		transactions.stream()
			.map(Transaction::getTrader)
			.filter(t -> t.getName().equals("Cambridge"))
			.sorted(Comparator.comparing(Trader::getName).reversed())
			.toList();

		// 5. Return a string of all trader's names and sort alpabet
		transactions.stream()
			.map(Transaction::getTrader)
			.map(Trader::getName)
			.distinct()
			.sorted()
			.collect(Collectors.joining(", "));

		// 6. Are any traders based in Milan?
		transactions.stream()
				.anyMatch(t -> t.getTrader().getCity().equals("Milan"));
		
		// 7. Count number of traders in Milan
		transactions.stream()
			.filter(t -> "Milan".equals(t.getTrader().getCity()))
			.map(Transaction::getTrader)
			.distinct()
			.count();
		
		// 8. Print all trans's values from traders in Cambr
		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.toList()
				.forEach(t -> System.out.println(t));
		
		// 9. What's highest value of all trans
		transactions.stream()
			.mapToInt(Transaction::getValue)
			.max()
			.ifPresentOrElse(val -> System.out.println("max: " +val ),
					() -> System.out.println("Max not found"));
		
		// Nếu có nhiều hơn 1 transac với smallest value

		// 1 --> lấy tất cả in ra

		// 2 --> dựa vào 1 ttihn khác khi smallest trùng

		// 10. find transaction with small value
		var trans10 = transactions.stream() // Stream<Transaction>
				.reduce((t1, s2) -> t1.getValue() < s2.getValue() ? t1 : s2);

	}
	
	public static List<Transaction> getTransactions() {
		// traders
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		// transactions
		List<Transaction> transactions = List.of(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000), 
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2019, 110), 
			new Transaction(mario, 2012, 110), 
			new Transaction(alan, 2012, 950)
		);
		return transactions;
	}
}
