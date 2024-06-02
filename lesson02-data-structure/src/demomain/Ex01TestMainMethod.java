package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	// chú thích trên 1 dòng
	/*
	 Comment - chú thích nhiều dòng
	 
	 	Ex01TestMainMethod: Java executable class
	 		+ data structure: khai báo dữ liệu
	 		+ method(function): khai báo chức năng
	 			--> special method: main
	 				--> là nơi bắt đầu và kết thúc của  1 chương trình
	 	* Lưu ý: Các hàm nằm tách biệt nhau --> kh được phép hàm chứa hàm 
	 				--> có thể hàm này gọi hàm kia
	 ------------------------------------------------------------------------
	 Cú pháp để tạo ra/khai báo một hàm(Xử lí chức năng)
	 [access modifier] [static] return_data_time method_name([...parameters]) {
	 	// statements
	 	// method_body
	 }
	 
	 workspace - project - package - class
	 
	 1. [access modifier] --> phạm vi truy cập
	 - 4 khả năng
	 	+ public: được phép gọi ở class hiện tại(chứa nó) cũng như bất kỳ class nào trong dự án
	 	+ private: được phép gọi ở class hiện tại(chứa nó)
	 	+ protected/none: được phép gọi ở class hiện tại(chứa nó) và các class khác nằm trong cùng package với class hiện tại
	 
	 2. [static] 
	 - Khi 1 hàm 
	 	+ có từ khóa static thì hàm có thể gọi trực tiếp từ class chứa nó
	 	+ nếu không có từ khóa static là hàm kh thể gọi trực tiếp từ class mà phải khởi tạo đối tượng từ class rồi mới gọi được
	 		// trick --> tạo đối tượng từ class để gọi nó (khoan dùng - chưa học)
	 		 ex: new Ex01TestMainMethod().printNumberTriangle(); --> gọi hàm non static
	 	+ Nếu gọi hàm x trong hàm y thuộc cùng 1 class --> kh cần lấy class gọi hàm, ghi tên
	 	
	 3. return_data_type: Kiểu dữ liệu trả về của hàm(phương thức)(function)(method)
	 - Có 2 loại 
	 	+ void: sau khi viết chức năng cho hàm xong, không cần phải lấy kết quả trả về
	 	 	  : không cần phải sử dụng là đầu vào cho các tác vụ khác
	 	+ !void (int, String, LoaDate, double)
	 			: sau khi xử lý xong cần lấy kết quả trả về để thực hiện các bước tiếp theo
	 			: bắt buộc cần phải có từ khóa "return" để trả về kết quả
	 			--> Ex: lấy ngàu tháng năm hiện tại --> được kq cộng thêm năm
	 			--> xem thử ngày này năm sau là ngày thứ mấy
	 
	 4. method_name: tên hàm, tên phương thức
	 - Đặt tên đại diện cho chức năng của hàm, thường là 1 [cụm] động từ
	 
	 5. ([...parameters]) - danh sách tham số truyền vào
	 - chỉ là phần khai báo, giá trị sẽ được truyền vào khi hàm được gọi
	 - trường hợp kh có tham số truyền vào --> ()
	 	ex: printNumberTriangle() --> kh có tham số truyền vào
	 	
	 6. {} - phần thực thi của hàm
	 	 
	 Phím tắt:
	 + ctrl d --> xóa 1 dòng
	 + ctrl / --> tạo chú thích 1 dòng
	 + ctrl shift / --> tạo chú thích nhiều dòng
	 + run code --> [fn] ctrl f11 --> chạy 1 phát ra luôn
	 + ctrl shift f --> format code(làm xấu comments)
	 + debug code - breakpoint
	 	--> dừng lại, xem được giá trị của từng dòng code, biến, hàm tại bất kỳ thời điểm nào
	 	--> được dùng rất nhiều trong dự án
	 */
	public static void main(String[] args) {
		 System.out.println("Welcome To Java23 Class");
		 System.out.println("Today is " + LocalDate.now());
		 System.out.println("Weekday this year --> " + LocalDate.now().getDayOfWeek());
		 System.out.println("Weekday next year --> " + LocalDate.now().plusYears(1).getDayOfWeek());
		 System.out.println("==== print star triangle ====");
		 printStarTriangle(); // gọi hàm
		 
		 System.out.println("==== print star triangle ====");
		 printStarTriangle(); // gọi hàm
		 
		 printNumberTriangle("==== print number triangle ===="); // gọi hàm static
	}
	// khai báo hàm tên là printStarTriangle
	// có chức năng in ra tam giác ngôi sao
	public static void printStarTriangle() {
		 System.out.println("*");
		 System.out.println("* *");
		 System.out.println("* * *");
		 System.out.println("* * * *");
		 System.out.println("* * * * *");
	}
	
	// khai báo hàm tên là printNumberTriangle
	// có chức năng in ra tam giác số
	private static void printNumberTriangle(String prefix) {
		System.out.println("prefix --> " + prefix);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
