package collection.set;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import ultisl.CollectionUtils;

public class Ex01SetInitialize {
	public static void main(String[] args) {
		/**
		  HashSet      :  CHo phép null values, không đảm bảo thứ tự các phần tử đưa vào
		  
		  LinkedHashSet:  CHo phép null values,       đảm bảo thứ tự các phần tử đưa vào
		  
		  TreeSet      : Không cho phép null  , tự động sort tăng dần theo <T>
		               : Yêu cầu T phải là con của Comparabale<T>
		               : Hỗ trợ null khi truyền comparator<T> vào
		               : Nếu không muốn tự đọng thì truyền comparable vào 
		               
		  Set.of       : Tạo ra 1 immutable     
		 */
		Set<String> elements = new TreeSet<>((s1,s2) -> {
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		});
		elements.add("A123");
		elements.add("Z8");
		elements.add("A123");
		elements.add("B11");
		elements.add("A123");
		elements.add("X777");
		elements.add(null);
		CollectionUtils.generate("1. Element ", elements);
		
		var numbers = Set.of(2,3,4,10,15);
		CollectionUtils.generate("2. Number ", numbers);
		
	}
}
