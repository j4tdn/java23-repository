package datastructure.primitive;

public class Ex01Primitivedemo {

	public static void main(String[] args) {
		
		//khai báo
		char letter = 'x';
		int digit = 3;
		long bigNum = 159;
		float avgPoint = 8.7f;
		double bigVal = 159.87;
		
		//gọi sử dụng --> in ra
		System.out.println("letter --> " + letter);
		System.out.println("digit --> " + digit);
		System.out.println("bigNum --> " + bigNum);
		System.out.println("avgPoint --> " + avgPoint);
		System.out.println("bigVal --> " + bigVal);
		
		//Biểu thức vế trái = vế phải --> gán giá trị của vế phải cho vế trái
		VD: int a = 44;
			int b = 35;
			int c = 88;
			
			a = b;
			b = c;
			c = 17;
			c = a;
			
			System.out.println("a --> " + a); // 35
			System.out.println("b --> " + b); // 88 
			System.out.println("c --> " + c); // 35
	}
	
}
