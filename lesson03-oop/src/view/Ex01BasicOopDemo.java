package view;

import bean.Car;

public class Ex01BasicOopDemo {
	public static void main(String[] args) {
		//  Yêu cầu tạo 3 đối tượng Car có KDL bất kì và in ra
		
		Car c1= new Car("A", "A1", "Yellow", 2000d);
		Car c2= new Car("A", "A2", "Red", 4000d);
		Car c3= new Car("A", "A3", "Green", 3000d);
		
		// Cập nhật tên của xe c2 thành A22
		// Cập nhật giá của xe c3 thành 6000
//		c2.name = "A22";
//		c3.price = 6000d;
		
		c2.setName("A22");
		c3.setPrice(6000d);
		// Cập nhật gấp đôi giá bán cho xe c1
//		c1.price = c1.price*2;
//		c1.setPrice(c1.getPrice()*2);
		c1.doublePrice(); // gấp đôi giá trị
		
		// Khi in biến KDL đối tượng --> tự động gọi hàm toString của class Object
		// --> Override hàm toString  là định nghĩa lại

		System.out.println("C1 --> " + c1);
		System.out.println("C2 --> " + c2);
		System.out.println("C3 --> " + c3);
		
		
		/*
		  	Vấn để:
		  	1. Các thuộc tính trong class Car đang để access modifier là 'public'
		  		--> dùng ở đâu cũng dc
		  		+ Sử dụng private attribute để các class bên ngoài ko thể truy cập trực tiếp đến các thuộc tính bên trong class
		  		+ nhưng mình vẫn muốn class bên ngoiaf có thể lấy giá trị/ cập nhật giá trị cho các thuộc tính bên trong class
		 		VD: Công ty
		 			Nhân vieenL chứa tt private
		 			
		 		+ setter --> cho phép cập nhật giá trị của thuộc tính private
		 		+ getter --> lấy giá trị của thuộc tính private
		 	Câu hỏi: Vì sao ko cho các thuộc tính trong Class là public để truy cập dễ dàng mà phải cho private rồi khai báo getter, setter để lấy/cập nhật giá trị ?  
		 		-->	Để tuân theo nguyên tắc OOP:
		 			- Nếu để public thì dùng mọi nơi thì ko khác gì FOP
		 			- Còn OOP thì nhiều class và cần phân quyền thì dùng private 
		 			+ Khi muốn lấy dùng thì dùng getter, setter 
		 */

	}
	
	
	
}
