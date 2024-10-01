package view;

import functional.IntOperator;

public class Ex04OperationsS {

	/*
	Cho mang so nguyen gom n phan tu
	Viet chuong trinh 
	1. Tim tong cac phan tu trong mang
	2. Tim tich cac phan tu trong mang
	3. Tim gia tri lon nhat cua cac phan tu trong mang
	4. Tim gia tri nho nhat cua cac phan tu trong mang
	
	 */
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		// su dung strategy pattern
		
		IntOperator sumOpt = (a, b) -> a + b;
		
		IntOperator mulOpt = new IntOperator() {
			@Override
			public int strategy(int a, int b) {
				return a * b;
			}
		};
		
		System.out.println("sum --> " + process(numbers, 0, (a, b) -> a + b));
		System.out.println("mul --> " + process(numbers, 1, mulOpt));
		System.out.println("max --> " + process(numbers, Integer.MIN_VALUE, (a, b) -> Math.max(a, b)));
		System.out.println("min --> " + process(numbers, Integer.MAX_VALUE, (a, b) -> Math.min(a, b)));
	}
	
	// sum --> result = result + element;
	// mul --> result = result * element;
	// max --> result = max(result, element);
	// min --> result = min(result, element);
	
	/*
	   - Tim cong thuc chung(ham truu tuong) cua cac bieu thuc
	   - Tao functional interface chua ham truu tuong do
	   - Truyen tham so qua ham
	   
	   --> Strategy Pattern: Pattern giup minh co the truyen tham so la 1 hanh vi(bieu thuc, ham thuc thi) qua ham
	 */
	private static int process(int[] elements, int initial, IntOperator op) {
		int result = initial;
		for(int element: elements)
			result = op.strategy(result, element);
		return result;
	}
}
