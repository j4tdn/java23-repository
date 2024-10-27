package collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import utils.CollectionUtils;

	/*
	  Hash set: cho phép null values, khoogn đảm bảo thứ tựi các phần tử đưa vào
	 */

public static void main(String[] args) {
	// Comparator.nullsLast(Comparator.naturalOrder())
	Set<String> elements = new TreeSet<>((s1, s2) -> {
		if (s1 == null) {
			return -1;
		}
		if (s2 == null) {
			return 1;
		}
		return s1.compareTo(s2);
	});
	elements.add("A124");
	elements.add("Z8");
	elements.add(null); // không cho phép trong TreeSet
	elements.add("B11");
	elements.add("A124");
	elements.add("X777");
	
	CollectionUtils.generate("1. Elements", elements);
	
	var numbers = Set.of(2, 3, 5, 10, 15);
	
	CollectionUtils.generate("2. Numbers", numbers);
	
}

}