package sorting.quick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ex03SortingObjectComparator {
	
	public static void main(String[] args) {
		
		ArrayList<E>
		
		String[] elements = {null, "a123", null, "z45", "c1", "k6", null, "d28", null};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		// null last, asc
		Arrays.sort(elements, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			return s1.compareTo(s2);
		});
		
		System.out.println("\nsorted(null[last], asc) --> " + Arrays.toString(elements));
		
		// null first, desc
		Arrays.sort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		
		System.out.println("\nsorted(null[first], desc) --> " + Arrays.toString(elements));
		
	}
	
}
