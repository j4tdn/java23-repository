package datastructure.primitive;

public class Ex03VariableScope {
        private static int g1 = 123;
         static int g2 = 234;
         static int a1 = 999;
	public static void main(String[] args) {
		int a1 = 5;
		int a2 = 8;
		
		int b3 = 0;
	
	{
		int b1 = 11;
		int b2 = 22;
		System.out.println("a1 --> "+a1);
		System.out.println("b1 --> "+b1);
		System.out.println("b2 --> "+b2);
	}
	System.out.println("a1 --> "+a1);
	System.out.println("a2 --> "+a2);
	System.out.println("b3 --> "+b3);
	
	System.out.println("global g1 --> " + g1);
	System.out.println("Main method a1 --> " + a1);
	System.out.println("Global a1 --> "+ Ex03VariableScope.a1);
	
	testScope(b3);
	}
	private static void testScope(int a2) {
		System.out.println("global g2 --> "+g2);
	}
}
