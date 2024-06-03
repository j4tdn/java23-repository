package datastructure.primitive;

public class Ex05SwapTest_UseMethod {
	public static void main(String[] args) {
		// no use method
		int a1 = 1;
		int b2 = 5;
		int b3 = 7;
		System.out.println("\n === a1 b2 b3 before ===");
		System.out.println("a1 ->" + a1);

		System.out.println("b2 ->" + b2);

		System.out.println("b3 ->" + b3);
		// thay đổi giá trị của a1
		modify(a1);

		// hoá vị giá trị của b2 và b3
		swap(b2, b3);
		System.out.println("\n === a1 b2 b3 after ===");
		System.out.println("a1 ->" + a1);

		System.out.println("b2 ->" + b2);

		System.out.println("b3 ->" + b3);
		
	}
	private static void modify(int a1) {
		a1 = 11;
	}
	private static void swap(int b2, int b3) {
		int temp = b2;
		b2 = b3;
		b3 = temp;
	}
}
