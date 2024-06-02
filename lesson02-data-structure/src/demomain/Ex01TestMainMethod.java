package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Welcome to Java23 Class");
		
		System.out.println("Today is:  " + LocalDate.now());
		
		printStarTriangle();
		
		System.out.println("Print number triangle --");
		
		
		//Cấu trúc tạo hàm:
		//[Access Modifier] [static] data-return-type name(){}
		
//		Access modifier
//		1. public: gọi ở class chứa nó và tất cả các class khác
//		2. private: chỉ được gọi ở class chứa nó
//		3. protected/none:  được gọi ở package chứa nó

//		[static]:
//		khi 1 hàm:
//			có từ khoá static: hàm được gọi trực tiếp từ class chứa nó
//			nếu không có -> tạo đối tượng của class -> gọi thông qua đối tượng
		
//		return_data_type: kiểu dữ liệu trả về
//		có 2 loại:
//			trả về kết quả (int, double, Stringm, ...): phải có 'return' trả về 1 dữ liệu của 1 type cụ thể
//			trả về void: không cần reuse kết quả
		
		//non-static:
		new Ex01TestMainMethod().printNumberTriangle();
	}
	
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
	}
	
	private static void printNumberTriangle() {
		for(int i = 1; i <= 5; i ++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
