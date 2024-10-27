package view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Transaction;

public class Q01TraderExecutingTransactions {

	public static void main (String[] args) {
		
		
		
		
	}
	
	public List<Transaction> getTransaction2011 ( List<Transaction> transactions){
		
		List<Transaction> result = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		
		for (var transaction : transactions) {
			cal.setTime(transaction.getCreatedItem());
			int year = cal.get(Calendar.YEAR);
				
			if (year == 2011) {
				result.add(transaction);
			}
		}
		result.sort((o1,o2) ->{
			return o1.getValue().compareTo(o2.getValue());
		});
		return result;
	}
	
	public List<Transaction> getTransactionGreaterThan300(List<Transaction> transactions){
		List<Transaction> result = new ArrayList<>();
		for (var transaction : transactions) {
			if (transaction.getValue() > 300 ) {
				result.add(transaction);
			}
		}
		result.sort((o1,o2) ->{
			return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
		});
		return result;
	}
	
	public String uniqueCity (List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		int max = 0;
		String city = " ";
		for (var transaction : transactions) {
			if(transaction.getValue() > max) {
				max = transaction.getValue();
				city = transaction.getTrader().getCity();
			}
		
		}
		return city;
	}
	
	public List<Transaction> getAllTraderInCambridge (List<Transaction> transactions){
		List<Transaction> result = new ArrayList<>();
		for (var transaction : transactions) {
			if (transaction.getTrader().getCity() == "Cambridge") {
				result.add(transaction);
			}
		}
		result.sort((o1, o2) ->{
			return o2.getTrader().getName().compareTo(o1.getTrader().getName());
		});
		
		return result;
	}
	
}
