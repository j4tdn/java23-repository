package view;

import java.util.function.IntBinaryOperator;

public class Ex04MethodReference_Static {
	public static void main(String[] args) {
		// 1. Implementation
		// 2. Anonymous class
		// 3. Anonymous function
		// 4. Method reference
		// --> non static


		// --> static
		// Nên dùng khi
		// + Lambda có dạng giống static method
		// + Lambda có body dài và sử dụng được gọi nhiều chỗ

		// BT: cho danh sách số nguyên
		// + Tìm tổng
		// + Tìm min / max.

		int[] numbers = { 1, 6, 7, 82, 42, 99, 12, 45, 4, 3 };
		
		System.out.println("Sum: " + process(0, numbers, (a, b) -> (a + b)));

		System.out.println("Sum: " + process(0, numbers, Ex04MethodReference_Static::intBinary));

		System.out.println("Max: " + process(Integer.MIN_VALUE, numbers, (a, b) -> Math.max(a, b)));

		System.out.println("Max: " + process(Integer.MIN_VALUE, numbers, Integer::max));
		
		System.out.println("Min: " + process(Integer.MAX_VALUE, numbers, Integer::min));
	}

	private static int intBinary(int x, int y) {
		return x + y;
	}

	private static int process(int initial, int[] elements, IntBinaryOperator operator) {
		int rs = initial;
		for (int element : elements) {
			rs = operator.applyAsInt(rs, element);
		}
		return rs;
	}


}
