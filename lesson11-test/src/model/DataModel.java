package model;

import java.util.List;

import bean.Transaction;

public class DataModel {

	public DataModel() {
	}
	public static List<Transaction> mockData(){
		
		return List.of(
				new Transaction(1,"A",2021,220d),
				new Transaction(2,"B",2021,320d),
				new Transaction(3,"C",2022,420d),
				new Transaction(4,"D",2023,520d),
				new Transaction(1,"D",2022,720d)
				);
		
	}
	
}
