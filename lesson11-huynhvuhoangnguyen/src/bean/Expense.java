package bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Expense {
	
	private Map<String, Double> expenses;
	
	public Expense() {
		expenses = new HashMap<>();
	}
	
	public void addExpense(String description, double amount) {
		expenses.put(description, amount);
	}
	
	public void listExpenses() {
		System.out.println("Expenses greater than 500.000VND:");
		for(Map.Entry<String, Double> entry : expenses.entrySet()) {
			if(entry.getValue() > 500000) {
				System.out.println("Expense: " + entry.getKey() + " - Amount: " + entry.getValue() + " VND");
			}
		}
	}
	
//	public void sortExpensesByKey() {
//		List<Map.Entry<String, Double>> expenseList = new ArrayList<>(expenses.entrySet());
//		expenseList.sort((e1, e2) -> e1.getKey().compareTo(e2.getKey()));
//		
//		System.out.println("Expenses sorted by description:");
//		for(Map.Entry<String, Double> entry : expenseList) {
//			System.out.println("Expense: " + entry.getKey() + " - Amount: " + entry.getValue() + " VND");
//		}
//	}
//	
//	public void sortExpensesByValueDesc() {
//		List<Map.Entry<String, Double>> expenseList = new ArrayList<>(expenses.entrySet());
//		expenseList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
//		
//		System.out.println("Expenses sorted by value (descending):");
//		for(Map.Entry<String, Double> entry : expenseList) {
//			System.out.println("Expense: " + entry.getKey() + " - Amount: " + entry.getValue() + " VND");
//		}
//	}
	
	public void sortExpense(String sortBy) {
		List<Map.Entry<String, Double>> expenseList = new ArrayList<>(expenses.entrySet());
		
		if(sortBy.equalsIgnoreCase("key")) {
			expenseList.sort((e1, e2) -> e1.getKey().compareTo(e2.getKey()));
			System.out.println("Expenses sorted by description (ascending):");
		} else if(sortBy.equalsIgnoreCase("value")) {
			expenseList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
			System.out.println("Expenses sorted by value (descending): ");
		} else {
			System.out.println("Invalid sort criteria. Please use 'key' or 'value'.");
			return;
		}
		
		for(Map.Entry<String, Double> entry : expenseList) {
			System.out.println("Expense: " + entry.getKey() + " - Amount: " + entry.getValue() + " VND");
		}
	}

}