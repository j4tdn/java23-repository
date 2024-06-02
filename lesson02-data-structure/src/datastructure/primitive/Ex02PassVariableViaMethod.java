package datastructure.primitive;

public class Ex02PassVariableViaMethod {
	public static void main(String[] args) {
		int a = 8;
		int b =6;
		int sum= sum(a, b);
		System.out.println(sum);
		int value =86;
		System.out.println("value before -->" +value);
		modify(value);
		System.out.println("value after-->"+value);
		
	}
	private static void modify(int value) {
		value = 999;
	}
	private static int sum(int a, int b) {
		return a+b;
	}
}
