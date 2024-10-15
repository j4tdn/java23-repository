package view;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

public class Ex03OperationsF {
	
	/*
	 	Array : fixed - length 
	 	--> không thể thêm/ xoá 1/n phần tử trong mảng
	 	--> Thực tế : yêu cầu thêm/ xoá mình vẫn phải xử lý
	 	--> 		: kết quả trả về mảng mới
	 	
	 	Collection: list, set, map
	 	
	 	Stream
	 	
	 	Yêu cầu
	 	Cho mảng số nguyên gồm n phần tử {1, 5, 8, 2 , 20}
	 	Viết chương trình
	 	+ Thêm phần tử bất kỳ vào vị trí thứ i trong mảng
	 	+ Xoá phần tử tại vị trí thứ i trong mảng
	 	
	 	Biết rằng i[0, n)
	 */
	public static void main(String[] args) {
		
		int[] numbers = {1, 9, 5, 36, 12, 33};
		System.out.println("before add (source, 3, 18) --> " + Arrays.toString(numbers));

		int[] addedNumbers = add(numbers, 3, 18);
		
		System.out.println("add (source, 3, 18) --> " + Arrays.toString(addedNumbers));
		System.out.println("remove (source, 3) --> " + Arrays.toString(remove(addedNumbers, 3)));

	}
	
	private static int[] add(int[] source, int pos, int newValue) {
		int [] target = new int[source.length + 1];
		
		//B1 copy source -> target
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		//B2 shift right 1 unit from source
		// dịch phải -> duyệt từ phải sang trái
		// dịch trái -> duyệt từ trái sang phải
		for (int i = target.length -1 ; i > pos; i--) {
			target[i] = target[i-1];
		}
		
		target[pos] = newValue;
		return target;
	}
	
	private static int[] remove(int[] source, int pos) {
		// B12 -> copy
		int[] target = Arrays.copyOfRange(source, 0, source.length);
		
		//B3 shift left one unit from pos
		for (int i = pos; i< target.length-1; i++) {
			target[i] = target[i+1];
		}
		
		return Arrays.copyOfRange(target, 0, target.length-1);
	}
}
 