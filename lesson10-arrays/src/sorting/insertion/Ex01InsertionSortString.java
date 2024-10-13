package sorting.insertion;

import java.util.Arrays;

import functional.IntComparator;
import functional.StringComparator;

public class Ex01InsertionSortString {
	
	/*
	 Dù là thuật toán sắp xếp gì thì chỉ cần strategy có tham số truyền vào
	 là 2 phần tử trước, sau trong mảng
	 --> Áp dụng công thức(null first/last --> asc/desc) chung cho mọi thuật toán
	 
	 --> Áp dụng tương tự với thuật toán sắp xếp có sẵn trong Java
	 */

	public static void main(String[] args) {

		String[] elements = { null, "a123", null, null, "z45", "c1", null, "k6", "d28", null };

		System.out.println("origin --> " + Arrays.toString(elements));

//		sortAsc(elements);
//		System.out.println("\nsorted Asc --> " + Arrays.toString(elements));

		// giảm dần
		insertionSort(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return -1; // - 10 cũng được, miễn không lớn hơn 0
			}

			// s1 != null
			if (s2 == null) {
				return 1;
			}

			// non-null values --> asc
			// Cách 1:
//						if (s1.compareTo(s2) > 0) {
//							return 1;
//						}
//						return 2

			// Cách 2:
			return s1.compareTo(s2);
		});
		
		System.out.println("\nsorted Asc --> " + Arrays.toString(elements));
	}

	private static void insertionSort(String[] elements, StringComparator stringComp) {
		for (int i = 1; i < elements.length; i++) {
			for (int j = 0; j < i; j++) {
				if (stringComp.strategy(elements[j], elements[i]) > 0) {
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}

	}

}
