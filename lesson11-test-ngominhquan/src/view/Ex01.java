package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Ex01 {

	public static void main(String[] args) {
        // Sample data
        Trader t1 = new Trader(1, "Lucifer", "Cambridge");
        Trader t2 = new Trader(2, "Satan", "Milan");
        Trader t3 = new Trader(3, "Bael", "Cambridge");
        Trader t4 = new Trader(4, "Justitia", "London");

        List<Transaction> transactions = new ArrayList<>(Arrays.asList(
                new Transaction(1, t1, 2011, "Item1", 400),
                new Transaction(2, t2, 2012, "Item2", 700),
                new Transaction(3, t3, 2011, "Item3", 200),
                new Transaction(4, t4, 2011, "Item4", 300),
                new Transaction(5, t1, 2011, "Item5", 100)
        ));

        // 1.
        List<Transaction> transactions2011 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("Transactions in 2011 sorted by value: " + transactions2011);

        // 2
        List<Transaction> transactionsGreaterThan300 = transactions.stream()
                .filter(t -> t.getValue() > 300)
                .sorted(Comparator.comparing(t -> t.getTrader().getCity()))
                .collect(Collectors.toList());
        System.out.println("Transactions with value greater than 300 sorted by trader's city: " + transactionsGreaterThan300);

        // 3
        Set<String> uniqueCities = transactions.stream()
                .map(t -> t.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println("Unique cities where traders work: " + uniqueCities);

        // 4
        List<Trader> tradersFromCambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("Traders from Cambridge sorted by name desc: " + tradersFromCambridge);

	}   
	
}
