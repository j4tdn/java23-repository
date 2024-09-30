package view;

import java.util.Arrays;

public class Ex03OperationsF {

	/*
	 * Mảng/Array: fixed-length --> Không thể thêm/xóa 1/n phần tử trong mảng -->
	 * Thực tế: Yêu cầu thêm/xóa mình vẫn phải xử lý --> : Kết quả trả về mảng mới
	 * 
	 * Collection: list, set, map
	 * 
	 * Stream
	 * 
	 * Yêu cầu: Cho mảng số nguyên gồm n phần tử {1,5,8,2,20} Viết chương trình/hàm
	 * 
	 * +Thêm phần tử bất kỳ vào vị trí thứ i trong mảng + Xóa phần tử tại vị trí thứ
	 * i trong mảng
	 * 
	 * Biết rằng i[0,n)
	 * 
	 * Khi thêm 1 phần tử thì duyệt từ phải sang trái Xóa phần tử thì ta duyệt từ
	 * trái sang phải
	 */

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 8, 2, 20 };
		int[] addedNumber = add(numbers, 3, 18);
		int[] removedNumber = remove(numbers, 3);

		System.out.println("-->" + Arrays.toString(numbers));
		System.out.println("add(3,18) -->" + Arrays.toString(addedNumber));
		System.out.println("remove(3) -->" + Arrays.toString(removedNumber));

	}

	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
//		B1 copy arrays source --> target
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i - 1];
		}
//		   B3: Assgin newValue to pos
		target[pos] = newValue;

		return target;
	}

	private static int[] remove(int[] source, int pos) {
		// B12 --> copy source qua target
		int[] target = Arrays.copyOfRange(source, 0, source.length);

//		B3: Shift left one unit from pos
		for (int i = pos; i < target.length - 1; i++) {
			target[i] = target[i + 1];
		}
		return Arrays.copyOfRange(target, 0, target.length - 1);
	}
}
