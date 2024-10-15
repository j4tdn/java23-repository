package sorting.quick;

import java.util.Arrays;

public class Ex04SortingObjectComparator {
	public static void main(String[] args) {
		String[] elements = { "a123", "z44", "c1", "k6", "d28" };

		System.out.println("origin: " + Arrays.toString(elements));

		// null lasst, assc
		Arrays.sort(elements, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return 1;
			}
			if (s2 == null) {
				return -1;
			}
			return s1.compareTo(s2);
		});

		System.out.println("sort: " + Arrays.toString(elements));
	}
}
