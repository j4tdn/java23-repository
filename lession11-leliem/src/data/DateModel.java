package data;

import java.util.List;

import bean.Trader;
import bean.Transaction;

public class DateModel {

	public DateModel() {
	}

	public static List<Trader> mockTrader() {
		return List.of(new Trader(1, "liem", "quang tri"), 
				new Trader(2, "tri", "da nang"),
				new Trader(3, "duc", "quy nhon"));
	}

	public static List<Transaction> mockTransaction(){
		return List.of(
				new Transaction(1, mockTrader().get(0),2011, 100),
				new Transaction(2, mockTrader().get(1),2021, 200),
				new Transaction(3, mockTrader().get(3),2011, 330),
				new Transaction(4, mockTrader().get(2),2012, 400)
				);
		
				
	}
}
