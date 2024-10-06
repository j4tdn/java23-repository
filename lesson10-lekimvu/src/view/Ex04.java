package view;

import java.util.Arrays;

import functional.SortFunction;

public class Ex04 {

	public static void main(String[] args) {
		String[] elements = {"-2","6","10",null,"4","8",null,"Special","a","c","b","xx"};		
		// giảm dần
		sort(elements, (s1, s2) -> {
           if(s1 == null ) {
           return -1;  	
            }
           if(s2 == null) {
                  return 1;        	   
          }
           if(isNumber(s1) && isNumber(s2)) {
        	   return s2.compareTo(s1);
           }
           if(s2 == "Special") {
        	   return -1;
           }
           // non-vallue 
           return s2.compareTo(s1) ;
           }); 

           System.out.println("giảm dần: " +Arrays.toString(elements));		
	}
	
	private static boolean isNumber(String element) {
		return element.matches("-?\\d+");
	}
	
	private static void sort(String[] elements, SortFunction sortFunction) {
           int length = elements.length;
		for(int i = 0; i < length;i++) {
			for(int j = 0; j < length - i -1; j++) {
				if(sortFunction.Stategy(elements[j], elements[j+1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	
}
