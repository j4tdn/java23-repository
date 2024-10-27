package ex01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TraderTransaction {

	// check
	public static Set<String> getAllTraderCities(List<Trader> traders) {
		return traders.stream().map(Trader::getCity).collect(Collections.toSet());
	}

	public static String getAllTraderName(List<Trader> traders) {

	}

	public static boolean hasTraderInMilan(List<Trader> traders) {
		return traders.stream().anyMatch(t -> "milan".equals(t.getCity()));
	}

	public static long countTradersInMilan(List<Trader> traders) {
		return traders.stream().filter(t -> "Milan".equals(t.getCity())).count();
	}
	// function

	public static List<Transaction> getTransactionsfind2011(List<Transaction> transactions) {
		return transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
	}

	public static List<Transaction> getHightValue(List<Transaction> transactions) {
		return transactions.stream().filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity())).collect(Collectors.toList());
	}

	public static List<Integer> getCambridge(List<Transaction> transactions) {
		return transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		
		Trader trader1= new Trader("1", "Thieenj", "Milan");
		Trader trader2= new Trader("2", "Nguyen", "Cambridge");
		Trader trader3= new Trader("3", "Van", "Lao");
		Trader trader4= new Trader("4", "Bo", "China");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction("1",trader1,2012,"Item1",400),
				new Transaction("2",trader2,2011,"Item2",300),
				new Transaction("3",trader3,2013,"Item3",200),
				new Transaction("4",trader4,2014,"Item4",1590)
			
				);
		Set<String> trader
				
	}
}
