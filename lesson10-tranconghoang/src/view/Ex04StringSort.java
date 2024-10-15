package view;

import java.util.Arrays;

import functional.StringComparator;

public class Ex04StringSort {
    
	public static void main(String[] args) {
        String[] str = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
        
        insertionSort(str, (s1, s2) -> {
			if (s1 == null) 
				return 1;
			
			if (s2 == null) 
				return -1;
			
			if(s1 == "Special")
				return -1;
			
			if(s2 == "Special")
				return 1;
			
			if(isNumber(s1) && isNumber(s2))
				return Integer.parseInt(s1) - Integer.parseInt(s2);
			
			return s1.compareTo(s2);
		});
		
		System.out.println("\nTăng dần --> " + Arrays.toString(str));
		System.out.print("\nGiảm dần --> [");
		for(int i = str.length - 1; i >= 0; i--) {
			if(i == 0) {
				System.out.print(str[i] + "]");
				break;
			}
			System.out.print(str[i] + ", ");
		}
    }
    
	private static boolean isNumber(String str) {
		return str.matches("-?\\d+");
	}
	
	private static void insertionSort(String[] elements, StringComparator stringComp) {
		for (int i = 1; i < elements.length; i++) 
			for (int j = 0; j < i; j++) 
				if (stringComp.strategy(elements[j], elements[i]) > 0) {
					String temp = elements[j];
					elements[j] = elements[i];
					elements[i] = temp;
				}
	}
}
