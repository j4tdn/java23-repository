package datastructure.primitive;


public class Ex03VariableScope {
	/*
	 Một chương trình(Class) có 2 phần:
	  
	 + Dữ liệu: 
	 	--> Biến toàn cục
	 			Cú pháp: [access modifier] [static] [final] return _type variable_name;
	 		
	 		* [access modifier]: public, private, protected(Nằm trong package và bên ngoài package thông qua class con), default(chỉ nằm trong package)
	 
	 
	 + Chức năng:
	 	--> Phương thức(hàm):
	 			 Cú pháp (hàm): [access modifier] [static] [final] return _type methoad_name([..variables]) {body}

	 	--> Bên trong phương thức(hàm) có thể khai báo biến cục bộ
	 			Cú pháp biến cục bộ: [final] return _type methoad_name([..variables]) {body}

	 
	 */
	
	private static int g1=123;
	static int g2=234;
	//Biến toàn cục và biến cục bộ có thể trùng tên
	static int a1=99;

	
	public static void main(String[] args) {
		int a1=5;
		int a2=8;
		
		int b3=0;
		
		System.out.println("global g1 -->" +g1);
		System.out.println("Main methoad a1 -->" +a1);
		System.out.println("Global g1 -->" +Ex03VariableScope.a1);

		{
			b3=77;
			int b1=11;
			int b2=22;
//			int a1=44;
			
			System.out.println("\na1-->" + a1);
			System.out.println("b1-->" + a2);
			System.out.println("b2-->" + b2);
		}
	
		System.out.println("\na1-->" + a1);
		System.out.println("b1-->" + a2);
		System.out.println("b3-->" + b3);
		
		System.out.println("gloabal g1 -->" +g1);
		
		testScope(b3);
	}
	private static void testScope(int a2) {
		//Biến cục bộ - phạm vi trong hàm testScope
		char z1 = '!';
		char z2 = '#';
		
	}

}
