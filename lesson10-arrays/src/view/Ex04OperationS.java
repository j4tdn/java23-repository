package view;

import functional.Operator;

public class Ex04OperationS {
		/*
		 Cho mảng n số nguyên gồm n phần tử
		 Viết chương trình 
		 1.Tìm tổng các phần tử trong mảng
		 2.Tìm tích các phần tử trong mảng
		 3.Tìm giá trị lớn nhất các phần tử trong mảng
		 4.Tìm các giá trị nhỏ nhất các phần tử trong mảng
		 
		 cách làm: 
		 1. Tìm công thức chung 
		 int strategy (result, element)
		 Tìm ra công thức chung có bao nhiêu tham số truyền vào KDL là gì
		 KDL trả về là gì 
		 
		 2. Tạo ra 1 functional interface chứa hàm trừu tượng đó 
		 truyền qua tham số
		 Strategy Pattern: Pattern giúp mình có thể truyền qua tham số 1 hành vi (biểu thức hàm, thực thi) qua hàm
		 
		  
		 */
	public static void main(String[] args) {
		int [] number = {1,2,3,4,5};
		Operator sumOpt = (int a, int b) -> {
			return a+ b;
		};
		System.out.println("sum -> " + process(number, 0, (a,b) -> a+b));
		System.out.println("mul -> " + process(number, 1, (a,b) -> a*b));
		System.out.println("max -> " + process(number, Integer.MIN_VALUE, (a,b) -> Math.max(a, b)));
		System.out.println("min -> " + process(number, Integer.MAX_VALUE, (a,b) -> Math.min(a, b)));
	}
	private static int process(int [] elements, int initial, Operator op) {
		int result = initial;
		for(int element: elements) {
			result = op.strategy(result, element);
		}
		return result;
		
	}

}
