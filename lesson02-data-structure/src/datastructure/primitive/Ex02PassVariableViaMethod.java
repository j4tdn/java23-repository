package datastructure.primitive;

public class Ex02PassVariableViaMethod {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		int total = sum(a,b);
		System.out.println("total ----> " +total);
		
		int value = 86;
		System.out.println("Value before ---> " +value);
		
		modify(value);
		System.out.println("Value after ---> " +value);
		
		
		
	}
	
	public static void modify(int value) {
		System.out.println("v1 before --->" +value);
		
		value = 999;
		
		System.out.println("v2 after --->" +value);
	}
	
    public static int sum(int a, int b) {
		return a + b;
	}
}