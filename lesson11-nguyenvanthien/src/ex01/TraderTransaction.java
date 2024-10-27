package ex01;

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
		return transactions.stream()
				.filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
	}
	

//	public static void main(String[] args) {
////		Trader trader1= new Trader("1", "Thieenj", "Milan");
////		Trader trader2= new Trader("2", "Nguyen", "VietNam");
////		Trader trader3= new Trader("3", "Van", "Lao");
////		Trader trader4= new Trader("4", "Bo", "China");
//	}
}
