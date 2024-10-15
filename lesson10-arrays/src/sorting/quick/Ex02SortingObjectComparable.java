package sorting.quick;

import java.util.Arrays;

import model.DataModel;

public class Ex02SortingObjectComparable {

	public static void main(String[] args) {
		String[] elements = {"a123", "z45", "c1", "k6", "d28"};
		
		System.out.println("origin: " + Arrays.toString(elements));
		
		Arrays.sort(elements);
		// dùng reverse để sắp xếp giảm dần
		// dùng cách khác sau
		
		System.out.println("\nsorted(asc): " + Arrays.toString(elements));
		
		System.out.println("=======================KDL custom=====================");
		
		Item[] items = DataModel.mockItems();
		
		Arrays.sort(items);
		
		printf("sorted(...)", items);
	}
	
}
