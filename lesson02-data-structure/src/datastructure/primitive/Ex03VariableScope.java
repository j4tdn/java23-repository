package datastructure.primitive;

public class Ex03VariableScope {

	// Toán từ = dùng để copy giá trị của vế phải gán cho vế trái

	/*
	 * Một chương trình gồm 2 phần
	 * 
	 * + Dữ liệu ---> Biến toàn cục cú pháp: [access modifier] [static] [final]
	 * return_type variable name;
	 * 
	 * + chức năng: ---> Hàm, phương thức cú pháp: [access modifier] [static]
	 * [final] return_type method_name([..variable]) { ---> Bên trong hàm,phương
	 * thức có thể khai báo biến cục bộ [final] return_type variable phạm vi: Block
	 * Scope
	 * 
	 * Quan tâm đến 2 quá trình + coding -->compile: phiên dịch + Running -->
	 * Runtime thực thi
	 * 
	 */
//	Biến toàn cục có thể trùng tên với biến cục bộ 
//	Nếu bên trong hàm chứa biến cục bộ thì nó sẽ ưu tiên biến cục bộ hơn 
	private static int g1 = 123;
	static int g2 = 234; // biến toàn cục
	static int a1 = 999; // biến toàn cục

	public static void main(String[] args) {
//  biến cục bộ(local variable)		
		int a1 = 5;
		int a2 = 8;

		int b3 = 0;

		System.out.println("global g1 --> " + g1);
		System.out.println("main method a1 --> " + a1);
		System.out.println("global a1 -->" + Ex03VariableScope.a1); // static a1 --> lấy class. gọi
		{
			b3 = 77;
			int b1 = 11;
			int b2 = 22;
			System.out.println("a1 --> " + a1);
			System.out.println("a2 -- " + a2);
			System.out.println("b1 --> " + b1);
			System.out.println("b2 --> " + b2);
		}
		System.out.println("a1  --> " + a1);
		System.out.println("b3  --> " + b3);
		testScope(b3);
	}

	private static void testScope(int a2) {

//  biến cục bộ - phạm vi trong hàm testScope
		char z1 = '!';
		char z2 = '#';
		int a1 = 55;
		System.out.println("global a1 --> " + a1);

	}

}
