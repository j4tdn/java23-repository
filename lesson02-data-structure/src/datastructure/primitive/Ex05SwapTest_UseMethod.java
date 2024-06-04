package datastructure.primitive;

public class Ex05SwapTest_UseMethod {
	public static void main(String[] args) {
		int a1 = 1;
		int b2 = 5;
		int b3 = 7;
		System.out.println("------before------");
		System.out.println("a1 --> " + a1);
		System.out.println("b2 --> " + b2);
		System.out.println("b3 --> " + b3);
		/*
		 * a1 = 11; int temp = b2; b2 = b3; b3 = temp;
		 * System.out.println("\n------after------");
		 */
		modify(a1);
		System.out.println("a1 --> " + a1);
		System.out.println("b2 --> " + b2);
		System.out.println("b3 --> " + b3);
		
	}
	private static void modify(int a1) {
		a1 = 11;
	}
}
