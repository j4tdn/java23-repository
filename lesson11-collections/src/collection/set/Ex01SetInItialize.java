package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import utils.CollectionUtils;

public class Ex01SetInItialize {
	
	public static void main (String[] args) {
		Set<String> elements = new TreeSet<> ((s1,s2) -> {
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
		elements.add(null);
		elements.add("B11");
		elements.add("X777");
		
		CollectionUtils.generate("1. elements", elements);
		
		var numbers = Set.of(2,3,5,10,15);
		
		CollectionUtils.generate("2. numbers", numbers);
	}
		
}
