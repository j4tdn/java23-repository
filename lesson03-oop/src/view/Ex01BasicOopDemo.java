package view;

import bean.Car;

public class Ex01BasicOopDemo {
	public static void main(String[] args) {
		// Car: model, name, color, price
		// Yêu cầu: tạo 3 đối tượng Car có dữ liệu bất kỳ và in ra
		
		Car c1 = new Car("A1", "Huyndai", "Red", 595.55d);
		Car c2 = new Car("B1", "Toyota", "Blue", 422.55d);
		Car c3 = new Car("C1", "Kia", "Green", 585.55d);
		System.out.println(c1.toString());
		System.out.println(c3.toString());
		System.out.println(c2.toString());
		c1.setPrice(456789d);
		System.out.println(c1);
		c2.doublePrice();
		System.out.println(c2);   
		
		/*
		 FOP: data( no restriction, tất cả đều truy cập được, ko phân quyền)
		 OOP: data( access modifier, mỗi class cần quản lý dữ liệu 'riêng' của nó)
		 	VD: Car: model, color, price,...
		 		Item: id, name, price,...
		 	--> class, cho thuộc tính có access modifier thành private
		 		quản lý riêng thông tin cho từng đối tượng
		
		Vấn đề:
		1. Các thuộc tính trong class Car đang để access modifier là 'public'
			-> dùng ở đâu cũng được
		 + Sử dụng private attribute để class bên ngoài k thể truy cập trực tiếp đến thuộc tính bên trong class
		 
		 + Nhưng trong thực tế, vẫn muốn class bên ngoài có thể lấy/ cập nhật giá trị cho thuộc tính trong class
		 
		 VD: Công ty
		 	 Nhân viên: chứa thông tin private
		 	 
		 	 + setter --> cho phép cập nhật giá trị của thuộc tính private
		 	 + getter --> lấy giá trị của thuộc tính private
		 	
		 Câu hỏi: Vì sao không cho các thuộc tính của Class là public để truy cập dễ dàng
		 mà phải cho private rồi khai báo getter, setter để lấy/ cập nhật giá trị
		 
		 Trả lời: Nếu như cho các thuộc tính trong class là public- không có bất kỳ hạn chế nào
		 -> dùng được bất kỳ mọi nơi -> không khác gì so với FOP 
		 --> OOP: hệ thống gồm nhiều đối tượng, lớp, mỗi class quản lý thuộc tính riêng của nó 
				  -> set thuộc tính private
				  Nhưng trong thực tế: cần phải cập nhật/ lấy giá trị => tạo ra hàm getter/setter
				  -> trong thực tế, getter, setter có thể chỉ + - nhân chia,tăng giảm có giới hạn,...
				  
		 */
	}
}
