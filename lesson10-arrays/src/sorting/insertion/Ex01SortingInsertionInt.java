package sorting.insertion;

import java.util.Arrays;

import functional.StringComparator;

public class Ex01SortingInsertionInt {

	// duyệt round i = 1 và j = 0 tới j < tổng các phần tử 
	public static void main(String[] args) {
		String[] elements = {null,"a123",null,null,"z45","c1",null,"k6"};		
//		String[] elements = {"a123","z45","c1","k6"};		
	 
//		sort(elements);
//		System.out.println("sort(Giam dan): " +Arrays.toString(elements));
	// null first vallue
		sort(elements, (s1, s2) ->{
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		
	System.out.println("sort(Giam dan)null first: " +Arrays.toString(elements));
	
	    // null last 
	sort(elements, (s1, s2) ->{
		if(s1 == null) {
			return 1;
		}
		if(s2 == null) {
			return -1;
		}
		return s2.compareTo(s1);
	});
	System.out.println("sort(Giam dan)null last: " +Arrays.toString(elements));

	}
	
	
	private static void sort(String[] elements,StringComparator stringComparator) {
		for(int i =	1; i < elements.length; i++) {
			for(int j = 0; j < elements.length; j++) {
				if(stringComparator.stagety(elements[j],elements[i]) > 0) {
					String temp = 	elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
			}
		}
		
		
	}
}
