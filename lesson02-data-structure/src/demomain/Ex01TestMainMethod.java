package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
	// chú thích trên 1 dòng
	/*
	  Comments nhiều dòng : /* Ctrl enter 
	  Ex01TestMainMethod: Java executable class
	   + data structure khai báo dữ liệu 
	   + method(function): khai báo chức năng 
	       -->special method: main 
	         --> là nơi bắt đầu và kết thúc 1 chương trình 
	         
	         
	  ctrl d xoa 1 dong 
	  ctrl / tao chu thich 1 dong 
	  ctrl shift / tao chu thich nhieu dong 
	  run ctrl f11
	  ----------------------------
	  
	  cú pháp để tạo ra/ khai báo một hàm 
	   [access modifier ] [static] return_data_typle method_name([...parameters]){
	     //statements
	     //method body
	    }
	    
	    1. [access modifier] phạm vi truy cập
	    - 4 khả năng
	       + public: được phép gọi ở class hiện tại cũng như bất kỳ class nào trong dự án 
	       + private: được phép gọi ở class hiện tại(class chứa nó)
	       + protectd/none: được phép gọi ở class hiện tại (chứa nó) và class khác nằm trong cùng package hiện tại
	    2. [static]
	    - khi 1 hàm
	      + có  từ khóa static thì có thể được gọi trực tiếp từ class chứa nó 
	      + nếu không có từ khóa static là hàm không gọi trực tiếp từ class mà phải khởi tạo đối tượng từ class
	      + gọi hàm x tỏng hàm y thuộc cùng 1 class --> không cần phải lấy class gọi hàm 
	    3. return_data_type: kiểu dữ liệu trả về của hàm(function) (phương thức) (method)
	     - có 2 loại 
	      + void: sau khi viết chức năng xử lý cho hàm xong, không cần lấy kết quả trả về
	             : ko cần phải reuse, sử dụng là đầu vào cho các tác vụ khác
	       +!void(int, String, LoadDate, double)
	             : sau khi xử lý xong cần lấy kết quả trả về đẻ thực hiện bước tiếp theo
	             : bắt buộc phải có từ khóa 'return' để trả về kết quả 
	             : VD lấy ngày tháng năm hiện tại --> được kq cộng thêm năm  
	                  --> xem thử ngày năm sau là ngày thứ mấy     
	    4. method_name: teen hàm, tên phương thức
	    - đặt tên đại diện cho chức năng của hàm, thường là động từ hoặc cụm động từ
	    
	    5. ([ .... parameters]) - danh sách tham số truyền vào
	    - chỉ là phần khai báo, giá trị sẽ được truyền vào khi hàm được gọi 
	    - trường không có tham số truyền vào 
	    6.{} phần thực thi
	    
	 */ 

	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");

		System.out.println("Today is " + LocalDate.now());
		System.out.println("Weekday next year --> " + LocalDate.now().getDayOfWeek());
		System.out.println("Weekday next year --> " + LocalDate.now().plusYears(1).getDayOfWeek());

		System.out.println("==== print star triangle ====");
		printStarTriangle(); // gọi hàm

		System.out.println("==== print star triangle ====");
		printStarTriangle();
		
		System.out.println("==== print number triangle ====");
//		Ex01TestMainMethod.printNumberTriangle();
		
	    printNumberTriangle("==== print number triangle ====");
		
//		new Ex01TestMainMethod().printNumberTriangle();
	}

//	khai báo hàm tên printStarTriangle
//  có chức năng in ra tam giác ngôi sao
	public static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}

//	khai báo hàm tên printNumberTriangle
//  có chức năng in ra tam giác số
	public static void printNumberTriangle(String prefix) {
		System.out.println("prefix -->" + prefix);
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
