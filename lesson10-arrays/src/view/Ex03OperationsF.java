package view;

import java.util.Arrays;

public class Ex03OperationsF {

	/*
	Mang: fixed-length
	--> Khong the them/xoa 1/n phan tu trong mang
	--> Thuc te: yeu cau them/xoa minh can phai xu ly
	-->		   : ket qua tra ve mang moi
	
	Collection: list, set, map
	
	Stream
	
	Yeu cau
	Cho mang so nguyen gom n phan tu {1, 5, 8, 2, 20}
	Viet chuong trinh
	+ Them phan tu bat ky vao vi tri thu i trong mang
	+ Xoa phan tu tai vi tri thu i trong mang
	
	Biet rang i[0, n)
	 */
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 5, 8, 2, 20};
		int[] addedNumbers = add(numbers, 3, 18);
		int[] removedNumbers = remove(numbers, 2);
		
		System.out.println("add(source, 3, 18) --> " + Arrays.toString(addedNumbers));
		
		System.out.println("remove(source, 2) --> " + Arrays.toString(removedNumbers));
	}
	
	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
		
		// B1: copy source -> target
		for(int i = 0; i < source.length; i++)
			target[i] = source[i];
		
		// B2: shift right 1 unit from addedPos
		for(int i = target.length - 1; i > pos; i--)
			target[i] = target[i - 1];
		
		// B3: Assign newValue to pos
		target[pos] = newValue;
		return target;
	}

	private static int[] remove(int[] source, int pos) {
		// B12: copy
		int[] target = Arrays.copyOfRange(source, 0, source.length);
		
		// B3: shift left one unit from pos
		for(int i = pos; i < source.length - 1; i++)
			target[i] = target[i + 1];
		return Arrays.copyOfRange(target, 0, target.length - 1);
	}
}
