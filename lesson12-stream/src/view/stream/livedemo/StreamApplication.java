package view.stream.livedemo;

import java.util.Comparator;
import java.util.stream.Collectors;

import bean.Transaction;
import model.DataModel;
import utils.CollectionUtils;

public class StreamApplication {

	public static void main(String[] args) {
		
		var transactions = DataModel.getTransactions();
		
		//Ex01Find all transactions in the year 2024 and sort them by value (small to high)	
	     CollectionUtils.generate("Ex01 Find all transactions in the year 2024 and sort them by value (small to high)", 
	    		 transactions.stream()
	              .filter(T -> T.getCreatedTime().toLocalDate().getYear() == 2024)
	  		      .sorted(Comparator.comparing(Transaction::getValue))
	               .toList());
	     
	     // Ex02 Find all transactions have value greater than 2000 and sort them by trader’s city
	     
	     CollectionUtils.generate("Ex02 Find all transactions have value greater than 2000 and sort them by trader’s city",
	    		 transactions.stream()
	    		                .filter(t -> t.getValue() > 2000 )
	    		                .sorted(Comparator.comparing(Transaction::getTraderCity))
	    		                .toList()
	    		 );
	     
	     // Ex03 What are all the unique cities where the traders work"
	     
	     CollectionUtils.generate("Ex03 What are all the unique cities where the traders work",
	    		 transactions.stream()
	    		 .map(t -> t.getTraderCity())
	    		 .distinct()
	    		 .toList()
	    		 );
	     
	     // Ex04
	     
	     CollectionUtils.generate("Ex04 Find all traders from Cambridge and sort them by name desc",
	    		 transactions.stream()
	    		 .filter(t -> t.getTraderCity() == "Cambridge")
	    		 .sorted(Comparator.comparing(Transaction::getTraderCity).reversed())
	    		 .toList()
	    		 );
	     
	     //Ex05
	   
	     CollectionUtils.generate("Ex05 Return a string of all traders’ names sorted alphabetically(bé -> lớn)", 
	    		 transactions.stream()
	    		 .map(t1 -> t1.getTraderName())
	    		 .distinct()
	    		 .sorted((o1, o2) -> {
	    			 return o1.compareTo(o2);
	    		 })
	    		 .toList()
	    		 );
	     
	     //Ex06
	     CollectionUtils.generate(" Ex06 Are any traders based in Milan",
	    		 transactions.stream()
	    		 .filter(t -> t.getTraderCity().equalsIgnoreCase("Milan"))
	    		 .toList());
	     
	    // Ex07
	     
	     CollectionUtils.generate("Ex07 Count the number of traders in Milan", 
	    		 
	    		 transactions.stream()
	    		 .filter(t -> t.getTraderCity().equalsIgnoreCase("Milan"))
	    		 .count());
	   
	     //Ex08 
	    
	     CollectionUtils.generate("Print all transactions's values from the traders living in Cambridge",
	    		 transactions.stream()
	    		 .filter(t -> t.getTraderCity().equalsIgnoreCase("Cambridge"))
	    		 .map(t -> t.getValue())
	    		 .toList());
	     
	     //Ex09
	   CollectionUtils.generate("What’s the highest value of all the transactions", 
			    transactions.stream()
			   .max(Comparator.comparing(Transaction::getValue))
			   .get());  

	   // Ex10 
	   CollectionUtils.generate(" Find the transaction with the smallest value",
			   transactions.stream()
			   .min(Comparator.comparing(Transaction::getValue))
			   .get());  

			  
	     
	     
	    		 
	     

	     
	     
	      
	      
		
		
		
	}
}
