package polymorphism.method;

public class Ex01Overloading {

	public static void main(String[] args) {
 
		System.out.println("sum 3 số nguyên ---> " +sum(1,2,3));
		System.out.println("sum 2 số thuc ---> " +sum(1f,3f));
		System.out.println("sum n số nguyên ---> " +sum(1,2,3,5));
		
	}

	private static float sum(float... numbers) {
		float sum = 0f;
		for (float number : numbers) {
			sum = sum + number;
		}
		return sum;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static float sum(float a, float b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	private static int sum(int ... numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum = sum + number;
		}
		return sum;
	}
	}

