package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Transaction;
import model.DataModel;

public class Ex01 {
	public static void main(String[] args) {
		List<Transaction> elements = DataModel.mockData();

		List<Transaction> ex1 = getData(elements, year -> year.getCreated_item().getYear() == 2011,
				Comparator.comparing((a, b) -> a.getValue().compareTo(b.getValue())));
	
		
		List<Transaction> ex2 = getData(elements, value -> value.getValue() > 300d,
				Comparator.comparing((a, b) -> a.getTrader().getCity().compareTo(b.getTrader().getCity())));
		
	}

	// Find all transactions in the year 2011 and sort them by value (small to
	// high).
	private static <T> List<T> getData(List<T> elements, Predicate<T> predicate, Comparator<T> comparator) {
		var result = new ArrayList<T>();
		for (T element : elements) {
			if (predicate.test(element))
				result.add(element);
		}

		result.sort(comparator);
		return result;
	}
}
