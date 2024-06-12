package view;

import bean.Car;

public class Ex01BasicOopDemo {

	public static void main(String[] args) {
		// Car: model, name, color, price
		
		// Yêu cầu: Tạo ra 3 đối tượng Car có dữ liệu bất kỳ và in ra
		
		// Khi in biến là KDL đối tượng 
		// --> tự động gọi hàm toString của class Object
		// --> tên package.class@hash
		
		// Nếu muốn in ra giá trị của ô nhớ HEAP mà biến đối tượng đang trỏ đến
		// --> override hàm toString
		
		Car c1 = new Car("2022", "Audi", "Xám", 2000d);
		Car c2 = new Car("2023", "Audi", "Đen", 3000d);
		Car c3 = new Car("2024", "Audi", "Trắng", 4000d);
		
		// Cập nhật tên của xe c2 thành A22
		// Cập nhật giá của xe c3 thành 6000
		
		// c2.setName = "A22"; // c2.setName("A22");
		c2.setName("A22");
		// c3.price = 6000d;
		c3.setPrice(6000d);
		
		// Cập nhật gấp đôi giá bán cho xe c1
		// c1.price = c1.price * 2;
		// c1.setPrice(c1.getPrice() * 2);
		c1.doublePrice();
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		
		/**
		 FOP: data(no restriction, tất cả đều truy cập được, không phân quyền)
		 OOP: data(access modifier, mỗi class cần quản lí dữ liệu 'riêng' của nó)
		  Ex: Car: model, color, price
		  		Item: id, name, price
		 --> Vào class --> cho thuộc tính có access modifier --> private
		 --> quản lại thông tin riêng của từng đối tượng
		 
		 
		 Vấn đề
		 1. Các thuộc tính trong class Car đang để access modifier là 'public'
		 --> dùng ở đâu cũng được
		 
		 + Sử dụng private attribute để class bên ngoài không thể trung cập trực tiếp thuộc tính
		 bên trong class
		 
		 + Nhưng mình trong thực tế mình vẫn muốn class bên ngoài có thể lấy/cập nhật giá trị
		 cho các thuộc tính bên trong class
		 
		 Ex: Công ty
		 	 Nhân viên: Chứa tt private
		 	 
		 + setter --> cho phép cập nhật giá trị của thuộc tính private
		 + getter --> lấy giá trị của thuộc tính private
		 
		 Câu hỏi: Vì sao không cho các thuộc tính của Class là PUBLIC để truy cập dễ dàng
		 mà phải cho private rồi khai báo getter, setter để lấy/cập nhật giá trị
		 */
	}
}
