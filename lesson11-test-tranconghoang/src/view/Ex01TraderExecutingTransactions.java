package view;

import java.util.ArrayList;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class Ex01TraderExecutingTransactions {

	public static void main(String[] args) {
		List<Transaction> trans = new ArrayList<Transaction>(mockData());
		
		System.out.println("3/What are all the unique cities where the traders work ? \n-->");
		for(Transaction tran: trans)
			System.out.println(tran.getTrader().getCity());
		
		System.out.println("4/Find all traders from Cambridge and sort them by name desc \\n-->");
		trans.sort((tran1, tran2) -> {
			return tran2.getTrader().getName().compareTo(tran1.getTrader().getName());
		});
		for(Transaction tran: trans)
			if(tran.getTrader().getCity().equals("Cambridge"))
				System.out.println(tran.getTrader().getCity());
	}
	
	private static List<Transaction> mockData() {
		return List.of(
				new Transaction(10, new Trader(01, "Nick", "NewYork"), "Motorbike", 2000d),
				new Transaction(11, new Trader(02, "James", "Sydney"), "Car", 3000d),
				new Transaction(12, new Trader(03, "Carrick", "Melbourne"), "Book", 500d),
				new Transaction(13, new Trader(04, "Lisha", "Vancouver"), "Headphone", 700d),
				new Transaction(14, new Trader(05, "Tom", "Los Santos"), "Keyboard", 850d),
				new Transaction(15, new Trader(06, "Henry", "Cambridge"), "Laptop", 2500d)
				);
	}
}
