package datastructure.primitive;

public class Ex01PrimitiveDemo {

	public static void main(String[] args) {
		
		//khai báo
		char letter = 'x';
		int digit = 8;
		long bigNum = 88;
		float avgPoint =8.6f;
		double bigVal = 88.22d;
		
		//gọi sử dụng --> in ra
		System.out.println("letter --> " + letter);
		System.out.println("letter --> " + digit);
		System.out.println("letter --> " + bigNum);
		System.out.println("letter --> " + avgPoint);
		System.out.println("letter --> " + bigVal);
		
		// Biểu thức VT = VP --> gán giá trị của VP cho VT
		int a = 44;
		int b = 35;
		int c = 88;
		
		a=b;
		b=c;
		c=17;
		c=a;
		
		System.out.println("a --> " + a); // 35
		System.out.println("b --> " + b); // 88
		System.out.println("c --> " + c); // 35
	}
}
