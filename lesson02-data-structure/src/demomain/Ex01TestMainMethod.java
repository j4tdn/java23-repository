package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	//chú thích trên 1 dòng
	/*
	 Comment - chú thích
	 
	 Ex01TestMainMethod: Java executable class
	 	+ data structure: khai báo dữ liệu
	 	+ method(function): khai báo chức năng
	 	  --> special method: main
	 	      --> là nơi bắt đầu và kết thúc của một chương trình	
	 	  --> các hàm nằm tách biệt nhau
	 	  --> ko được phép hàm chứa hàm
	 	  --> có thể hàm này gọi hàm kia
	 	  
	 -------------------------------------------------------
	 Cú pháp để tạo ra/khai báo một hàm (xử lý 1 chức năng)
	 [access modifier] [static] return_data_type method_name([... parameters]){
	 	//statements
	 	//method body
	 }
	 
	 workspace -> project -> package -> class
	 1. [access modifier] phạm vi truy cập
	 - 4 khả năng:
	   + public: được phép gọi ở class hiện tại(chứa nó) và các class khác
	   + protected/none: được phép gọi ở class hiện tại(chứa nó) và các class khác. 
	   + private: được phép gọi ở class hiện tại(chứa nó)
	   
	 2. [static]
	 - khi 1 hàm
	   + có từ khóa static thì hàm có thể được gọi trực tiếp từ class chứ nó
	   + nếu không có từ khóa static là hàm ko thể gọi trực tiếp từ class mà phải
	   + gọi hàm x trong hàm y thuộc cùng 1 class --> k cần phải lất class giọ hàm,
	   
	 3. return_data_type: kiểu dữ liệu trả về của hàm(function)(phương thức)(method)
	 - có 2 loại:
	 + void: sau khi viết chức năng xử lý cho hàm xong, không cần phải lấy kết quả
	       : ko cần phải sử dụng là đầu vào các tác vụ khác
	 + !void(int, String, LoadDate, double)
	 	   : sau khi xử lí xong cần lấy kết quả trả về để thực hiện các bước tiếp
	 	   : bắt buộc phải có từ khóa 'return' để trả về kết quả
	 	   : VD: lấy ngày tháng năm hiện tại --> được kq cộng thêm
	 	   		 --> xem thử ngày này năm sau là ngày thứ mấy
	 	   		 
	 4. method_name: tên hàm, tên phương thức
	 - đặt tên đại diện cho chức năng của hàm, thường là 1 [cụm]động từ
	 
	 5. ([... parameters]) - danh sách tham số truyền vào
	 - chỉ là phần khai báo, giá trị sẽ được truyền vào khi hàm được gọi
	 - trường hợp ko có tham số tham truyền vào --> ()
	 VD: printStarTriangle() --> k có tham số truyền vào
	 
	 6. {} - phần thực thi
	 
	 
	 Phím tắt
	 + ctrl d --> xóa 1 dòng
	 + ctrl / --> tạo chú thích 1 dòng
	 + ctrl shift / --> tạo chú thích nhiều dòng
	 + run code --> [fn] ctrl f11
	 + ctrl shift f --> format code (làm xấu comment)
	 
	 + debug code - breakpoint
	 --> dùng lại xem giá trị của từng dòng code, biến, hàm tại bất ky thời điểm nào
	 --> dùng nhiều trong dự án
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is " + LocalDate.now());
		
		System.out.println("==== print star triangle ====");
		printStarTriangle(); // gọi hàm
		
		System.out.println("==== print star triangle ====");
		printStarTriangle(); // gọi hàm
		
		
		printNumberTriangle("==== print number triangle ===="); // gọi hàm static
		
		// trick --> tạo đối tượng từ class để gọi nó
		// khoan dùng(chưa học) --> hiện tại hầu hết cứ tạo static method để xử lý
		// khi nào dùng non-static
		// new Ex01TestMainMethod().printNumberTriangle(); // gọi hàm non static

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
		System.out.println(prefix);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
	
}
