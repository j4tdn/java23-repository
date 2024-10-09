package sorting.insertion;

import java.util.Arrays;

import functional.StringComparator;

public class Ex01InsertionSortString {

	/*
	 Dù là thuật toán sắp xếp gì chỉ cần strategy có tham số truyền vào
	 là 2 phần tử trước, sau trong mảng
	 --> Áp dụng công thức (null first/last --> asc/desc) chung cho mọi thuật toán
	 
	 --> Áp dụng tương tự với thuật toán sắp xếp có sẵn trong Java
	 */
	
	
	public static void main(String[] args) {
		
		String[] elements = {null, "a123", null , null , "z45", "c1", "k6", "d28"};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		insertionSort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		});
		
		System.out.println("\nsorted(asc) " + Arrays.toString(elements));
	}
	
	private static void insertionSort(String[] elements, StringComparator stringComp) {
		for (int i = 0 ; i < elements.length; i ++) {
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