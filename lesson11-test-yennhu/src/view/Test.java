package view;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;

public class Test {

	
	public static void main(String[] args) {
		
		List<Trader> traders = new ArrayList<>(Arrays.asList(
				new Trader(1,  "Trader1", "DaNang"),
				new Trader(2,  "Trader2", "Hue"),
				new Trader(3,  "Trader3", "Quang Tri"),
				new Trader(4,  "Trader4", "Hai Phong"),
				new Trader(5,  "Trader5", "DaNang")
				));
		
		List<Transaction> transactions = new ArrayList<>(Arrays.asList(
				new Transaction(1,  traders.get(1), LocalDateTime.now(), 400d),
				new Transaction(2,  traders.get(2), LocalDateTime.of(2024, 5,10, 10, 10, 0), 500d),
				new Transaction(3,  traders.get(1), LocalDateTime.of(2011, 5,10, 10, 10, 50),400d),
				new Transaction(4,  traders.get(4), LocalDateTime.of(2023, 5,10, 10, 10, 50),550d),
				new Transaction(5,  traders.get(3), LocalDateTime.of(2024, 5,10, 10, 10, 50),200d)
				));
		
		//1/
		System.out.println("   --> 1. Find all transactions in the year 2011 and sort them by value (small to high)\n" + foundYear(transactions));
		
		// 2. 
		System.out.println("   --> 2. Find all transactions have value greater than 300 and sort them by trader’s city\n" + foundValue(transactions));
		
		// 3.
		System.out.println("   --> 3. What are all the unique cities where the traders work ?\n" + foundCities(traders));
		
		// 4.
		System.out.println("   --> 4. Find all traders from Cambridge and sort them by name desc.\n" + foundTradersFromDaNang(traders));
		
	}
	private static Set<String> foundCities(List<Trader> traders) {
		Set<String> cities = new HashSet<>();
		for (Trader t: traders) {
			cities.add(t.getCity());
		}
		return cities;
	}
	
	private static List<Transaction> foundYear(List<Transaction> transactions) {
		List<Transaction> transactionYear = new ArrayList<>();
		for(Transaction t: transactions) {
			if(t.getCreated_item().getYear() == 2011) {
				transactionYear.add(t);
			}
		}
		transactionYear.sort((t1, t2) -> {
			return t1.getValue().compareTo(t2.getValue());
		});
		return transactionYear;
	}
	
	private static List<Trader> foundTradersFromDaNang(List<Trader> traders) {
		List<Trader> tradersCity = new ArrayList<>();
		for(Trader t: traders) {
			if(t.getCity() == "DaNang") {
				traders.add(t);
			}
		}
		tradersCity.sort((t1, t2) -> {
			return t2.getName().compareTo(t1.getName());
		});
		return tradersCity;
	}
	
	private static List<Transaction> foundValue(List<Transaction> transactions) {
		List<Transaction> transaction300 = new ArrayList<>();
		for(Transaction t: transactions) {
			if(t.getValue() > 300) {
				transaction300.add(t);
			}
		}
		transaction300.sort((t1, t2) -> {
			return t1.getTrader().getCity().compareTo(t2.getTrader().getCity());
		});
		return transaction300;
	}
}
