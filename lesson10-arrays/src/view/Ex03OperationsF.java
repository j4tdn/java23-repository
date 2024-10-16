package view;

import java.util.Arrays;

public class Ex03OperationsF {
	/*
	 Mảng: fixed - length
	 --> Không thể thêm/ xoá 1/n phần tử trong mảng
	 --> Thực tế: yêu cầu thêm/ xoá mình vẫn phải xử lý
	            : kết quả trả về mảng mới
	            
	 Colection: list, sep, map
	 
	 Stream 
	 
	 Yêu cầu: Cho mảng số nguyên gồm n phần tử { 1, 8, 2, 3, 9}
              Viết chương trình bằng ngôn ngữ Java Array
              + Thêm phần tử bất ký vào vị trí thứ i trong mảng 
              + Xoá phần tử tại vị trí thứ i trong mảng 
              
              Biết rằng i[0,n)
              
	 
	 */

	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		
		int[] addedNumbers = add(numbers, 3, 18);
		
		
		
	}
	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length+1];
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
        for (int i = target.length-1; i > pos; i--) {
		    target[i] = target[i - 1];	
		}
        
        //B3. Assign
        target[pos] = newValue;
		return target;
	}
	
	private static int[] remove(int[] source, int pos) {
		//B12 --> copy
		
		int[] target = Arrays.copyOfRange(source, 0, source.length);
		
		// B3 --> shift left one unit from pos
		for (int i = pos; i < target.length-1; i++) {
			target[i] = target[i+1];
		}
		
		return Arrays.copyOfRange(target, 0, target.length-1);
	}

}
