package sorting.selection;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex02SortingObjectComparable {

	public static void main(String[] args) {
		// String[] elements = {null, "a123", null, null, "z45", "c1", null, "k5", "d28", null};
		String[] elements = {"a123", "z45", "c1", "k5", "d28"};
		
		System.out.println("origin: " + Arrays.toString(elements));
		System.out.println("\n=============================================\n");
		
		Arrays.sort(elements);
		// dùng reverse để sắp xếp giảm dần
		
		System.out.println("\nsorted(asc): " + Arrays.toString(elements));
		System.out.println("\n=================KDL custom==================\n");
		// Item chưa implements Comparable, lỗi Exception lúc runtime
		// Vì cần gọi Comparable#compareTo để biết asc/desc
		Item[] items = DataModel.mockItems();
		
		// class bean.Item cannot be cast to class java.lang.Comparable
		Arrays.sort(items);
		
		// Yêu cầu 1: tăng dần theo salesPrice
		printf("sorted (salesPrice (asc))", items);
		
		// Yêu cầu 2: giảm dần theo exprireDate
		printf("sorted (salesPrice (asc))", items);
		
	}
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for(Item item : items) {
			System.out.println("    + " + item);
		}
		System.out.println("}\n");
	}
	
}
