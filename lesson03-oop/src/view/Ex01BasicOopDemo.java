package view;

import bean.Car;

public class Ex01BasicOopDemo {
	
	public static void main(String[] args) {
		// Car: model, name, color, price
		
		// Yêu cầu: tạo 3 đối tượng Car có dữ liệu bất kỳ và in ra
		
		// Khi in biến là KDL đối tượng -> tự động gọi hàm toString của class Object
		//								-> tên package.class@hash
		
		// Nếu muốn in ra giá trị của ô nhớ HEAP mà biến đối tượng đang trỏ đến
		// --> override hàm toString
		
		Car car1 = new Car("A", "A1", "Yello", 2000d);
		Car car2 = new Car("A", "A2", "Red", 4000d);
		Car car3 = new Car("A", "A3", "Green", 3000d);
		
		// Cập nhật tên của xe c2 thành A22
		car2.setName("A22");
		// car2.name = "A22";
		
		// Cập nhật giá của xe c3 thành 6000
		car3.setPrice(6000d);
		
		// Cập nhật gấp đôi giá bán cho xe c1
		// car1.price = car1.price * 2;
		// car1.setPrice(car1.getPrice()*2);
		car1.doublePrice();
		
		System.out.println("c1 -> " + car1.toString());
		System.out.println("c2 -> " + car2.toString());
		System.out.println("c3 -> " + car3.toString());
		
		/*
		  FOP: data(no restriction, tất cả đều truy cập được, ko phân quyền)
		  OOP: data(access modified, mỗi class cần quản lý dữ liệu 'riêng' của nó)
		  	   VD: Car: model, color, price
		  	  	   Item: id, name, price
		  --> Class, cho thuộc tính có access modified thành private
		  	  quản lý riêng thông tin cho từng đối tượng
		  	  
		  Vấn đề
		  1. Các thuộc tính trong class Car đang để access modified là 'public'
		     --> dùng ở đâu cũng được
		     
		  + Sử dụng private attribute để các class bên ngoài ko thể truy cập trực tiếp thuộc tính bên trong class
		  
		  + Nhưng trong thực tế mình vẫn muốn class bên ngoài có thể lấy/cập nhật giá trị cho các thuộc tính bên trong class
		  
		  VD: Công ty
		  	  Nhân viên: chứa thông tin private
		  	  
		  + setter --> cho phép cập nhật giá trị của thuộc tính private
		  + getter --> lấy giá trị thuộc tính private
		  
		  Câu hỏi: Vì sao không cho thuộc tính class là public để truy cập dễ dàng
		  mà phải cho private rồi khai báo getter, setter để lấy/ cập nhật giá trị
		  
		 */
				
	}
}
