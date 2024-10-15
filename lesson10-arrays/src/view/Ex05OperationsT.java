package view;

import java.util.Arrays;

public class Ex05OperationsT {
	/*
	 * Cho danh sach mang so nguyen gom n phan tu
	 * Viet chuong trinh
	 * + Tim cac phan tu chan trong mang
	 * + Tim cac phan tu la boi cua 5
	 * + Tim cac phan tu la so nguyen to
	 */
	public static void main(String[] args) {
		int [] numbers = {0, 20, 50, 12, 28, 66, 77, 13, 29};
		
		System.out.println("so chan ==> " + Arrays.toString(getEvenNumbers(numbers)));
	}
	
	private static int [] getEvenNumbers (int[] source) {
		int [] target = new int [source.length];
		int count = 0;
		for (int number: source) {
			if (number % 2 == 0) {
				target[count++] = number;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
}
