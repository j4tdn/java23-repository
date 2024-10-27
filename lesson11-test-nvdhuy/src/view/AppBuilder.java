package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class AppBuilder {
		public static void main(String[] args) {
		List<Trader> traders =new ArrayList<Trader>();
		
		Trader trade1 = new Trader("A", "Da Nang");
		Trader trade2 = new Trader("B", "Ho Chi Minh");
		Trader trade3 = new Trader("C", "Yen Bai");
		Trader trade4 = new Trader("D", "Ha Noi");
		
		List<Transaction> transactions =new ArrayList<Transaction>();
				
		Transaction transaction1 = new Transaction(Trader.sorted,"2024",100);
		}
	}


	   