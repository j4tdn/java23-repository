package sorting.bubble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02_BubbleSortString {
	public static void main(String[] args) {
		/*
		 Khi sắp xếp mảng đối tượng 
		 - 1.Xử lí trường hợp null values
		  --> null first
		  *Các phần tử null nằm về trước 
		  *null < non null
		  --> null last
		  *Các phần tử null nằm về sau
		  *null > non null
		 - 2.Xử lý các phần tử có giá trị khác null
		  --> asc(tăng dần)
		  --> desc(giảm dần)
		 */
		String [] elements = {"a123" , "z45", null,"c1", "k5",null, "d28", null};
		
		System.out.println("elemets: " + Arrays.toString(elements));
		bubbleSort(elements, (s1,s2) -> {
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		});
		System.out.println("elemets(asc) null first: " + Arrays.toString(elements));
		System.out.println("\n================\n");
		bubbleSort(elements, (s1,s2) -> {
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			return s2.compareTo(s1);
		});
		System.out.println("elemets(desc) null first: " + Arrays.toString(elements));
		System.out.println("\n================\n");
		bubbleSort(elements, (s1,s2) -> {
			if(s1 == null && s2 != null ) {
				return 1;
			}
			if(s2 == null) {
				return -1;
			}
			return s2.compareTo(s1);
		});
		System.out.println("elemets(desc) null last: " + Arrays.toString(elements));
	}
	
	private static void bubbleSort(String[] elements, StringComparator stringComp) {
		int length = elements.length;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length - i - 1; j++ ) {
				if(stringComp.strategy(elements[j], elements[j + 1]) > 0) {
					String temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}
	
}
