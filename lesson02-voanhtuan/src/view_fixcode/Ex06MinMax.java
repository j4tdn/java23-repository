package view_fixcode;

import static utils.IoUtils.*;

import bean.Pair;

import static java.lang.Math.*;

public class Ex06MinMax {

	public static void main(String[] args) {
		int requiredMin = 0;
		int requiredMax = 20;

		int a = input("a", requiredMin, requiredMax);
		int b = input("b", requiredMin, requiredMax);
		int c = input("c", requiredMin, requiredMax);

		System.out.println("Pair(min,max) = " + getMinMax(a, b, c));

		System.out.println("\n======================\n");

		int[] numbers = { a, b, c };
		System.out.println("Pair(min,max) = " + getMinMax(numbers));

	}

	// Viết 1 hàm duy nhất trả về min và max của 3 hoặc n số;
	// trả về một KDL đối tượng có thể có 2 giá trị
	// Pair, Tuple

//	private static int findMax(int n1, int n2, int n3) {
//		return max(n1, max(n2, n3));
//	}

	// Hàm nhập 3 số
//	private static Pair getMinMax(int n1, int n2, int n3) {
//		int min = min(n2, min(n2, n3));
//		int max = max(n2, max(n2, n3));
//
//		return new Pair(min, max);
//	}

	// Tìm min, max của n số
	// n số --> n số độc lập a b c d e f
	// n số --> n số thuộc 1 mảng

	// KDL: nhận 0,1,2..n tham số hoặc 1 mảng

	//Hàm nhập n số
	private static Pair getMinMax(int... numbers) {
		if (numbers.length < 0) {
			System.out.println("Input numbers[] is invalid, at least 1 element");
			return null;
		}
		int min = numbers[0];
		int max = numbers[0];

		for (int number : numbers) {
			if (number < min) {
				min = number;
			} else if (number > max) {
				max = number;
			}
		}
		return new Pair(min, max);
	}

}
