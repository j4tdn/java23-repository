package datastructure.primitive;

public class Ex05SwapTest_UseMethod {

	public static void main(String[] args) {
		int a1 = 1;
		int b2 = 5;
		int b3 = 7;
		System.out.println("\n==== a1b2b3 before ====");
		System.out.println("a1 -->" + a1);
		System.out.println("b2 -->" + b2);
		System.out.println("b3 -->" + b3);
//		a1 = 11;// thay đổi giá trị a1
		modify(a1);
		// hoán vị giá trị b2 & b3
//		int temp = b2; // temp=5
//		b2 = b3; // b2=7
//		b3 = b2; // b3=7

		swap(b2, b3);
		System.out.println("\n==== a1b2b3 after ====");
		System.out.println("a1 -->" + a1);
		System.out.println("b2 -->" + b2);
		System.out.println("b3 -->" + b3);
	}
	
	private static void modify(int a1) {
		a1=11;
	}
	
	
	private static void swap(int b2, int b3) {
		int temp=b2;
		b2=b3;
		b3=temp;
		System.out.println("\n---Swap----");
		System.out.println("b2 -->" +b2);
		System.out.println("b3 -->" +b3);
	}

	//Truyền biến thông qua hàm ko bao h có thể cập nhật dc giá trị stack ở biến đó !
}
