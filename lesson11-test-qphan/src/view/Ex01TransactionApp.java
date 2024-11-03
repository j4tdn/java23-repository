package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Transaction;
import model.DataModel;

public class Ex01TransactionApp {
	
	public static void main(String[] args) {
		var transactions = DataModel.getTransactions();
		
		generate(
			"1. Find all transactions in the year 2024 and sort them by value (small to high)",
			findTransactions(
					transactions,
					t -> t.getCreatedTime().getYear() == 2024, 
					(t1, t2) -> t1.getValue().compareTo(t2.getValue()))
		);
		
		generate(
			"2. Find all transactions have value greater than 2000 and sort them by trader’s city",
			findTransactions(
					transactions,
					t -> t.getValue() > 2000, 
					(t1, t2) -> t1.getTraderCity().compareTo(t2.getTraderCity()))
		);
		
		generate(
			"3. What are all the unique cities where the traders work",
			Set.copyOf(transform(transactions, t -> t.getTraderCity()))
		);
		
		generate(
			"4. Find all traders from Cambridge and sort them by name desc.",
			Set.copyOf(transform(
					findTransactions(transactions, t -> t.getTraderCity().equals("Cambridge")), 
					t -> t.getTrader()))
		);
		
		var tNames = new TreeSet<>(transform(transactions, t -> t.getTraderName()));
		System.out.printf(
				"5. Return a string of all traders’ names sorted alphabetically --> %s\n\n", 
				String.join(", ", tNames));
		
		System.out.printf("6. Are any traders based in Milan --> %s\n\n",
				test(transactions, t -> t.getTraderCity().equals("Milan")));
		
		System.out.printf("7 Count the number of traders in Milan --> %s\n\n",
				count(transactions, t -> t.getTraderCity().equals("Milan")));
		
		generate(
			"8. Print all transactions's values from the traders living in Cambridge",
			transform(
					findTransactions(transactions, t -> t.getTraderCity().equals("Cambridge")), 
					t -> t.getValue())
		);
		
		// 9. What’s the highest value of all the transactions ?
		// System.out.printf("9. What’s the highest value of all the transactions --> %s\n\n", max(transactions));
		
		// System.out.printf("10. Find the transaction with the smallest value --> %s\n\n", min(transactions));
		
		//System.out.printf("10. Find the transaction with the smallest value --> %s\n\n", 
		//		reduce(transactions, Double.MIN_VALUE, (v1, v2) -> v1 < v2));
		
		System.out.printf("9. What’s the highest value of all the transactions --> %s\n\n", 
				reduce(transactions, Double.MIN_VALUE, (v1, v2) -> v1 > v2 ? v1 : v2));
		
		System.out.printf("10. Find the transaction with the smallest value --> %s\n\n", 
				reduce(transactions, Double.MAX_VALUE, (v1, v2) -> v1 < v2 ? v1 : v2));
		
	}
	
	// max --> reduce(transactions, Double.MIN_VALUE)
	// min --> reduce(transactions, Double.MAX_VALUE)
	
	// if(max < transaction.getValue())
	// if(min > transaction.getValue())
	
	// boolean cond(Double result, Double current)
	
	// Double get(Double result, Double current)
	
	private static Double reduce(List<Transaction> transactions, Double initial, BinaryOperator<Double> operator) {
		Double result = initial;
		
		for (Transaction transaction: transactions) {
			result = operator.apply(result, transaction.getValue());
		}
		
		return result;
	}
	
//	private static Double reduce(List<Transaction> transactions, Double initial, BiPredicate<Double, Double> bipredicate) {
//		Double result = initial;
//		
//		for (Transaction transaction: transactions) {
//			if (bipredicate.test(result, transaction.getValue())) {
//				result = transaction.getValue();
//			}
//		}
//		
//		return result;
//	}
	
	private static Double max(List<Transaction> transactions) {
		Double max = Double.MIN_VALUE;
		
		for (Transaction transaction: transactions) {
			if (max < transaction.getValue()) {
				max = transaction.getValue();
			}
		}
		
		return max;
	}
	
	private static Double min(List<Transaction> transactions) {
		Double min = Double.MAX_VALUE;
		
		for (Transaction transaction: transactions) {
			if (min > transaction.getValue()) {
				min = transaction.getValue();
			}
		}
		
		return min;
	}
	
	private static int count(List<Transaction> transactions, Predicate<Transaction> predicate) {
		var result = findTransactions(transactions, predicate);
		return Set.copyOf(transform(result, t -> t.getTrader())).size();
	}
	
	private static boolean test(List<Transaction> transactions, Predicate<Transaction> predicate) {
		for (var transaction: transactions) {
			if (predicate.test(transaction)) {
				return true;
			}
		}
		return false;
	}
	
	
	private static <R> List<R> transform(List<Transaction> transactions, Function<Transaction, R> transformer) {
		List<R> result = new ArrayList<>();
		for (var transaction: transactions) {
			result.add(transformer.apply(transaction));
		}
		return result;
	}
	
	private static List<Transaction> findTransactions(List<Transaction> transactions, Predicate<Transaction> predicate) {
		List<Transaction> result = new ArrayList<>();
		for (var transaction: transactions) {
			if (predicate.test(transaction)) {
				result.add(transaction);
			}
		}
		return result;
	}
	
	private static List<Transaction> findTransactions(List<Transaction> transactions,
			Predicate<Transaction> predicate, Comparator<Transaction> comparator) {
		var result = findTransactions(transactions, predicate);
		result.sort(comparator);
		return result;
	}
	
	private static <T> void generate(String question, Collection<T> elements) {
		System.out.println(question + " --> {");
		elements.forEach(element -> System.out.println("   + " + element));
		System.out.println("}\n");
	}
	
}
