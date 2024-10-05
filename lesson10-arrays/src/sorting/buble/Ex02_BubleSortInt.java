package sorting.buble;

import java.util.Arrays;

import functional.StringComparator;

public class Ex02_BubleSortInt {

	/*
	 * Sắp xếp danh sách 1 mảng đối tượng
	 + Xử lý trường hợp null values
	 ---> null first(đưa null lên phía trước mảng)
	 + Các pt null nằm về trước
	 + null < non null
	 
	 ---> null last (đưa null về đằng sau phía cuối)
	 + Các pt null nằm về sau
	 + null >  non null
	 
	 --> Xử lý các phần tử có giá trị(khác null)
	 --> Asc(tăng dần)
	 --> desc(Giamr dần)
	 */
	
	
	public static void main(String[] args) {
//		String[] elements = {"a123", "z45","c1","k6","d28"};
//	Ví dụ trường hợp mảng có phần tử Null thì ta k thể dùng hàm compare to để so sánh 
		String[] elements = {null, "a123",null,"12","z45",null,"123","c1",null,"k6","d28"};
		System.out.println("element: " +Arrays.toString(elements));
				
		bubleSort(elements, (s1, s2) -> {
		     //null values --> null first(đưa null lên đầu)
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
//			if() {
				
//			}
			// non-null values --> desc
			return s2.compareTo(s1);
		});
		
           System.out.println("elements(null first,desc" +Arrays.toString(elements));
           
         // a123  z45  null c1 null
        // null last desc( đưa null về đằng sau phía cuối)
       bubleSort(elements, (s1, s2) -> {
    	   if(s1 == null && s2 != null) {
				return 1;
			}
    	   // s1 null hay !null cũng giữ nguyên vì s2 = null đúng vị trí
			if(s2 == null) {
				return -1;
			}
			// non-null values --> desc
			return s2.compareTo(s1);
		});
              System.out.println("elements(null last,desc" +Arrays.toString(elements));
       
       }
	
	
           
           
		
		//		bubleSortAsc(elements);
//		System.out.println("tăng dần: "+Arrays.toString(elements));
	
		
//		//tăng dần
//		bubleSort(elements, (s1, s2) ->{
//			return s1.compareTo(s2);
//		}
//				);
//		System.out.println("tăng dần c2:" +Arrays.toString(elements));
	
	
	
	private static void bubleSort(String[] elements, StringComparator stringComparator) {
	            int length = elements.length;
	            for(int i =0; i<length; i++) {
	            	for(int j = 0; j < length - i -1;j++) {
	            		if(stringComparator.stagety(elements[j],elements[j+1])> 0) {
	            				String temp = elements[j];
	            				elements[j] = elements[j+1];
	            				elements[j+1] = temp;
	            		}
	            	}
	            }
	}
	
	private static void bubleSortAsc(String[] elements) {
	            int length = elements.length;
	            for(int i =0; i<length; i++) {
	            	for(int j = 0; j < length - i -1;j++) {
	            		if(elements[j].compareTo(elements[j+1]) > 0) {
	            				String temp = elements[j];
	            				elements[j] = elements[j+1];
	            				elements[j+1] = temp;
	            		}
	            	}
	            }
	}
}
