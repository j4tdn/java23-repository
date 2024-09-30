package view;

import functional.IntOperator;

public class Ex04OperationsS {

	public static void main(String[] args) {
		/*
		 Cho mảng số nguyên gồm n phần tử 
		 Viết chương trình 
		 1: Tìm tổng các phần tử trong mảng
		 2: Tìm tích các phần tử trong mảng 
		 3: Tìm giá trị lớn nhất của các phần tử trong mảng
		 4: Tìm giá trị nhỏ nhất của các phần tử trong mảng
		 
		 
		 */
//		Ta dùng stragegy pattern khi các hàm có điểm chung
		//C1
		IntOperator mulOpt = new IntOperator() {
			@Override
			public int stragety(int a, int b) {
				return a * b;
			}
		};
		
		
	}
	
	private static int process(int[] elements, int initial, IntOperator op) {
		int result = initial;
		for(int element:elements) {
			result = op.stragety(result, element);
		}
		return result;
	}
}
