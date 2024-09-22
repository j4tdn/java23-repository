package view;

import java.util.Arrays;

public class Ex03OperationsF {

	/* 
	Array: fixed-length
	--> không thể thêm/xóa 1/n phần tử trong mảng
	--> Thực tế: yêu cầu thêm/xóa mình vẫn phải xử lý
	--> 	   : kết quả trả về mảng mới
	
	Collection: list, set, map
	
	Stream
	
	Yêu cẩu:
	Cho mảng số nguyên gồm n phần tử {1, 5, 8, 2, 20}
	
	Viết chương trình/hàm:
	
	+ Thêm phần tử bất kỳ vào vị trí thứ i trong mảng
	+ Xóa phần tử tại vị trí thứ i trong mảng
	
	Biết răng i[0, n)
	*/
	
	public static void main(String[] args) {
	
		int[] number = {1, 9, 5, 36, 12, 33};
		int[] addedNumber = add(number, 3, 18);
		
		System.out.println("add(number, 3, 18): " + Arrays.toString(addedNumber));
		
		int[] removedNumber = remove(number, 2);
		System.out.println("remove(number, 2): " + Arrays.toString(removedNumber));
	}
	
	private static int[] add(int[] source, int pos, int newValue) {
		
		int[] target = new int[source.length + 1];
		
		// B1: copy source to target
		for(int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		// B2: shift right 1 unit from addedPos
		for(int i = target.length - 1; i > pos; i--) {
			target[i] = target[i -1];
		}
		
		// B3: Assign newValure to pos
		target[pos] = newValue;
		
//		for(int i = 0; i < pos; i++) {
//			target[i] = source[i];
//		}
//		
//		target[pos] = newValue;
//		
//		for(int i = pos; i < source.length; i++) {
//			target[i + 1] = source[i];
//		}
		return target;
		
	}
	
	private static int[] remove(int[] source, int pos) {
		// B1, 2: copy
		int[] target = Arrays.copyOfRange(source, 0, source.length);
		
		// B3: shift left 1 unit from pos
		for(int i = pos; i < target.length - 1; i++) {
			target[i] = source[i + 1];
		}
		
//		int[] target = new int[source.length - 1];
//		
//		for(int i = 0; i < pos; i++) {
//			target[i] = source[i];
//		}
//		
//		for(int i = pos; i < target.length; i++) {
//			target[i] = source[i + 1];
//		}
//		
		// B4
		return Arrays.copyOfRange(target, 0, target.length -1);
	}
	
}
