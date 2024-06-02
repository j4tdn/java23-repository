package demomain;

import java.time.LocalDate;

public class Ex01TextMainMethod {
	// chú thích trên 1 dòng
	/*
	 Comment - chú thích
	 
	 Ex01TestMainMethod: Java executable class
	 	+ data structure: khai báo dữ liệu
	 	+ method(function): khai báo chức năng
	 	  --> special method
	 	  	--> là nơi bắt đầu và kết thúc 1 chương trình
	 
	 --------------------------------------------
	 Cú pháp để tạo ra/ khai báo 1 hàm(xử lý 1 chức năng)
	 [access modifier] [static] return_data_type method_name([... parameters]) {
	 	// statements
	 	// method body
	 }
	 
	 workspace - project - package - class
	 
	 1. [access modifier] phạm vi truy cập
	 - 4 khả năng
	   + public: được phép gọi ở class hiện tại cũng như bất kỳ class nào trong dự án
	   + private: được phép gọi ở class hiện tại(chứa nó)
	   + protected/none: được phép gọi ở class hiện tại(chứa nó) và các class khác nằm trong cùng package với class hiện tại
	   
	  2. [static]
	  - khi 1 hàm 
	  	+ có khai báo từ khóa static thì có thể lấy tên class chứa nó gọi đến hàm static
	  	+ ko có từ khóa static: hàm ko thể gọi trực tiếp từ class mà khởi tạo từ class rồi mới gọi được
	  	
	  3. 
	 
	 ---------------------------------------------
	 
	 Phím tắt
	 + ctrl d --> xóa 1 dòng
	 + ctrl / --> tạo chú thích 1 dòng
	 + ctrl shift / --> tạo chú thích nhiều dòng
	 + run code --> [fn] ctrl F11
	 + ctrl shift F --> format code (làm xấu comment)
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome to Java23 Class");
		System.out.println("Today is " + LocalDate.now());
		System.out.println("Weekday next year --> "+ LocalDate.now().getDayOfWeek());
		System.out.println("Weekday next year --> "+ LocalDate.now().plusYears(1).getDayOfWeek());
		printStarTriangle();
		
		printNumberTriangle("====== print number triangle =======");
	}
	
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	
	public static void printNumberTriangle(String prefix) {
		System.out.println(prefix);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
