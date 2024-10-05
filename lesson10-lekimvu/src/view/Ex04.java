package view;

import java.util.Arrays;

import functional.SortFunction;

public class Ex04 {

	public static void main(String[] args) {
//		String[] elements = {"-2","6","10",null,"4","8",null,"Special","a","c"};		
		String[] elements = {"-2","6","10","4","8"};		
		// null last, tăng dần 
//		sort(elements, (s1, s2) -> {
////           if(s1 == null ) {
////           return 1;  	
////            }
////           if(s2 != null) {
////                  return -1;        	   
////           }
//           // non-vallue 
//			if(s1.compareTo(s2) > 0) {
//				return 1;
//			}
//           return -1;
//           }); 
		sort(elements, (s1, s2) -> {
			if(s1.compareTo(s2) > 0) {
				return 1;
			}
			return -1;
		});
           System.out.println("tăng dần: " +Arrays.toString(elements));		
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
