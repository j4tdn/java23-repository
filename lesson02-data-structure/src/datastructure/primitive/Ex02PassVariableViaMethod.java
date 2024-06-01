package datastructure.primitive;

public class Ex02PassVariableViaMethod {
	public static void main(String[] args) {
		int a=8, b=6;
		int total=sum(a,b);
		System.out.println("total -->" + total);
		
		int value = 86;
		System.out.println("value before --> " + value);
		modify(value);
		System.out.println("value after --> " + value);
	}
	
	private static void modify(int value) {
		System.out.println("v1 --> " + value);
		value = 999;
		System.out.println("v2 --> " + value);
	}
	
	//a=a1
	//b=b1
	private static int sum(int a1, int b1) {
		return a1+b1;
	}
}
