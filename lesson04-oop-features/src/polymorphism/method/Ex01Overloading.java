package polymorphism.method;

public class Ex01Overloading {
	/*
	 	Viết chương trình:
	 		+ Tính tổng 2 số nguyên
	 		+ Tính tổng 3 số nguyên
	 		+ Tính tổng 2 số thực
	 		+ Tính tổng n số thực
	 */
	
	public static void main(String[] args) {
		System.out.println("Sum 3 số nguyên: " +sum(1, 2, 3));
		System.out.println("Sum 2 số thực: "+ sum(1f, 2f));
		System.out.println("Sum n số thực: "+sum(1f,2f,3f,4f));
	}
	
	private static float sum(float ...numbers) {
		float sum=0f;
		for(float number:numbers) {
			sum+=number;
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
		return a+b+c;
	}
}
