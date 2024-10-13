package sorting.quick;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex02SortigObjectComparable {

	public static void main(String[] args) {
		String[] elements = {"a123", "z45", "c1", "k6", "d28"};
		
		System.out.println("origin: " + Arrays.toString(elements));
		
		Arrays.sort(elements);
		// dùng reverse để sắp xếp giảm dần
		// dùng cách khác sau
		
		System.out.println("\nsorted(asc): " + Arrays.toString(elements));
		
		System.out.println("=================KDL custom==================");
		
		// Item chưa implement Comparable, lỗi Exception lúc runtime
		// Vì cần gọi Comparable#compareTo để biết asc/desc
		Item[] items = DataModel.mockItems();
		
		// class bean.Item cannot be cast to class java.lang.Comparable
		Arrays.sort(items);
		
		// Yêu cầu 1: tăng dần theo salesPrice
		printf("sorted(salesPrice(asc))", items);
		
		// Yêu cầu 2: giảm dần theo expiredDate
		printf("sorted(expiredDate(desc))", items);
	}
	
	private static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> {");
		for (Item item: items) {
			System.out.println("    + " + item);
		}
		System.out.println("}\n");
	}

}
