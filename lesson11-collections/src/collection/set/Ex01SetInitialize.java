package collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import utils.CollectionUtils;

public class Ex01SetInitialize {
	
	/**
	 * HashSet      : Cho phép null values, không đảm bảo thứ tự các phần tử đưa vào
	 * LinkedHashSet: Cho phép null values,       đảm bảo thứ tự các phần tử đưa vào
	 * TreeSet      : Không cho phép null , tự động sort tăng dần theo <T> 
	 *              : Yêu cầu T phải là con của Comparable<T>
                    
                    : Hỗ trợ null khi truyền Comparator<T> vào
	 *              : Nếu ko muốn tự động thì truyền Comparator<T> vào
	 * Set.of       : Tạo ra 1 immutable set với non null values             
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