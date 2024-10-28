package view;

import java.util.ArrayList;
import java.util.List;

import beam.Transaction;
import model.DataModel;

public class Ex01Trader {
	public static void main(String[] args) {
		List<Transaction> trans = DataModel.mockTransaction();
		List<Transaction> transactions = new ArrayList<>();
		for(Transaction transaction: trans) {
			if(transaction.getCreated_item().getYear() <= 2011) {
				transactions.add(transaction);
			}
		}
		
		System.out.println("1.");
		print(transactions);
		
	}
	public static void print(List<Transaction> transactions) {
		for(Transaction transaction: transactions) {
			System.out.println(transaction);
		}
		System.out.println("\n");
	}
}
