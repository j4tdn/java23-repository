package sorting.buble;

import java.util.Arrays;

import functional.Sort;

public class Ex01BubleSortInt {

	public static void main(String[] args) {
		int[] elements = {1 , 5, 9, 4 , 6, 11};
		
//		Sort srt = (a,b) -> a > b;
		
		bubleSort(elements, (a,b) -> a > b);
		
		
		
		
		// tăng dần
//		bubleSortAsc(elements);
//		System.out.println("/nElements(ASC)tăng dần --> " +Arrays.toString(elements));
//		
//		// giảm dần
//		bubleSortDesc(elements);
//		System.out.println("/nElements(giảm dần) -->" +Arrays.toString(elements));
//		
	}
	
	private static void bubleSort(int[] elements, Sort sort ) {
		for(int i = 0; i < elements.length; i++) { // số round
			// tìm phần tử lớn nhất trong mỗi round
			for(int j = 0; j < elements.length - i - 1; j++) {
	              if(sort.stragety(i, j)) {
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
