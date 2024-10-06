package sorting.selection;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;

public class Ex03SortingObjectCompartor {

	public static void main(String[] args) {
		String[] elements = {null, "a123", null, null, "z45", "c1", null, "k5", "d28", null};

		System.out.println("origin: " + Arrays.toString(elements));
		
		Arrays.sort(elements, (s1, s2) -> {
			if(s1 == null && s2 != null) {
				return 1;
			}
			if(s2 == null) {
				return -1;
			}
			return s1.compareTo(s2);
		});
		
		System.out.println("\nsorted(null[last], asc): " + Arrays.toString(elements));
		
		Arrays.sort(elements, (s1, s2) -> {
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		
		System.out.println("\nsorted(null[first], desc): " + Arrays.toString(elements));
		
	}
	
}
