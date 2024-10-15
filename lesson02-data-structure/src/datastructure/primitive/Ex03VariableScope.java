package datastructure.primitive;

public class Ex03VariableScope {
	private static  int g1=10;
	public static void main(String[] args) {
		int a1=5;
		int a2=8;
		int b3=0;
		System.out.println("global g1-->" +g1);
		{
			b3=77;
			int b1 =11;
			int b2=22;
			System.out.println("a1-->" +a1);
			System.out.println("b1-->" +b1);
			System.out.println("b2-->" +b2);
		}
		System.out.println("a1-->" +a1);
		System.out.println("a2-->" +a2);
		System.out.println("b3-->" +b3);
		testScope(b3);
	}

	private static void testScope(int a2) {
		char z1='!';
		char z2 ='#';
		
	}
	 
}
