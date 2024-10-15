package sorting.insertion;

import java.util.Arrays;

import functional.StringComparator;

public class Ex01InsertionSortString {

	/*
	 Du la thuat toan sap xep gi chi can strategy co tham so truyen vao
	 la 2 phan tu truoc, sau trong mang
	 --> Ap dung cong thuc(null first/last --> asc/desc) chung cho moi thuat toan
	 
	 --> Ap dung tuong tu voi thuat toan trong JAVA
	 */
	public static void main(String[] cc) {
		String[] elements = {null, "a123", "z45", null, "c1", "k6", "d28", null};
		
		System.out.println("origin --> " + Arrays.toString(elements));
		
		insertionSort(elements, (s1, s2) -> {
			if(s1 == null)
				return -1;
			if(s2 == null)
				return 1;
			
			return s1.compareTo(s2);
		});
		
		System.out.println("\nsorted(asc, null first) --> " + Arrays.toString(elements));
	}
	
	private static void insertionSort(String[] elements, StringComparator stringComp) {
		for(int i = 1; i < elements.length; i++)
			for(int j = 0; j < i; j++)
				if(stringComp.strategy(elements[j], elements[i]) > 0) {
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
	}
	
	private static void sort(String[] elements) {
		for(int i = 1; i < elements.length; i++)
			for(int j = 0; j < i; j++)
				if(elements[j].compareTo(elements[i]) > 0) {
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
	}
}
