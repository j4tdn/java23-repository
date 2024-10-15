package view;

import functional.IntOperator;

public class Ex04OperationsS {
	
	/*
	 Cho mảng số nguyên gồm n phần tử
	 Viết chương trình
	 1. Tìm tổng các phần tử trong mảng
	 2. Tìm tích các phần tử trong mảng
	 3. Tìm giá trị lớn nhất của các phần tử trong mảng
	 4. Tìm giá trị nhỏ nhất của các phần tử trong mảng
	 */
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println("sum --> " + sum(numbers));
		System.out.println("mul --> " + mul(numbers));
		System.out.println("max --> " + max(numbers));
		System.out.println("min --> " + min(numbers));
		
		System.out.println("\nstrategy pattern\n");
		
		// sử dụng strategy pattern
		
		IntOperator sumOpt = (a, b) -> a + b;
		
		IntOperator mulOpt = new IntOperator() { // H2
			
			@Override
			public int strategy(int a, int b) {
				return a * b;
			}
		};
		
		System.out.println("sum --> " 
				+ process(numbers, 0, (a, b) -> a + b));
		
		System.out.println("mul --> " 
				+ process(numbers, 1, (a, b) -> a * b));
		
		System.out.println("max --> " 
				+ process(numbers, Integer.MIN_VALUE, (a, b) -> Math.max(a, b)));
		
		System.out.println("min --> " 
				+ process(numbers, Integer.MAX_VALUE, (a, b) -> Math.min(a, b)));
	}
	
	// sum --> result = result + element;
	// mul --> result = result * element;
	// max --> result = max(result, element)
	// min --> result = min(result, element)
	
	// Tìm công thức chung(hàm trừu tượng) của các biểu thức
	// int strategy(result, element)
	
	// Tìm ra công thức chung có bao nhiêu tham số truyền vào KDL gì
	// KDL trả về là gì
	// Tên FI || tên hàm trừu tượng đặt bất kỳ
	
	// Tạo 1 functional interface chứa hàm trừu tượng đó
	// Truyền tham số qua hàm
	
	// Strategy Pattern: Pattern giúp mình có thể truyền tham
	// số là 1 hành vi(biểu thức, hàm thực thi) qua hàm
	
	
	// Operator op = sumOpt // H1
	private static int process(int[] elements, int initial, IntOperator op) {
		int result = initial;
		
		for (int element: elements) {
			result = op.strategy(result, element);
		}
		
		return result;
	}
	
	private static int sum(int[] elements) {
		int sum = 0;
		for (int element: elements) {
			sum = sum + element;
		}
		return sum;
	}
	
	private static int mul(int[] elements) {
		int mul = 1;
		for (int element: elements) {
			mul = mul * element;
		}
		return mul;
	}
	
	private static int max(int[] elements) {
		int max = Integer.MIN_VALUE;
		for (int element: elements) {
			if (max < element) {
				max = element;
			}
		}
		return max;
	}
	
	private static int min(int[] elements) {
		int min = Integer.MAX_VALUE;
		for (int element: elements) {
			if (min > element) {
				min = element;
			}
		}
		return min;
	}
	
}