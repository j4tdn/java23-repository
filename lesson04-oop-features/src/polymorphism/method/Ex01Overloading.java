package polymorphism.method;

public class Ex01Overloading {

	public static void main(String[] args) {
		System.out.println("sum 2 số nguyên --> " + sum(1, 2));
		System.out.println("sum 3 số nguyên --> " + sum(1, 2, 3));
		System.out.println("sum 2 số thực --> " + sum(1f, 2f));
		System.out.println("sum n số thực --> " + sum(1f, 2f, 3f, 4f));
	}
	
	private static float sum(float ... numbers) {
		float sum = 0f;
		for (float number: numbers) {
			sum = sum + number;
		}
		return sum;
	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
