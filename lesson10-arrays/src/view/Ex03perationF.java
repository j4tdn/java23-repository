package view;

import java.util.Arrays;

public class Ex03perationF {
		
	/*
	  Mảng : fixed-length 
	  --> Không thể thêm/xóa 1 phần tử trong mảng
	  --> Thực tế: yêu cầu thêm/xóa mình vẫn phải xử lý 
	  			 : Kết quả trả về mảng mới 
	  			 
	  			 Colloection: list, set , map
	  			 
	  Yêu cầu: 
	  Cho mảng số nguyên gồm n phần tử {1,5,8,2,20}
	  Viết chương trình 
	  +Thêm phần tử bất kì vào vị trí thứ i trong mảng
	  +Xóa phần tử tại vị trí thứ i trong mảng
	  Biết rằng i[0,n)
	  			 
	 */
	public static void main(String[] args) {
		
		int [] number =  {1,5,8,2,20};
		
		int [] addedNumber = add(number,3,18);
		System.out.println("add(source,3,18) " + Arrays.toString(addedNumber));
		int [] removeNumber = remove(number, 2);
		System.out.println("remove(number, 2) " + Arrays.toString(removeNumber));
	}
	private static int[] add(int [] source, int pos, int newValue) {
		int [] target = new int [source.length + 1];
		// b1 : duyêtj các phần tử của source qua target
		for(int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		for(int i = target.length - 1; i > pos; i--) {
			target[i] = target[i -1];
		}
		target[pos] = newValue;
		return target;
	}
	private static int [] remove(int [] source, int pos) {
		int [] target = Arrays.copyOfRange(source,0, source.length);
		for(int i = pos; i < target.length - 1; i++) {
			target[i] = target[i + 1];
		}
		return Arrays.copyOfRange(target, 0, target.length - 1);
	}
}
