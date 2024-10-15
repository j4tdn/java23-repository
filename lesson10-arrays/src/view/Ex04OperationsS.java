package view;

import functional.IntOperator;

public class Ex04OperationsS {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		// strategy pattern

		// Tìm công thức chung của các biểu thức
		// tìm ra công thức chung có bao nhiêu tham số
		// tạo 1 functional interface chứa hàm trừu tượng

		IntOperator sumOpt = new IntOperator() {

			@Override
			public int strategy(int a, int b) {
				return a + b;
			}
		};
		
		IntOperator mulOpt = (a, b) -> a * b;


		System.out.println(process(numbers, 0, sumOpt));
		// lambda
		System.out.println(process(numbers, 0, (a, b) -> a + b));
		System.out.println(process(numbers, 1, mulOpt));

		System.out.println(process(numbers, 0, (a, b) -> Math.max(a, b)));

		System.out.println(process(numbers, 0, (a, b) -> Math.min(a, b)));

		// strategy pattern: Pattern có thể giúp mình truyền tham số là 1 hành vi (biểu
		// thức, hàm) qua hàm.
	}

	private static int process(int[] elements, int initial, IntOperator op) {
		int result = initial;

		for (int element : elements) {
			result = op.strategy(element, result);
		}

		return result;
	}
}
