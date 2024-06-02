package datastructure.primitive;

public class Ex03VariableScope {
	/*
	 Một chương trình(class) gồm 2 phần
	 + Dữ liệu
	 --> Biến toàn cục
	 	=> Cú pháp: [access modifier] [static] [final] return_type variable_name;
	 
	 + Chức năng
	 --> Hàm or phương thức
	 	=> Cú pháp: [access modifier] [static] [final] return_type method_name([..variables]) {body}
	 	--> Bên trong hàm or phương thức có thể khai báo Biến cục bộ
	 		[final] return_type variable_name
	 		Phạm vi: Block Scope - có nghĩa là phạm vi dùng trong 2 dấu { và }
	
	 Quan tâm đến 2 quá trình
	 + Coding --> compile - biên dịch
	 + Running --> runtime - thực thi
	 
	 Phím tắt
	 Ctrl Alt down/up: copy xuống/lên 1 dòng
	
	 */
	
	//Biến toàn cục có thể trùng tên với biến cục bộ
	//Nếu trong hàm chứa biến cục bộ thì nó sẽ 'ưu tiên' biến cục bộ hơn
	private static int g1 = 123; //vì đã compile file này rồi nhưng chưa thấy sử dụng nên warning
	static int g2 = 234;		//không hiện warning vì compile file này thì file khác sử dụng chưa cũng chưa biết nên k có warning
	static int a1 = 999;
	
	
	public static void main(String[] args) {

		// Biến cục bộ(local variable)
		int a1 = 5;
		int a2 = 8;
		
		int b3 = 0;
		
		System.out.println("Global g1 --> " + g1);
		System.out.println("Main method a1 --> " + a1);
		
		//Gọi biến a1 bên ngoài (global) --> dùng tên_class.tên_biến
		System.out.println("Main method a1 --> " + Ex03VariableScope.a1); // static a1 --> lấy class gọi
		
		{
			b3 = 77; //gọi hàm để đổi gt chứ k phải là khai báo, vì đã khao báo ở block scope ngoài rồi
			int b1 = 11;
			int b2 = 22;
			//int a1 = 44; //không được vì đã khai báo ở block scope ngoài rồi nên k thể lấy lại để khai báo 
			System.out.println("a1 --> " + a1);
			System.out.println("b1 --> " + b1);
			System.out.println("b2 --> " + b2);
			System.out.println("b3 --> " + b3);
		}
		System.out.println("a1 --> " + a1);
		System.out.println("a2 --> " + a2);
		//lỗi sau đây ở 'b2' vì b1 b2 khai báo trong block scope: { }
			//System.out.println("a1 --> " + b2);
		System.out.println("b3 --> " + b3);
		
		System.out.println("global g1 --> " + g1);
		
		testScope(b3);
	}
	
	//int a2 = b3
	private static void testScope(int a2) {
		//Biến cục bộ - phạm vi trong hàm testScope
		char z1 = '!';
		char z2 = 'z';
		int a1 = 55;
		
		System.out.println("global a1 --> " + a1);
		System.out.println("global a2 --> " + a2);
	}
}
