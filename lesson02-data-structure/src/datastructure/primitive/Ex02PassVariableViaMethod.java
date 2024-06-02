package datastructure.primitive;

public class Ex02PassVariableViaMethod {
	public static void main(String[] args) {
		int a1 = 8;
		int a2 = 6;
		int total = sum(a1, a2);
		System.out.println("total -->" + total);
		
		int value = 86;
		System.out.println("value before --> "+ value);
		modify(value);
		System.out.println("value after --> "+ value);
		
	}
	
	private static void modify(int value) {
		System.out.println("v1 --> " + value);
		value = 999;
		System.out.println("v2 --> " + value);
	}
	
    private static int sum(int a, int b) {
    	return a + b;
    }
}
