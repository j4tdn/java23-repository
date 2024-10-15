package view;

public class Ex04OperationsS {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println("sum --> " + sum(numbers));
	}
	
	private static int sum(int[] elements) {
		int sum = 0;
		
		for (int element: elements) {
			sum = sum + element;
		}
		return sum;
	}
	
}
