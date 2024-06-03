package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		//chú thích 1 dòng
		/*
		 * chú 
		 * thích
		 * nhiều
		 * dòng
		 *  ctrl d -> xoá 1 dòng
		 *  ctrl / -> tạo chú thích
		 *  ctrl shift / -> tạo chú thích nhiều dòng
		 *  
		 *  ----------------------------------------
		 *   [access modifier] [static] return_data_type method_name([... parameters]) {
		 *   	statements
		 *   	method body
		 *   }
		 *   	workspace - project - package - class
		 *   1. [access modifier] phạm vi truy cập
		 *    - 4 khả năng 
		 *     + public: được phép gọi ở class hiện tại cũng như bất kỳ class nào trong dự án
		 *     + private: được phép gọi ở class hiện tại (chứa nó)
		 *     + protected/none: được phép gọi ở class hiện tại(chứa nó) và các class khác thuộc cùng package
		 *     
		 *    2. [static]
		 *     - khi 1 hàm có khai báo từ khoá static thì có thể lấy tên class chứa nó 
		 *     gọi đến hàm static
		 *     - nếu không có từ khoá static là hàm không thể gọi trực tiếp từ class mà phải được khởi tạo đối tượng từ class mới gọi được
		 *     - gọi hàm x trong hàm y thuộc cùng 1 class ->> không cần phải lấy class gọi hàm
		 *     
		 *     3. return_data_type: kiểu dữ liệu trả về của hàm (phương thức)
		 *      - có 2 loại
		 *       + void: sau khi viết chức năng xử lý cho hàm xong, không cần phải lấy kết quả trả về
		 *           : ko cần phải sử dụng là đầu vào cho các tác vụ khác
		 *       + !void(int, String, LoadDate, double)
		 *           : sau khi xử lý xong cần lấy kết quả trả về để thực hiện các bước tiếp theo
		 *           : bắt buộc phải có từ khoá 'return' để trả về kết quả
		 *           : VD: lấy ngày tháng năm hiện tại -> được kq cộng thêm năm
		 *               -> xem thử ngày này năm sau là ngày thứ mấy   
		 *                
		 *     4. method_name: tên hàm, tên phương thức
		 *      - đặt tên đại diện cho chức năng của hàm, thường là [cụm] động từ
		 *      
		 *     5. ([...parameter]) - dnah sách tham số truyền vào
		 *      - chỉ là phần khai báo, giá trị sẽ được truyền vào khi hàm được gọi
		 *      - trường hợp không có tham số truyền vào --> ()
		 *      vd: printStarTriangle() ===> k có tham số truyền vào
		 *      
		 *     6. {}: phần thực thi
		 *     
		 *     debug code:
		 *      --> dùng lại xem giá trị của từng dòng code, biến, hàm tại anytime
		 *      --> dùng nhiều trong dự án
		 *      
		 *      
		 */
		System.out.println("Welcome to java23");
		System.out.println("Today is "+ LocalDate.now());
		System.out.println("weekday this year -->" + LocalDate.now().getDayOfWeek());
		System.out.println("weekday next year ---> " + LocalDate.now().plusYears(1).getDayOfWeek());
		System.out.println("=== print star triangle ===");
		printStarTriangle(); // gọi hàm

		System.out.println("=== print star triangle ===");
		printStarTriangle();// gọi hàm
		
		printNumberTriangle("=== print number triangle ===");// gọi hàm
	}
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
		System.out.println("* * * * * *");
	}
	
	//khai báo hàm tên là printNumberTriangle
	// có chức năng in ra tam giác số
	private static void printNumberTriangle(String prefix) {
		System.out.println("prefix --> "+ prefix);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
		System.out.println("1 2 3 4 5 6");
	}
	
}
