package datastructure.primitive;


public class Ex03VariableScope {
	//Biến toàn cục và biến cục bộ có thể trùng tên
	static int a1=99;
	
	public static void main(String[] args) {
		int a1=5;
		int a2=8;
		
		int b3=0;
		
		{
			b3=77;
			int b1=11;
			int b2=22;
//			int a1=44;
			
			System.out.println("a1-->" + a1);
			System.out.println("b1-->" + a2);
			System.out.println("b2-->" + b2);
		}

	}
	private static void testScope(int a2) {
		//Biến cục bộ - phạm vi trong hàm testScope
		char z1 = '!';
		char z2 = '#';
		
	}

}
