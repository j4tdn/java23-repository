package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	// chú thích trên 1 dòng
	/*
	 Comment - chú thích
	 
	 Ex01TestMainMethod:Java executable class
	 	+ data structure: khai báo dữ liệu
	 	+ method(function):khai báo chức năng
	 		--> special method: main
	 			-->là nơi bắt đầu và kết thúc của một chương trình
	
	 			-----------------------------------------------------------
	 Cú pháp để tạo ra/khai báo một hàm(xử lý chức năng)
		[access modifier] [static] return_data_type method name([.....parameters]) {
			// statements
			// method body
			
		}
		workspace - project - package - class
		1. [access modifier] phạm vi truy cập
		- 4 khả năng
			+public: được phép gọi ở class hiện tại cũng như bất kì class nào trong dự án
			+private: được phép gọi ở class hiện tại (chứa nó)
			protected/none: được phép gọi ở class hiện tại (chứa nó) và các class khác nằm cùng package với class hiện tại
		2. [static]
		- khi 1 hàm
			+ có từ khóa static thì hàm có thể trực tiếp từ class chứa nó
			+ nếu không có từ khóa static là hàm không thể gọi trực tiếp từ class mà khởi tạo đối tượng từ class rồi mới gọi được
			+ gọi hàm x trong hàm y thuộc cùng 1 class --> k cần phải lấy class gọi hàm
			
		3. return_data_type:kiểu dữ liệu trả về của hàm(phương thức) (function)
		- có 2 loại 
		+ void: sau khi viết chức năng xử lý, không cần lấy kết quả trả về
			:ko cần phải sử dụng là đầu vào cho các tác vụ khác
		+!void(int,String, LoadDate, double)
			:sau khi xử lý xong  cần lấy kết quả trả về đẻ thực hiện các bước tiếp theo
			:Bắt buộc phải có từ khóa 'return' để trả về kết quả
			:VD :lấy ngày tháng năm hiện tại --> được kq công thêm năm
				--> xem thử ngày này năm sau là ngày thứ mấy
				
		4. method_name: tên hàm, tên phương thức
		- đặt tên đại diện cho chức năng của hàm, thường là 1[cụm]động từ
		
		5.([... parameters]) danh sách tham số truyền vào
		- chỉ là phần khai báo, giá trị sẽ được truyền vào khi hàm được gọi
		
		6.{} - ]phần thực thi 
		 
		
	 Phím tắt
	 + ctrl d --> xóa 1 dòng
	 + ctrl / --> tạo chú thích 1 dòng
	 + ctrl shift / -->tạo chú thích nhiều dòng
	 + run code --> ctrl + f11
	 + ctrl shift f --> format code (làm xấu comment)
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is " + LocalDate.now());
		System.out.println("Weekday this year --> " + LocalDate.now().getDayOfWeek());
		System.out.println("Weekday next year --> " + LocalDate.now().plusYears(1).getDayOfWeek());
		
		System.out.println("==== print star triangle ====");
		printStarTriangle();//gọi hàm
		
		System.out.println("==== print star triangle ====");
		printStarTriangle();//gọi hàm
		
		System.out.println("==== print number triangle ====");
		printNumberTriangle("==== print number triangle ====");//gọi hàm
		
		//trick --> tạo đối tượng từ class để gọi nó
		// khoan dùng (chưa học) --> hiện tại cứ tạo static method để xử lý
		//new Ex01TestMainMethod().xprintNumberTriangle();
	}
	// khai báo tên hàm là printStarTriangle
	// có chức năng in ra tam giác ngôi sao
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");

	}
	// khai báo tên hàm là printNumberTriangle
	// có chức năng là in ra tam giác số
	private static void printNumberTriangle(String prefix) {
		System.out.println("prefix --> " + prefix);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
	