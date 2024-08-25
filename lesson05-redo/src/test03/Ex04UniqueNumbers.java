package test03;

import java.util.Arrays;

import bean.Tuple;

public class Ex04UniqueNumbers {

	
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 15, 17, 21};
		
		System.out.println("Unique elements of 'a' Array --> " + Arrays.toString(unique(a)));
		
	}
	private static int[] unique(int[] source) {
		// flag để biết được phần tử tại vị trí thứ i trong source đã trùng chưa
		// trước khi đi kiểm tra nó là unique thì phải check flags đang là false
		// nếu là true -> chứng tỏ trước đó đã đánh dấu bị trùng rồi 
		boolean[] flags = new boolean[source.length];
//		System.out.println("flags[0 --> " + flags[0]);
		int[] target = new int[source.length] ;
		int count = 0;
		// Với mỗi phần thử tại vị trí thứ i, lấy
		// giá trị của phần tử đi so sánh với các phần
		// tử cỏn lại trong mảng ngoại trừ chính nó( !i hien tai)
		// Nếu xuất hiện phần tử trùng -> không lấy
		// Ngược lại --> lấy
		for(int i = 0; i < source.length; i++) {			
			if (!flags[i] &&isUnique(i, source, flags)) {
				target[count++] = source[i];
			} 
			
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	private static boolean isUnique(int i, int[] source, boolean[] flags) {
		System.out.printf("Checking element at %d, value = %d \n", i, source[i]);
		int amountOfDupElems = 0;
		for (int j = 0; j < source.length; j++) {
			if ( i!= j &&  !flags[j] &&source[i] == source[j]) {
				flags[j] = true;
//				return false;   // không return về để vòng for duyệt hết mảng 
				amountOfDupElems++;
			}
		}
		if (amountOfDupElems > 0) {
			flags[i] = true;
			return false;
		}
		return amountOfDupElems == 0;
//		return true;
	}
	
	
}
