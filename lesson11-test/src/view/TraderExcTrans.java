package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class TraderExcTrans {

	public static void main(String[] args) {
		
		List<Transaction> trans = new ArrayList<>(DataModel.mockData());
		
		Trader A = new Trader(1,"A","Đà Nẵng");
		Trader B = new Trader(2,"B","Huế");
		Trader C = new Trader(3,"C","Quảng Nam");
		Trader D = new Trader(4,"D","Đà Nẵng");
		
		trans.sort((trans1,trans2) -> {
			return trans1.getValue().compareTo(trans2.getValue());
		});
		generate("sort(value asc)", trans);
		
	}
	
	
	private static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + " --> {");
		collection.forEach(e -> System.out.println("  +" + e));
		System.out.println("}\n");
	}
}
