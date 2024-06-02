package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	// Chú thích trên một dòng
	/*
	 * Comment - Chú thích nhiều dòng
	 * Ex01TestMainMethod: Java executable class
	 * 		+ data structure: khai báo dữ liệu
	 * 		+ method(function): khai báo chức năng
	 * 			--> special method: main
	 * 			 --> nơi bắt đầu và kết thúc một chương trình
	 * 			--> Các hàm nằm tách biệt nhau
	 * 			--> hàm không được chứa hám
	 * 			--> nhưng có thể hàm gọi hàm
	 * 
	 * -----------------------------------------------------------------
	 * Cú pháp để khai báo một hàm (xử lý 1 chức năng)
	 * [access modifier] [static] return_data_type method_name ([... parameters]) {
	 * 		// statements
	 * 		// method body
	 * }
	 * 
	 * workspace - project - package - class
	 * 
	 * 1. [access modifier]: phạm vi truy cập
	 * 	- 4 khả năng:
	 * 	 + public: được phép gọi ở class hiện tại cũng như bất kỳ class nào trong dự án
	 * 	 + private: được phép gọi ở class hiện tại (class chứa nó)
	 * 	 + protected/none: được phép gọi ở class hiện tại và các class khác nằm cùng package với class hiện tại
	 * 
	 * 2. [static]
	 * 	- khi 1 hàm 
	 * 	 + có khai báo từ khóa static thì hàm có thể được gọi trực tiếp từ class chứa nó
	 * 	 + nếu không có từ khóa static là hàm không thể gọi trực tiếp từ class mà phải khởi tạo đối tượng từ class rồi mới gọi được
	 * 	 + gọi hàm x trong hàm y thuộc cùng 1 class thì không cần phải lấy class gọi hàm mà có thể ghi trên hàm trực tiếp
	 * 
	 * 3. return_data_type: kiểu dữ liệu trả về của hàm(phương thức)
	 *  - có 2 loại
	 *   + void: sau khi viết chức năng xử ký cho hàm xong, không cần lấy kết quả trả về
	 *   		 không cần sử dụng làm đầu vào cho các tác vụ khác
	 *   + !void(int, String, LocalDate, double)
	 *   	   : say khi xử lý xong cần lấy kết quả trả về để thực hiện các bước tiếp theo
	 *   	   : bắt buộc phải có tử khóa `return` để trả về kết quả.
	 *   	   : vd: lấy ngày tháng năm hiện tại --> được kết quả cộng thêm 1 năm
	 *   			--> xem thử ngày này năm sau là ngày thứ mấy
	 * 4. method_name: tên hàm, tên phương thức
	 * 	- đặt tên đại diện cho chức năng của hàm, thường là 1 [cụm] động từ
	 * 
	 * 5. ([... parameters]) - danh sách tham số truyền vào
	 * 	- chỉ là phần khai báo, giá trị sẽ được truyền vào khi hàm được gọi
	 *  - trường hợp không có tham số -> ()
	 *  VD: printStarTriangle()
	 * 
	 * 6. {} - phần thực thi
	 * 
	 * Phím tắt:
	 * 	+ ctrl d -> xóa một dòng
	 *  + ctrl / -> tạo chú thích một dòng
	 *  + ctrl shift / -> tạo chú thích nhiều dòng
	 *  + run code -> ctrl F11 --> chạy 1 phát xong luôn
	 *  + ctrl shift f -> format code (làm xấu comment)
	 *  
	 *  + debug code - breakpoint
	 *  --> có thể dừng lại để xem lại giá trị của từng dòng code, biến, hàm tại bất kì thời điểm nào
	 *  --> dùng nhiều trong dự án
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is: " + LocalDate.now());
		System.out.println("Weekday next year -->" + LocalDate.now().getDayOfWeek());
		System.out.println("Weekday next year -->" + LocalDate.now().plusYears(1).getDayOfWeek());
		
		System.out.println("==== print star triangle ====");
		Ex01TestMainMethod.printStarTriangle(); // gọi hàm
		
		System.out.println("==== print star triangle ====");
		printStarTriangle(); // gọi hàm
		
		System.out.println("==== print number triangle ====");
		printNumberTriangle("==== print number triangle ===="); //gọi hàm
		
		// trick: tạo đối tượng từ class để gọi nó
		// khoan dùng(chưa học) -- hiện tại hầu hết cứ tạo static method dể xử lý
		// new Ex01TestMainMethod().printNumberTriangle(); // gọi hàm non-static
	}
	// Khai báo hàm tên là printStarTriangle
	// có chức năng in ra tam giác ngôi sao
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
	}
	
	// Khai báo hàm tên là printNumberTriangle
	// có chức năng in ra tam giác số
	public static void printNumberTriangle(String prefix) {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}

}
