package view;

import bean.Car;

public class Ex01BasicOopDemo {
	public static void main(String[] args) {
		// Car: model, name, color, price

		// Yêu cầu: Tạo 3 đối tượng Car có dữ liệu bất kỳ và in ra

		// Khi in biến ra là KDL đối tượng --> tự động gọi hàm toString của class Object
		// --> tên package.class@hash

		// Nếu muốn in ra giá trị của ô nhớ ở HEAP mà biến đối tượng đang trỏ đến

		Car c1 = new Car("A", "A1", "Yellow", 2000d);
		Car c2 = new Car("B", "A2", "Red", 4000d);
		Car c3 = new Car("C", "A3", "Green", 6500d);

		// Cập nhật tên của C2 thành A22
		// Cập nhật giá của xe C3 thành 6000

		// c2.name = "A22";
		c2.setName("A22");
		// c3.price = 6000d;
		c3.setPrice(6000d);

		// Cập nhật giá trị gấp đôi cho xe C1
		// c1.price = c1.price * 2;         // setPrice: cập nhật giá trị
		// c1.setPrice(c1.getPrice()* 2);  // getPrice: lấy giá trị
		c1.doublePrice();

		System.out.println("c1 -> " + c1);
		System.out.println("c2 -> " + c2);
		System.out.println("c3 -> " + c3);

		/*
		 * FOP: data(no restriction, tất cả đều truy cập được, không phân quyền) OOP:
		 * data(access modifier, mỗi class cần quản lý dữ liệu riêng của nó) VD: Car:
		 * model, color, price Item: id, name, price
		 * 
		 * --> class, cho thuộc tính có access modifier thành private quản lý riêng
		 * thông tin cho từng đối tượng
		 * 
		 * Vấn đề 1. Các thuộc tính trong class Car đang để access modifier là 'public'
		 * --> dùng ở đâu cũng được
		 * 
		 * 
		 * + Sử dụng 'private attribute' để class bên ngoài khong thể truy cập trực tiếp
		 * đến thuộc tính bên trong class
		 * 
		 * + Nhưng mình vẫn muốn class bên ngoài lấy giá trị ( gán/ cập nhật giá trị )
		 * cho các thuộc tính bên trong class
		 * 
		 * VD: Công Ty Nhân Viên: chứa thuộc tính Private
		 * 
		 * 
		 * 
		 * --> Hàm Setter --> cho phép cập nhật giá trị của thuộc tính private Getter
		 * --> Lấy giá trị của thuộc tính Private
		 * 
		 * Câu hỏi: Vì sao không cho các thuộc tính của Class là Public để truy cập dễ
		 * dàng mà phải cho Private rồi Khai báo Setter, Getter --> Về xem lại video r
		 * giải thích vào
		 * 
		 * 
		 */

	}

}
