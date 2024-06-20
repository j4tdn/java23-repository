package view;

import bean.Car;

public class Ex01BasicOopDemo {

	public static void main(String[] args) {
		// Car model,name, color, price

//		Yêu cầu: Tạo 3 đối tượng Car có dữ liệu bất kỳ và in ra

//		Khi in biến là KDL đối tượng ---> tự động gọi hàm toString của class object 
//		                             ---> tên package.class@hash

//		Nếu muốn in ra giá trị của ô nhớ HEAP mà biến đối tượng đang trỏ đến 
//		---> override hàm toString

		Car c1 = new Car("A", "Mec", "Black", 2000d);
		Car c2 = new Car("B", "BMW", "Black", 1000d);
		Car c3 = new Car("C", "Porsche", "Black", 3000d);
//		c1.price = 3000d;
		c1.setPrice(3000d);
//		cập nhật giá gấp đôi c1
//		c1.setPrice(c1.getPrice() * 2);
		c1.doublePrice();

		System.out.println("c1 ----> " + c1);
		System.out.println("c2 ----> " + c2);
		System.out.println("c3 ----> " + c3);

//	FOP: data(no restriction,tất cả đều truy cập được, không phân quyền)
//	OOP: data(access modifier, mỗi class cần quản lý dữ liệu riêng của nó)
//		Vd: Car: model,color, price
//		Item: id, name, price
//		class, cho thuộc tính có access modifier thành private 
//		--> quản lý riêng thuộc tính chot từng đối tượng

//		Vấn đề: 
//		1. Các thuộc tính trong class Car đang để access modifier là ' public'
//		---> dùng ở đâu cũng được

//		+Sử dụng private attribute để class bên ngoài không thể truy cập trực tiếp thuốc tính bên trong class

//	+ nhưng trong thực tế mình vẫn muốn class bên ngoài có thể lấy/gán/cập nhật giá trị cho các thuộc tính bên trong class
//		vd:Công Ty
//		Nhân viên chứa thông tin private 
//		+ setter: Cho phép cập nhật giá trị của thuộc tính private 
//		+ getter: Lấy giá trị của thuộc tính private

		// Vì sao các thuộc tính k cho public rồi ngắt để không cho nhanh mà lại dùng
		// private
//		chứa thông tin tuyệt mật, riêng tư

//   Câu hỏi vì sao không cho các thuộc tính của class là public để truy cập dễ dàng
//		mà phải cho private rồi khai báo getter,setter để lấy/cập nhật giá trị

	}
}
