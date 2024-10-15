package sorting.quick;

import java.util.Arrays;

public class Ex03SortingObjectComparator {

	public static void main(String[] args) {
		String[] elements = { null, "a123",null, null, "z45", "c1",null,   "k6",null,  "d28"};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		Arrays.sort(elements, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			return s1.compareTo(s2);
		});
		
		System.out.println("sorted(null[last], asc) => " + Arrays.toString(elements));
	
		Arrays.sort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		
		System.out.println("sorted(null[first], desc) => " + Arrays.toString(elements));

	}
	
}
