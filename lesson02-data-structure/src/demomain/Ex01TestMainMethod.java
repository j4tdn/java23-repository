package demomain;

import java.time.LocalDate;

public class Ex01TestMainMethod {
  // chú thích trên 1 dòng 
  /*
	 Comment - chú thích
	 
	 Ex01TestMainMothod: Java executable class
	      + data structure: khai báo dữ liệu 
	      + method(function): khai báo chức năng
	        -->special method: main
	           --> là nơi bắt đầu và kết thúc của một chương trình
	        --> các hàm nằm tách biệt nhau 
	        --> không được phép hàm chứa hàm 
	        --> có thể hàm này goị hàm kia
	---------------------------------------------------
	  cú pháp để tạo ra/khai báo hàm(xử lí 1 chức năng)
	  [access modifier] [ static] return_data_type method_name([......parameters]) {
	    //statements
	    //method body
	  } 
	  
	  workspace - project - packager - class 
	  
	  1. [access modifier] phạm vi truy cập 
	  - 4 khả năng 
	    + public: dược phép gọi ở class hiện tại (chứa nó) cũng như bất kì class nào khác 
	    + private: được phép gọi ở class hiện tại ( chứa nó )
	    + protected/none: được phép gọi ở class hiện tại (chứa nó) và các class khác 
      
      2. [static]
      khi 1 hàm
      - có khai báo từ static thì hàm có thể được gọi trực tiếp từ class chứa nó
      - nếu k có từ khóa static là hàm không thề gọi trực tiếp từ class mà phải tạo đối tượng từ class rồi mới gọi được 
      - nếu gọi 1 hàm x trong hàm y thuộc cùng 1 class --> k phải lấy class gọi hàm 
      
      3. return_data_type: kiểu dữ liệu trả về của hàm(function)(phương thức)(method)
      -có 2 loại:
      +void: sau khi xử lí viết chức năng xừ lí cho hàm xong k cần phải lấy kết quả trả về 
           : k cần phải sử dụng là đầu vào cho các tác vụ khác 
      + ivoid(int, string, localdate, double)
           : sau khi xử lí xong cần lấy kết quả trả về để thực hiện các bước tiếp theo 
           : bắt buộc phải cs từ khóa "return" để trả về kết quả
           : vd: lấy ngày tháng năm hiện tại --> được kq công thêm 1 năm 
              --> xem thử ngày này năm sau ngày thứ mấy 
              
      4. metod_name: tên hàm , tên phương thức
      - đặt tên đại diện cho hàm , thường là 1 [cụm] động từ 
      
      5.([....parameters]) - danh sách tham số truyền vào
      - chỉ là phần khai báo, giá trị sẽ được truyền vào khi hàm đc gọi 
      
       6. {} - phần thực thi của hàm 
      
      phím tắt
      + ctrl d --> xóa 1 dòng 
      + ctrl / --> tạo chú thích 1 dòng 
      + ctrl shift /  --> tạo chú thích nhiều dòng 
      + run code --> [fn] ctrl f11 --> chạy 1 phát xong luôn 
      + ctrl shift f --> format code( làm xấu comment)\
      
      + debug code - breakpoint
       --> dùng lại xem giá trị của từng dòng code, biến, hàm bất kì thời điểm nào 
       --> dùng nhiều trong dự án 
	      */
	
	public static void main(String[] args) {
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is " + LocalDate.now());
		System.out.println("Weekday this year --> " + LocalDate.now().getDayOfWeek());
		System.out.println("Weekday next year --> " + LocalDate.now().plusYears(1).getDayOfWeek());
		

		System.out.println("=== print static triangle ===");
	    printStarTriangle();// gọi hàm 
		
		System.out.println("=== print static triangle ===");
	    printStarTriangle();// gọi hàm 
		
		
	    printNumnerTriangle("=== print number triangle ==="); // gọi hàm
		
		//trịck --> tạo đối tượng từ class để gọi nó 
		//khoan dùng chưa học --> hiện tại hầu hết cứ tạo static method để xử lí 
		//new Ex01TestMainMethod().printNumberTriangle(); //gọi hàm non static
		
    }
	 
	// khai báo hàm tên là  printStarTriangle
	 // có chức năng in ra tam giác ngôi sao
   public static void printStarTriangle() {
	   System.out.println("*");
	   System.out.println("* *");
	   System.out.println("* * *");
	   System.out.println("* * * *");
	   System.out.println("* * * * *");
   }
      // khai báo hàm tên là  printNumberTriangle
	 // có chức năng in ra tam giác số
   public static void printNumnerTriangle(String prefix ) {
	   System.out.println("predix --> " + prefix);
	   System.out.println("1");
	   System.out.println("1 2");
	   System.out.println("1 2 3");
	   System.out.println("1 2 3 4");
	   System.out.println("1 2 3 4 5");
   }

   public static void printNumberTriangle() {
	// TODO Auto-generated method stub
	
  }
}
