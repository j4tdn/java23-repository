package test03;

import java.util.Arrays;

public class Ex04UniqueNumbers {
	
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 15, 17, 21};
		System.out.println(
				"Unique elements of 'a' Array --> " 
						+ Arrays.toString(unique(a)));
	}
	
	private static int[] unique(int[] source) {
		// flag để biết được phần tử tại vị trí thứ i trong source đã trùng chưa
		// trước khi đi kiểm tra nó là unique thì phải check flag đang là false
		// nếu là true chứng tỏ trước đó đã đánh dấu bị trùng rồi
		boolean[] flags = new boolean[source.length];
		int[] target = new int[source.length];
		int count = 0;
		// Với mỗi phần tử tại vị trí thứ i, lấy giá trị của phần tử
		// đi so sánh với các phần tử còn lại trong mảng(ngoại trừ chính nó !i hiện tại)
		// Nếu mà xuất hiện phần tử trùng --> ko lấy
		// Ngược lại --> lấy
		for (int i = 0; i < source.length; i++) {
			if (!flags[i] && isUnique(i, source, flags)) {
				target[count++] = source[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isUnique(int i, int[] source, boolean[] flags) {
		System.out.printf("checking element at %d, value = %d\n", i, source[i]);
		int amountOfDupElems = 0;
		for (int j = 0; j < source.length; j++) {
			if (i != j && !flags[j] && source[i] == source[j]) {
				flags[j] = true;
				amountOfDupElems++;
			}
		}
		if (amountOfDupElems > 0) {
			flags[i] = true;
			return false;
		}
		return true;
	}
	
}