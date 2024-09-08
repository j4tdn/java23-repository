package view;

import bean.Car;

public class Ex01BasicOopDemo {
	
	public static void main(String[] args) {
		// Car: model, name, color, price
		
		// Yêu cầu: Tạo 3 đối tượng Car có dữ liệu bất kỳ và in ra
		
		// Khi in biến là KDL đối tượng -> tự động gọi hàm toString của class Object
		//								-> tên package.class@hash
		
		// Nếu muốn in ra giá trị của ô nhớ ở HEAP mà biến đối tượng đang trỏ đến
		// --> overide hàm toString
		
		Car c1 = new Car("A", "A1", "Yellow", 2000d);
		Car c2 = new Car("A", "A2", "Red", 4000d);
		Car c3 = new Car("A", "A3", "Green", 3000d);
		
		// Cập nhập tên của xe c2 thành A22
		// Cập nhập giá của xe c3 thành 6000
		
		// c2.name = "A22"; // c2.setName("A22")
		c2.setName("A22");
		//c3.price = 6000d;
		c3.setPrice(6000d);
		
		// Cập nhập gấp đôi giá bán cho xe c1
		// c1.price = c1.price * 2;
		// c1.setPrice(c1.getPrice() * 2);
		c1.doublePrice();
		
		System.out.println("c1--> " + c1.toString());
		System.out.println("c2--> " + c2.toString());
		System.out.println("c3--> " + c3.toString());
		
		/*
		 FOP: data(no restriction, tất cả đều truy cập được, ko phân quyền)
		 OOP: data(access modifier, mỗi class cần quản lý dữ liệu riêng của nó)
		 	VD: Car: model, color, price
		 		Item: id,name,price
		 --> class, cho thuộc tính có access modifier thành private
		 	 quản lý riêng thông tin cho từng đối tượng
		 
		 Vấn đề
		 1. Các thuộc tính trong class Car đang để access modifier là 'public'
		 	--> dùng ở đâu cũng được
		 
		 + sử dụng private attribute để các class bên ngoài không thể truy cập trực tiếp thuộc tính bên trong class
		 
		 + nhưng mình trong thực tế mình vẫn muốn class bên ngoài có thể lấy/cập nhập giá trị
		   cho các thuộc tính bên trong class
		 
		 VD: Công ty
		   	 Nhân viên: chứa tt private
		   
		 + setter --> cho phép cập nhập giá trị của thuộc tính private
		 + getter --> lấy giá trị của thuộc tính private
		 
		 Câu hỏi: Vì sao không cho các thuộc tính của Class là public để truy cập dễ dàng
		 mà phải cho private rồi khai báo getter, setter để lấy/cập nhập giá trị
		 */
	}
}

	