package view;

import functional.Operator;

public class Ex04OperationsS {

	/*
	 Cho mảng số nguyên gồm n phần tử
	 Viết chương trình
	 1. Tìm tổng các phần tử trong mảng
	 2. Tìm tích cấc phần tử trong mảng
	 3. Tìm giá trị lớn nhất của các phần tử trong mảng
	 4. Tìm giá trị lớn nhất của các phần tử trong mảng
	 */
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println("sum --> " + sum(numbers));
		System.out.println("mul --> " + mul(numbers));
		System.out.println("max --> " + max(numbers));
		System.out.println("min --> " + min(numbers));
		
		System.out.println("\n");
		
		// Sử dụng Strategy Pattern: Áp dụng khi muốn truyền tham số là một biểu thức qua hàm
		
		Operator sumOpt = (a, b) -> a + b;
		
		Operator mulOpt = new Operator() {
			
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
	
	// sum --> result = result + elements
	// mul --> result = result * elements
	// max --> result = max(result, element)
	// min --> result = min(result, element)
	
	// Tìm công thức chung (hàm trừu tượng) của các biểu thức
	// --> trả về int, đặt tên hàm: strategy, tham số: result, element
	// int strategy(result, element)
	
	// Tìm ra công thức chung có bao nhiêu tham số truyền vào, KDL gì?
	// KDL trả về là gì
	// Tên FI || tên hàm trừu tượng đặt bất kỳ
	
	// Tạo 1 functional interface chứa hàm trừu tường đó
	// Truyền tham số qua hàm
	
	// Strategy Pattern: Pattern giúp mình có thể truyền tham số là 1 hành vi (biểu thức, hàm thực thi)
	// qua hàm
	
	// Operator op = sumOpt // H1
	private static int process(int[] elements, int initial, Operator op) {
		int result = initial;
		
		for(int element : elements) {
			result = op.strategy(result, element);
		}
		
		return result;
	}
	
	private static int sum(int[] elements) {
		int sum = 0;
		
		for(int element: elements) {
			sum += element;
		}
		
		return sum;
	}
	
	private static int mul(int[] elements) {
		int mul = 1;
		
		for(int element: elements) {
			mul *= element;
		}
		
		return mul;
	}
	
	private static int max(int[] elements) {
		int max = Integer.MIN_VALUE;
		
		for(int element: elements) {
			if(max < element) {
				max = element; 
			}
		}
		
		return max;
	}
	
	private static int min(int[] elements) {
		int min = Integer.MAX_VALUE;
		
		for(int element: elements) {
			if(min > element) {
				min = element; 
			}
		}
		
		return min;
	}
	
}
