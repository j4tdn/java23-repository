package datastructure.primitive;

public class Ex05SwaapTest_UseMethod {
	public static void main(String[] args) {
		// use method
		int a1 = 1;
		int b2 = 5;
		int b3 = 7;
		

		System.out.println("===a1b2b3 before===");
		System.out.println("a1-->" + a1);
		System.out.println("b2-->" + b2);
		System.out.println("b3-->" + b3);
		// thay doi gtri a1
		//a1 = 11;
		modify(a1);
		// hoan vij gia tri b2 va b3 cho nhau
		int temp = b2;
		b2 = b3;
		b3 = temp;
		System.out.println("===a1b2b3 after===");
		System.out.println("a1-->" + a1);
		System.out.println("b2-->" + b2);
		System.out.println("b3-->" + b3);

		
	}
	private static void modify(int a1) {
		a1=11;
	}
	public static void swap(int b2,int b3) {
		int temp = b2;
		b2 = b3;
		b3 = temp;
	}
}
