package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class Ex01AppTrader {

	public static void main(String[] args) {
		List<Transaction> transactions = List.of(
				new Transaction(1, new Trader(1, "Thanh", "Danang"), "Item1", 1000),
				new Transaction(2, new Trader(2, "Tuan", "Milan"), "Item2", 400),
				new Transaction(3, new Trader(3, "Ha", "Cambride"), "Item3", 700),
				new Transaction(4, new Trader(4, "Nhi", "Milan"), "Item4", 710),
				new Transaction(5, new Trader(5, "Nghia", "Cambride"), "Item5", 950),
				new Transaction(6, new Trader(6, "Hoang", "Cambride"), "Item6", 350)
		);
		
		//1.
		List<Transaction> q1 = new ArrayList<>(transactions);
		q1.removeIf(t -> !t.getCreatedItem().endsWith("2011"));
		q1.sort(Comparator.comparingInt(Transaction::getValue));
		System.out.println("Transacitons in 2011 sorted by value: " + q1);
	
		
	}
	
}
