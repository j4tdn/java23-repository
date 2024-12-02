package ex_150_java;

import java.util.Arrays;

public class ex07 {
	// Cách 1 dùng arrays
//	public static void main(String[] args) {
//		int a[] = {1, 2, 5, 6, 3, 2};
//        int b[] = {44, 66, 99, 77, 33, 22, 55};
//        System.out.println("Số nhỏ thứ 2 trong mảng a là "+getSecondSmallest(a,a.length));
//        System.out.println("Số nhỏ thứ 2 trong mảng a là "+getSecondSmallest(b,b.length));
//        
//        
//	}
//	public static int getSecondSmallest(int[] a,int total) {
//		Arrays.sort(a);
//		return a[1];
//	}
	// Không sử dụng hàm có sẵn
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77,22,33 };
		System.out.println("Số nhỏ thứ 2 của Mảng a: " + getSecondSmallest(a, a.length));
		System.out.println("Số nhỏ thứ 2 của Mảng b: " + getSecondSmallest(b, b.length));
	}

	public static int getSecondSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; i++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a[1];
	}
}
