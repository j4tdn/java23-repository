package collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import utils.CollectionUtils;

public class Ex01SetInititalize {

	/**
	 * HashSet: 	     cho phép null values, KO đảm bảo thứ tự các phần tử đưa vào
	 * LinkedHashSet:    cho phép null values,    đảm bảo thứ tự các phần tử đưa vào
	 * TreeSet:       KO cho phép null values, tự động sort tăng dần theo <T>
	 * 		  :       Yêu cầu T phải là con của Comparable<T>
	 *        
	 *        :       Hỗ trợ null khi truyền Comparator<T> vào
	 * 		  :       Nếu ko muốn tự động truyền comparator vào
	 * Set.of :       Tạo ra 1 immutable set với non null values
	 */
	public static void main(String[] args) {
		// Comaparator.nullLast(Comparator.naturalOrder())
		Set<String> elements = new TreeSet<>((s1, s2) -> {
			if(s1 == null)
				return -1;
			if(s2 == null)
				return 1;
			return s1.compareTo(s2);
		});
		
		elements.add("A124");
		elements.add("Z8");
		elements.add("B11");
		// elements.add(null); // ko cho phép trong TreeSet
		elements.add("A124");
		elements.add("X777");
		
		CollectionUtils.generate("1. Elements", elements);
		
		var numbers = Set.of(2, 3, 5, 10, 15);
		CollectionUtils.generate("2. Numbers", numbers);
	}
}
