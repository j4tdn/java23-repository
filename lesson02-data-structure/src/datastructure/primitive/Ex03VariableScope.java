package datastructure.primitive;

public class Ex03VariableScope {
	
	//biến toàn cục có thể cùng tên với biến cục bộ
	static int g1 = 3;
	static int a = 999;
	
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		{
			int b1 = 3;
			int b2 = 4;
			
			System.out.println("b1 -> " + Ex03VariableScope.a);
		}
		
		System.out.println("a -->  " + a);
		System.out.println("b -->  " + b);
		name(10);
		//copy: ctrl alt down
	}
	
	public static void name(int value) {
		System.out.println(value);
		value = 5;
		System.out.println(value);
	}
}
