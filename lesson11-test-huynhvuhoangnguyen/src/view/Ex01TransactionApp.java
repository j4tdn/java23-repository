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

import bean.TransactionFix;
import model.DataModel;

public class Ex01TransactionApp {
	

	public static void main(String[] args) {
		var transactions = DataModel.getTransactions();
		
		generate("1. Find all transactions in the year 2011 and sort them by value (small to high).",
				 findTransactions(
						transactions,
						t -> t.getCreatedTime().getYear() == 2024,
						(t1, t2) -> t1.getValue().compareTo(t2.getValue())));
		
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				 findTransactions(
						transactions,
						t -> t.getValue() > 2000,
						(t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())));
		
		generate("3. What are all the unique cities where the traders work ?",
				Set.copyOf(transform(transactions, t -> t.getTrader().getCity()))
		);
		
		generate("4. Find all traders from Cambridge and sort them by name desc.",
				Set.copyOf(transform(
						findTransactions(transactions, t -> t.getTrader().getCity().equals("Cambridge")),
						t -> t.getTrader()))
		);
		
		var tNames = new TreeSet<>(transform(transactions, t -> t.getTraderName()));
		System.out.printf(
				"5. Return a string of all traders’ names sorted alphabetically --> %s\n\n",
				String.join(", ", tNames));
		
//		
		System.out.printf("6. Are any traders based in Milan? --> %s\n\n",
				test(transactions, t -> t.getTraderCity().equals("Milan")));
		
//		
		System.out.printf("7. Count the number of traders in Milan --> %s\n\n",
				count(transactions, t -> t.getTraderCity().equals("Milan")));
		
		generate("8. Print all transactions’ values from the traders living in Cambridge.",
				transform(
						findTransactions(transactions, t -> t.getTrader().getCity().equals("Cambridge")),
						(t -> t.getValue()))
		);
		
		// System.out.printf("9. What’s the highest value of all the transactions --> %s\n\n",
				// max(transactions));
//		System.out.printf("9. What’s the highest value of all the transactions --> %s\n\n",
//				reduce(transactions, Double.MIN_VALUE, (v1, v2) -> v1 < v2));
//		
//		// System.out.printf("10. What’s the lowest value of all the transactions --> %s\n\n",
//				// min(transactions));
//		
//		System.out.printf("10. What’s the lowest value of all the transactions --> %s\n\n",
//				reduce(transactions, Double.MAX_VALUE, (v1, v2) -> v1 > v2));
		System.out.printf("9. What’s the highest value of all the transactions --> %s\n\n",
				reduce(transactions, Double.MIN_VALUE, (v1, v2) -> v1 > v2 ? v1 : v2));
		
		System.out.printf("10. What’s the lowest value of all the transactions --> %s\n\n",
				reduce(transactions, Double.MAX_VALUE, (v1, v2) -> v1 < v2 ? v1 : v2));
		
	}
	
	// max --> reduce(transactions, Double.MIN_VALUE)
	// min --> reduce(transactions, Double.MAX_VALUE)
	
	// if(max < transaction.getValue())
	// if(min > transaction.getValue())
	
	// boolean cond(Double result, Double current)
	
	// Double get(Double result, Double current)
	
	private static Double reduce(List<TransactionFix> transactions, Double initial,
								 BinaryOperator<Double> binaryOperator) {
		Double result = initial;

		for (TransactionFix transaction : transactions) {
				result = binaryOperator.apply(result, transaction.getValue());
		}

		return result;
	}
	
//	private static Double reduce(List<TransactionFix> transactions, Double initial, 
//								 BiPredicate<Double, Double> biPredicate) {
//		Double result = initial;
//
//		for (TransactionFix transaction : transactions) {
//			if (biPredicate.test(result, transaction.getValue())) {
//				result = transaction.getValue();
//			}
//		}
//
//		return result;
//	}
	
	
	private static Double min(List<TransactionFix> transactions) {
		Double min = Double.MAX_VALUE;
		
		for(TransactionFix transaction : transactions) {
			if(min > transaction.getValue()) {
				min = transaction.getValue();
			}
		}
		
		return min;
	}
	
	private static Double max(List<TransactionFix> transactions) {
		Double max = Double.MIN_VALUE;
		
		for(TransactionFix transaction : transactions) {
			if(max < transaction.getValue()) {
				max = transaction.getValue();
			}
		}
		
		return max;
	}
	
	// transaction --> transaction.getValue()
	// transaction --> transaction.getId()
	// transaction --> transaction.getcreatedTime()
	
	// R convert(Transaction transaction)
	// R convert(T t)
	
	private static int count(List<TransactionFix> transactions, Predicate<TransactionFix> predicate) {
		var result = findTransactions(transactions, predicate);
		
		return Set.copyOf(transform(result, t -> t.getTrader())).size();
	}
	
	private static boolean test(List<TransactionFix> transactions, Predicate<TransactionFix> predicate) {

		for (var transaction : transactions) {
			if (predicate.test(transaction)) {
				return true;
			}
		}

		return false;
	}

	private static <R> List<R> transform(List<TransactionFix> transactions,
											   Function<TransactionFix, R> transformer) {
		List<R> result = new ArrayList<>();
		
		for(var transaction : transactions) {
			result.add(transformer.apply(transaction));
		}
		
		return result;
	}
	
	// transaction.getCreatedTime.getYear() == year
	// transaction.getValue() > value
	// strategy pattern
	// boolean test(Transaction transaction)
	
	private static List<TransactionFix> findTransactions(List<TransactionFix> transactions, 
										Predicate<TransactionFix> predicate) {
		List<TransactionFix> result = new ArrayList<>();
		
		for(var transaction : transactions) {
			if(predicate.test(transaction)) {
				result.add(transaction);
			}
		}
		
		return result;
	}
	
	private static List<TransactionFix> findTransactions(List<TransactionFix> transactions, 
												Predicate<TransactionFix> predicate,
												Comparator<TransactionFix> comparator) {
		
		var result = findTransactions(transactions, predicate);
		result.sort(comparator);
		return result;
		
	}
	
	private static <T>void generate(String question, Collection<T> elements) {
		System.out.println(question + " --> {");
		elements.forEach(element -> System.out.println("    + " + element));
		System.out.println("}\n");
	}
	
}
