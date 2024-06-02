package datastructure.primitive;

public class Ex04SwapTest_UnusedMethod {
	public static void main(String[] args) {
		// unused method
		int a1 = 1;
		int b2 = 5; // 7
		int b3 = 7; // 5

		System.out.println("=== a1b2b3 before ===");
		System.out.println("a1 -> " + a1);
		System.out.println("b2 -> " + b2);
		System.out.println("b3 -> " + b3);

		// thay đổi gt của a1
		a1 = 11; 

		// hoán vị gt của b2 và b3 cho nhau
		int temp = b2; // temp = 5
		b2 = b3;
		b3 = temp;

		System.out.println("\n=== a1b2b3 after ===");
		System.out.println("a1 -> " + a1);
		System.out.println("b2 -> " + b2);
		System.out.println("b3 -> " + b3);
	}
}
