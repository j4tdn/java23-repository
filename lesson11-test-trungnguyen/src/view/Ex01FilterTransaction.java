package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static model.DataModel.*;

import bean.Trader;
import bean.Transaction;
import static utils.CollectionUtils.*;

public class Ex01FilterTransaction {
	
	public static void main(String[] args) {
		
		List<Transaction> transactions = getTransactions(getTraders());
	
		List<Transaction> transactions2011 = new ArrayList<>();
		
		for (Transaction transaction : transactions) {
			if (transaction.getCreated_item().getYear() == 2011) {
				transactions2011.add(transaction);
			}
		}
		
		transactions2011.sort((transaction1, transaction2) -> {
			return transaction1.getValue().compareTo(transaction2.getValue());
		});
		
		generate("1.Transaction trong năm 2011, giá trị nhỏ đến lớn", transactions2011);
		
		List<Transaction> transactions300 = new ArrayList<>();
		
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > 300) {
				transactions300.add(transaction);
			}
		}
		
		transactions300.sort((o1, o2) -> {
			return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
		});

		generate("2.Transaction lớn hơn 300, tên thành phố theo bảng chữ cái", transactions300);
		
		Set<String> uniqueCity = new HashSet<>();
		for (Trader trader: getTraders()) {
			uniqueCity.add(trader.getCity());
		}
		generate("3. Thành phố trader làm việc ", uniqueCity);
		
		List<Trader> tradersFromPhuLoc = new ArrayList<>();
		for (Trader trader : getTraders()) {
			if (trader.getCity() == "Phú Lộc") {
				tradersFromPhuLoc.add(trader);
			}
		}
		tradersFromPhuLoc.sort((o1, o2) -> {
			return o2.getName().compareTo(o2.getName());
		});
	
		generate("4. Tìm tất cả trader từ Phú lộc và sắp xếp ngược bảng chữ cái", tradersFromPhuLoc);
	
		List<Trader> tradersSorting = getTraders();
		tradersSorting.sort((o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		StringBuilder builder = new StringBuilder();
		for (Trader trader : tradersSorting) {
			builder.append(trader.getName() + ", ");
		}
		System.out.println(builder);
	}

}
