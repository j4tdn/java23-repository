package view;

import bean.Car;

public class Ex01BasicOopDemo {
	
	public static void main(String[] args) {
		//Tạo 3 đối tượng CAR
		Car c1 = new Car("A", "A1", "Yellow", 2000d);
		Car c2 = new Car("B", "B2", "Red", 2000d);
		Car c3 = new Car("C", "C3", "Green", 2000d);
		
//		c2.name = "yamaha";
		c2.setName("yamaha");
		c1.doublePrice();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}
	
	
	
	/*
	 * FOP: data (no restriction, tất cả đều truy cập được, 0 phân quyền)
		OOP: data (access modifier, mỗi class qli 1 dữ liệu 'riêng')
		-> Item: name, id, price
		-> Car: model, color, price
		-->> class, cho thuộc tính access là private !! quản lí riêng cho từng đối tượng 
		//Vấn đề:
	 * 1. Các thuộc tính trong Car đang public -> dùng ở đâu cũng được (0 pquyen)
	 * -> sử dụng private attribute để class ngoài 0 truy cập trực tiếp vào
	 * -> actually, vẫn muốn truy cập vào để chỉnh sửa dữ liệu
	 * 
	 * VD: Phân quyền ->> cần get set
	 * setter: cho phép cập nhập giá trị thuộc tính private
	 * getter: cho phép lấy giá trị 
	 * 
	 * Câu hỏi: Vì sao không cho public mà phải getter setter?
	 * ->>nếu public -> ko khác gì biến toàn cục trong FOP -> không đúng định nghĩa OOP.
	 * --> getter setter 
	 * 
	 */
}
