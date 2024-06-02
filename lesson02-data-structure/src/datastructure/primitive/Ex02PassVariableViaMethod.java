package datastructure.primitive;

public class Ex02PassVariableViaMethod {

	//dữ liệu 
		//biến khai báo bên ngoài hàm --> biến toàn cục
		//cùng cấp với các hàm, phạm vi sử dụng ở trong class
	
	// toán tử = dùng để COPY giá trị của vế phải  GÁN cho vế trái
		//     = hoạt động trong vùng nhớ STACK
	
	// Khi truyền giá trị qua hàm, giá trị ô nhớ ở STACK của biến đang truyền sẽ không bao giờ thay đổi được 
	
	int year =2021;
	
	public static void main(String[] args) {
		// biến khai báo bên trong hàm --> biến cục bộ
		// phạm vi sử dụng trong hàm chứa nó
		int x = 8;
		int y = 6;
		int total = sum(x,y);
		System.out.println("total --> " + total);
		
		int value = 86; // đỏ
		System.out.println("value before --> " + value);
		modify(value);//Lấy cái gt của biến value đỏ gán cho gt của biến value xanh
		System.out.println("value after --> " + value);
	}
	
	// int value(xanh) = value(đỏ);
	private static void modify(int value) { // xanh
		System.out.println("v1 --> " + value);
		value = 999;
		System.out.println("v2 --> " + value);
	}
	
	//int a = x;
	//int b = y;
	private static int sum(int a, int b) {
		return a + b;
	}
}
