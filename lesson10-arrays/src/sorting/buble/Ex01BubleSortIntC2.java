package sorting.buble;

import java.util.Arrays;

import functional.IntComparator;

public class Ex01BubleSortIntC2 {
	public static void main(String[] args) {
		int[] elements = {1 , 5, 9, 4 , 6, 11};
		
		
		bubleSort(elements, (n1, n2) -> {
//			if( n1 > n2) {
//				return 1; // số dương
//			}
//			return 0;
			return n1 - n2;
		});
		System.out.println("\nTăng dần: " +Arrays.toString(elements));	
		
		bubleSort(elements, (n1, n2) -> {
//			if( n1 > n2) {
//				return 1; // số dương
//			}
//			return 0;
			return n2 - n1;
		});
		System.out.println("\nGiam dần: " +Arrays.toString(elements));
			
	}
	
	private static void bubleSort(int[] elements, IntComparator intComparator ) {
		for(int i = 0; i < elements.length; i++) { // số round
			// tìm phần tử lớn nhất trong mỗi round
			for(int j = 0; j < elements.length - i - 1; j++) {
				//Muốn hóa vị thì kết quả của Strategy(T,S) phải lớn 0
	              if(intComparator.strategy(elements[j], elements[j+1]) > 0) {
	            	  int temp = elements[j];
						elements[j] = elements[j +1 ];
						elements[j + 1] = temp;
	              }
			
			}
		}
	}
	
	private static void bubleSortAsc(int[] elements) {
		// duyệt từng round
		for(int i = 0; i < elements.length; i++) { // số round
			// tìm phần tử lớn nhất trong mỗi round
			for(int j = 0; j < elements.length - i - 1; j++) {
				// 1 2 3 4 5 
				// sắp xếp tăng dần
				// Nếu trước lớn hơn sau chưa đúng vị trí --> hoán vị để sau lớn hơn trước
				if(elements[j] > elements[j+1]) {
					int temp = elements[j];
					elements[j] = elements[j +1 ];
					elements[j + 1] = temp;
				}
			}
		}
	}
	
	private static void bubleSortDesc(int[] elements) {
		// duyệt từng round
		for(int i = 0; i < elements.length; i++) { // số round
			// tìm phần tử lớn nhất trong mỗi round
			for(int j = 0; j < elements.length - i - 1; j++) {
				// 1 2 3 4 5 
				// sắp xếp giảm dần
				// Nếu trước nhỏ hơn sau chưa đúng vị trí --> hoán vị để sau lớn hơn trước
				if(elements[j] < elements[j+1]) {
					int temp = elements[j];
					elements[j] = elements[j +1 ];
					elements[j + 1] = temp;
				}
			}
		}
	}
}


