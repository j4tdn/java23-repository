package view;

import functional.Operator;

public class Ex04OperationsS {

	/*
	  Cho mảng số nguyên gồm n phần tử
	  Viết chương trình
	  1. Tìm tổng các phần tử trong mảng
	  2. Tìm tích các phần tử trong mảng
	  3. Tìm giá trị lớn nhất các phần tử trong mảng
	  4. Tìm giá trị nhỏ nhất các phần tử trong mảng
	 */
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println("sum --> " + sum(numbers));
		System.out.println("mul --> " + mul(numbers));
		System.out.println("min --> " + min(numbers));
		System.out.println("max --> " + max(numbers));

		// sử dụng strategy pattern
		System.out.println("\n strategy pattern \n");
		
		Operator sumOpt = new Operator() {
			
			@Override
			public int strategy(int a, int b) {
				return a + b;
			}
		};
		Operator mulOpt = (a, b) -> a * b;
		
		
		
		System.out.println("sum --> " + process(numbers, 0, sumOpt));
		System.out.println("mul --> " + process(numbers, 1, mulOpt));
		System.out.println("mul2 --> " + process(numbers, 1, (a, b) -> a * b));

		System.out.println("min --> " + process(numbers, Integer.MAX_VALUE, (a, b ) -> Math.min(a, b)));
		System.out.println("max --> " + process(numbers, Integer.MIN_VALUE, (a, b ) -> Math.max(a, b)));

	}
	
	
	private static int process(int[] elements, int initial, Operator op) {
		int result = initial;
		
		for (int element : elements) {
			result = op.strategy(result, element);
		}
		return result;
	}
	private static int sum(int[] elements) {
		int sum = 0;
		for (int element : elements) {
			sum = sum+element;
		}
		return sum;
	}
	private static int mul(int[] elements) {
		int mul = 1;
		for (int element : elements) {
			mul =mul *element;
		}
		return mul;
	}
	private static int max(int[] elements) {
		int max = Integer.MIN_VALUE;
		for (int element : elements) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}
	private static int min(int[] elements) {
		int min = Integer.MAX_VALUE;
		for (int element : elements) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}
}
