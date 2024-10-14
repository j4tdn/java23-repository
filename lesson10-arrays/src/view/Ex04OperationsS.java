package view;

import functional.Operator;

public class Ex04OperationsS {

	/*
	  Cho mảng số nguyên gồm n phần tử
	  Viết chương trình
	  1. Tìm tổng các phần tử trong mảng
	  2. Tìm tích các phần tử trong mảng
	  3. Tìm giá trị lớn nhất của các phần tử trong mảng
	  4. Tìm giá trị nhỏ nhất của các phần tử trong mảng
	  // alt shift R
	 */
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		// Anonymous class:
		Operator sumOpt = new Operator() { // H1
			@Override
			public int strategy(int a, int b) {
				return a + b;
			}
		};
		
		Operator sumOpt1 = (int a, int b) -> {
			return a + b;
		};
		
		Operator sumOpt2 = (a, b) -> a + b;
		
		// Operator mulOpt = (a, b) -> a * b;
		
		System.out.println("sum --> " 
						+ process(numbers, 0, sumOpt));
		System.out.println("mul --> " 
						+ process(numbers, 1, (a, b) -> a * b));
		System.out.println("max --> " 
						+ process(numbers, Integer.MIN_VALUE, (a, b) -> Math.max(a, b)));
		System.out.println("min --> " 
						+ process(numbers, Integer.MAX_VALUE, (a, b) -> Math.min(a, b)));
		
	}
	
	/* sum --> result = result + element;
	   mul --> result = result * element;
	   max --> if(result < element) result = element
		   --> max(result, element)
	   min --> min(result, element)
	   
	   Tìm công thức chung(hàm trừu tượng) của các biểu thức
	   int strategy(result, element)
	   
	   Tìm ra công thức chung có bao nhiêu tham số truyền vào, KDL gì
	   KDL trả về là gì
	   Tên Functional Interface hay tên hàm trừu tượng đặt bất kỳ
	   
	   Tạo 1 functional interface chứa hàm trừu tượng đó
	   Truyền tham số qua hàm
	   
	   Strategy Pattern: Pattern giúp mình có thể truyền tham số là 
	   một hành vi (biểu thức, hàm thực thi) qua hàm
	   
	   
	*/

	
	// Operator op = sumOpt // H1
	private static int process(int[] elements, int initial, Operator op) {
		int result = initial;
		
		for (int element: elements) {
			result = op.strategy(result, element);
		}
		
		return result; 
	}
	
	/* NOTE:
	  - Sử dụng strategy pattern: Áp dụng khi mình muốn truyền tham số qua hàm là 1 biểu thức
	  - Interface chỉ có 1 hàm trừu tượng: @FunctionalInterface
	  - Interface chứa được hàm bình thường: nhưng thêm từ khóa default, static hoặc private
	
	  - Anonymous class:
		Operator sumOpt = new Operator() {
			@Override
			public int strategy(int a, int b) {
				return a + b;
			}
		};
	*/
}
