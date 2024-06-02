package datastructure.primitive;

public class Ex04SwapText {

	public static void main(String[] args) {
		//no use methods
		int a1 = 3;
		int a2 = 4;
		int a3 = 5;
		
		//hoán vị a2 a3
		int temp = 0;
		temp = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println(a2 + "<- a2, a3 -> " + a3);
		
		int a = 14;
		int b = 15;
		swap(a,b);
		System.out.println(a+ " a, b " + b);
	}
	
	private static void swap(int a, int b) {
		int temp1 = a;
		a = b;
		b = temp1;
	}
}
