package demomain;

import java.time.LocalDateTime;

public class Ex01TestMainMethod {

	//chú thích 1 dòng
	/*chú thích nhiều dòng
	 * 
	 ------ COMMENT -----
	 -->special method: main  là nơi bắt đầu và kết thúc của 1 chương trình
	 
	 Phím tắt
	 + ctrl d --> Xóa 1 dòng
	 + ctrl shift / tạo chú thích nhiều dòng
	 + run ctrl f11
	 + ctrl shift f --> format code
	 
	 ------------- Cú Pháp khai báo hàm ---------------------
	  [access modifier] [static] return_data_type method_name ([...parmeters]){
	  	//statements
	  	//method body
	  }
	  1. [access modifier] phạm vi truy cập (4 khả năng)
	  	+ public: được phép sử dụng hay gọi ở class hiện tại hay class khác bất kì trong dự án
	  	+ private: chỉ dc phép gọi ở class chứa nó
	  	+ protected/none: dc phép gọi ở class hiện tại và class khác nằm trong cùng package
	 2.  [static]
	 	- khi 1 hàm có khai báo static thì có thể gọi trực tiếp từ class chứa nó
	 	- nếu ko khai báo từ kháo static thì phải khởi tạo đối tượng 
	 	- gọi hàm x trong hàm y trong cùng 1 class thì ko cần phải lấy class gọi hàm lại lần nữa
	 
	 3.  return_data_type:kiểu dữ liệu trả về của hàm
	 	+ void : ko có giá trị trả về
	 	+ !void:(int, String, LoadDate, double): sau khi sử lý cần các kết quả trả về bắc buộc phải return
	 4.  method_name:  tên hàm, tênphương thức
	 	+ động từ hoặc cụm động từ
	 	
	 5.  ([...parmeters])
	 	- là phần khai báo giá trị truyền vào khi hàm dc gọi
	 	
	 	
	 6. {} : phần thực thi
	 */
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Java23 Class");
		System.out.println("Today is" + LocalDateTime.now());
		System.out.println("Weekday next year -->" +LocalDateTime.now().getDayOfWeek());
		System.out.println("Weekday next year -->" +LocalDateTime.now().plusYears(1).getDayOfWeek());
		printStarTriangle();
		new Ex01TestMainMethod() .printNumTriangle(); //gọi hàm non-static (khởi tạo đôi tượng)
		
	}

	public static void printStarTriangle() {
		System.out.println("\n==== Print Star Triangle ====");
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * * ");
		System.out.println("* * * *");
		System.out.println("* * * * *");
		
	}
	
	public void printNumTriangle() {
		System.out.println("\n==== Print Star Triangle ====");
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3 ");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
		
	}
}
