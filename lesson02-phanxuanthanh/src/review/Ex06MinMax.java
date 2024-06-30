package review;

import static utils.IoUtils.*;
import bean.Pair;

public class Ex06MinMax {
	public static void main(String[] args) {
		int requiredMin = 0;
		int requiredMax = 20;
		
		int a = input1("a", requiredMin, requiredMax);
		int b = input1("b", requiredMin, requiredMax);
		int c = input1("c", requiredMin, requiredMax);
		
		System.out.println("\n ===> Pair(min,max) = " + getMinmax(a, b, c));
		
		int[] numbers = {a,b,c};
		System.out.println("\n ===> Pair(min,max) = " + getMinmax(numbers));
		
	}

	// Tìm min, max của n số
	// n số --> n độc lập a b c d e f
	// n số --> n số thuộc 1 mảng
	
	// KDL: nhận 0,1,2..n tham số hoặc 1 mảng

	private static Pair getMinmax(int... numbers) {
		if (numbers.length <= 0) {
			System.out.println("Input numbers[] is invalid, at least 1 element");
			return null;
		}
		int max = numbers[0];
		int min = numbers[0];

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