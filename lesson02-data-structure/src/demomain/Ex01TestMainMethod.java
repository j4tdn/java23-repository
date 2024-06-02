package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	/*
	 Cú pháp để tạo ra/khai báo 1 hàm(xử lý 1 chức năng)
	 [access modifier] [static] return_data_type method_name([... parameters]) {
	 	// statements
	 	// method body
	 }
	 
	 1. [access modifier] phạm vi truy cập
	 	- 4 khả năng
	 		+ public: được phép gọi ở class hiện tại (chứa nó) cũng như bất kì class nào trong dự án
	 		+ private: được phép gọi ở class hiện tại (chứa nó)
	 		+ protected/none: được phép gọi ở class hiện tại (chứa nó) và các class khác nằm cùng package với class hiện tại
	 2. [static] 
	 	- khi 1 hàm 
	 		+ có khai báo từ khóa static thì hàm có thể đc gọi trưc tiếp từ class chứa nó
	 		+ nếu ko có từ khóa static là hàm ko thể gọi trực tiếp từ class mà phải khởi tạo đối tượng từ classr mới gọi 
	 		+ gọi hàm x trong hàm y thuộc cùng 1 class --? ko cần phải lấy class gọi hàm, ghi tên hàm trực tiếp
	 3. return_data_type: kiểu dữ liệu trả về của hàm (function) (phương thức) (method)
	 	- có 2 loại
	 		+ void: sau khi viết chức năng xử lý cho hàm xong, ko cần phải lấy kq trả về 
	 				ko cần phải sử dụng là đầu vào cho các tác vụ khác
	 		+ !void (int, String, LoadDate, double) 
	 				sau khi xử lý xong cần lấy kq trả về để thực hiện các bước tiếp theo
	 				bắt buộc phải có từ khóa 'return' để trả về kq
	 				vd: lấy ngày tháng năm hiện tại --> được kq cộng thêm năm
	 					--> xem thử ngày này năm sau là ngày thứ mấy
	 4. method_name: tên hàm, tên phương thức
	 	- đặt tên đại diện cho chức năng của hàm, thường là 1 (cụm) động từ
	 5. ([... parameters]) - danh sách tham số truyền vào
	 	- chỉ là phần khai báo, giá trị sẽ được truyền vào khi hàm được gọi
	 	- trường hợp ko có tham số truyền vào --> (
	 	vd: printNumberTriangle() ko có tham số truyền vào
	 	)
	 6. {} - phần thực thi
	 
	 phím tắt
	 	ctrl d: xóa 1 dòng
	 	ctrl /: tạo chú thích 1 dòng
	 	ctrl shift /: tạo chú thích nhiều dòng
	 	run code: (fn) ctrl f11
	 	bôi đen + ctrl shift f: format code
	 */
	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is " + LocalDate.now());
		System.out.println("Weekday this year --> " + LocalDate.now().getDayOfWeek());
		System.out.println("Weekday next year --> " + LocalDate.now().plusYears(1).getDayOfWeek());
		
		System.out.println("==== print star triangle ====");
		Ex01TestMainMethod.printStarTriangle(); //gọi hàm
		
		System.out.println("==== print star triangle ====");
		Ex01TestMainMethod.printStarTriangle(); //gọi hàm
		
		System.out.println("==== print number triangle ====");
		Ex01TestMainMethod.printNumberTriangle(); //gọi hàm static
		
		//trick: tạo đối tượng từ class để gọi nó
		//khoan dùng (chưa học) --> hiện tại hầu hết cứ tạo static để xử lý
		//new Ex01TestMainMethod().printNumberTriangle(); //gọi hàm non static
	}
	
	//khai báo hàm tên là printStarTriangle
	//có chức năng in ra tam giác ngôi sao
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}

	// khai báo hàm tên là printNumberTriangle
	// có chức năng in ra tam giác số
	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
