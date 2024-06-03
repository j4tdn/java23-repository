package datastructure.primitive;

public class Ex03VariableScope {
	/* 
	 * Một chương 
	 */
	private static int g1 = 123;
	 static int g2 = 234;
	 static int a1 = 999;
	 
	public static void main(String[] args) {
		int a1 = 5;
		int a2 = 8;
		int b3 = 0;
		{
			b3 = 77;
			int b1 = 11;
			int b2 = 22;
			System.out.println("a1 ----> " + a1);
		}
		System.out.println("a1 ----> " + a1);
		System.out.println("a2 ----> " + a2);

	}
	private static void testScope(int a2) {
		char z1 = '!';
		char z2 = '#';
		int a1 = 55;
	}
}
