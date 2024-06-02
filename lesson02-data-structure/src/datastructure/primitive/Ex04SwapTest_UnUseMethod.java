package datastructure.primitive;

public class Ex04SwapTest_UnUseMethod {

	public static void main(String[] args) {
		//no use method
		int a1 = 1;
		int b2 = 5;
		int b3 = 7;
		
		System.out.println("=== a1, b2, b3 before ===");
		System.out.println("a1 --> " +a1);
		System.out.println("b2 --> " +b2);
		System.out.println("b3 --> " +b3);
		
		//thay doi gia tri a1
		a1 = 11;
		
		//hoan vi gia tri cua b2 va b3
		int temp = b2;
		b2 = b3;
		b3 = temp;
		
		System.out.println("=== a1, b2, b3 after ===");
		System.out.println("a1 --> " +a1);
		System.out.println("b2 --> " +b2);
		System.out.println("b3 --> " +b3);
		
	}
}
