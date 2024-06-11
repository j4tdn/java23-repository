package datastructure.primitive;

public class Ex02PassVariableViaMethod {
	
	// dữ liệu
	
	// Toán tử = dùng để COPY giá trị của vế phải GÁN cho vế trái
	//         = hoạt động ở vùng nhớ STACK
	// Khi truyền giá trị qua hàm, giá trị ô nhớ ở STACK của biến đang truyền qua sẽ không bao giờ thay đổi được
	
	public static void main(String[] args) {
		// biến khai báo bên trong hàm --> biến cục bộ
		// phạm vi sử dụng trong hàm chứa nó
		int a1 = 8;
		int a2 = 6;
		int total = sum(a1, a2);
		System.out.println("total --> " + total);
		
		int value = 86; // đỏ
		
		System.out.println("value before --> " + value);
		
		modify(value);
		
		System.out.println("value after --> " + value);
	}
	
	// int value(xanh) = value(đỏ);
	private static void modify(int value) { // xanh
		System.out.println("v1 --> " + value);
		value = 999;
		System.out.println("v2 --> " + value);
	}
	
	// int a = a1;
	// int b = a2;
	private static int sum(int a, int b) {
		return a + b;
	}
	
}