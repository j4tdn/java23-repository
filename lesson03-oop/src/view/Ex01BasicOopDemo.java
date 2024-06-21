package view;

import bean.Car;

public class Ex01BasicOopDemo {
	public static void main(String[] args) {
		// Car: model, name, color, price
		
		// Yêu cầu: Tạo 3 đối tượng Car có dữ liệu bất kỳ và in ra
		
		// Khi in biến là KDL đối tượng -> tự động gọi hàm toString của class Object
		
		// Nếu muốn in ra giá trị của ô nhớ ở HEAP mà biến đối tượng đang trỏ đến
		// --> override hàm toString
		
		Car c1 = new Car("A", "A1", "Yellow", 2000d);
		Car c2 = new Car("A", "A2", "Red", 4000d);
		Car c3 = new Car("A", "A3", "Green", 3000d);
		
		// Cập nhật tên của xe c2 thành A22
		// Cập nhật giá của xe c3 thành 6000
		
		//c2.name = "A22";
		c2.setName("A22");
		//c3.price = 6000d;
		c3.setPrice(6000d);
		
		// cập nhật gấp đôi giá bán cho xe c1
		//c1.price = c1.price * 2;
		c1.setPrice(c1.getPrice()*2);
		
		System.out.println("c1 --> " +c1);
		System.out.println("c2 --> " +c2);
		System.out.println("c3 --> " +c3);
		
		/*
		 * FOP: data (no restriction, tất cả đều truy cập được, k phân quyền)
		 * OOP: data (access modifier, mỗi class cần quản lý dữ liệu riêng của nó)
		 * 	VD: Car: model, color, price
		 * 		Item: id, name, price
		 * --> Class, cho thuộc tính có access modifier thành private quản lý riêng thông tin cho từng đối tượng
		 * Vấn đề
		 * 1. Các thuộc tính trong class Car đang để access modifier là public
		 * --> dùng mọi nơi
		 * 
		 * + sử dụng private attribute để class bên ngoài k thể truy cập trực tiếp thuộc tính ben trong class
		 * 
		 * + nhưng mình trong thực tế mình vãn muốn class bên ngoài có thể lấy/ cập nhật giá trị cho các thuộc tính bên trong class
		 * 
		 * 
		 * Cau hoi: Vi sao k cho cac thuoc tinh cua Class la public de truy cap de dang ma phai cho private roi khai bao getter/
		 * setter de lay cap nhat gia tri
		 */
	}
}
