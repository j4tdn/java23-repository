package datastructure.primitive;

public class Ex03VariableScope {
	
	/*
	 1 chương trình gồm 2 phần
	 - Dữ liệu 
	 (Biến toàn cục)
	 	-->Cú pháp :[access modifier] [static] [final] return_type varible_name;
	 -Chức năng
	   -->Hầm, Phương thức
	   -->Cú pháp :[access modifier] [static] [final] return_type varible_name();
	   		-->Bên trong hàm, phương thức có thể khai báo biến cục bộ
	   			[final] return_type variable_name
	   			
	 */
	private	static	int g1=123;
	static	int g2=1234;
	private static String a1;
	public static void main(String[] args) {
		int a1=5;
		int a2=8;
		
		int b3=0;
		System.out.println("globl g1 -->"+g1);
		System.out.println("Main method a1 -->"+g1);
		System.out.println("globl a1 -->"+Ex03VariableScope.a1);
		{	
			b3=77;
			int b1=11;
			int b2=22;
			 
			System.out.println("a1-->"+a1);
			System.out.println("b1-->"+b1);
			System.out.println("b2-->"+b2);
			
			System.out.println("global"+g1);
			
			testScope();
		}
		System.out.println("a1-->"+a1);
		System.out.println("a2-->"+a2);
		
	}
	private static void testScope() {
		char z1= '!';
		char z2='#';
		int a1=55;
		
	}
}
