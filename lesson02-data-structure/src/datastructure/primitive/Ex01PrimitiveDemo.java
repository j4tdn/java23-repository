package datastructure.primitive;

public class Ex01PrimitiveDemo {
	public static void main(String[] args) {
		// khai báo
		char letter = 'x';
		int digit = 8;
		long bigNum = 88;
		float avgPoint = 8.6f;
		double bigVal = 88.22d;
		
		// gọi sử dụng --> in ra
		System.out.println("letter --> " + letter);
		System.out.println("digit --> " + digit);
		System.out.println("bigNum --> " + bigNum);
		System.out.println("avgPoint --> " + avgPoint);
		System.out.println("bigVal --> " + bigVal);
		
		int a = 44;
		int b = 35;
		int c = 88;
		
		a = b;
		b = c;
		c = 17;
		c = a;
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
	}
}
