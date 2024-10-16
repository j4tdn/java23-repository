package view;

import java.util.Arrays;

import functional.StringComparator;

public class Ex04 {
	public static void main(String[] args) {
		String[] elements = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
	
System.out.println("elements: " + Arrays.toString(elements));
		
		System.out.println("\n====================\n");
		
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null first
			if (s1 == null) {
				return 1;
			}
			// s1 != null
			if (s2 == null) {
				return -1;
			}
			if(s1.equals("Special")) {
				return -1;
			}
			if(s2.equals("Special")){
				return 1;
			}
			if(isNumber(s1) &&  isNumber(s2)) {
				return Integer.compare(Integer.parseInt(s2),Integer.parseInt(s1));
			}// non-null values --> asc
			return s1.compareTo(s2);
		});
		System.out.println("elements(null last, asc): " + Arrays.toString(elements));
		
	
		
		// null last, desc
		bubbleSort(elements, (s1, s2) -> {
			// null values --> null last
			if (s1 == null && s2 != null) {
				return -1;
			}
			
			if (s2 == null) {
				// s1 null hay !null cũng giữa nguyên vì s2 = null(đúng vị trí)
				return 1;
			}
			if(s1.equals("Special")) {
				return 1;
			}
			if(s2.equals("Special")) {
				return -1;
			}
			if(isNumber(s1) &&  isNumber(s2)) {
				return Integer.compare(Integer.parseInt(s2),Integer.parseInt(s1));
			}
			// non-null values --> desc
			return s2.compareTo(s1);
		});
		System.out.println("elements(null first, desc): " + Arrays.toString(elements));
		
	}
	private static boolean isNumber(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	private static void bubbleSort(String[] elements, StringComparator stringComp) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				// Hoán vị strategy(s1, s2) > 0
				if (stringComp.strategy(elements[j], elements[j+1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		
	}

	
}

