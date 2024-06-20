package view;

import bean.Car;

public class Ex03IdeaOfStaticAttribute {

	public static void main(String[] args) {
//		Tạo ra N(1000) xe audi có màu sắc khác nhau 
		Car c1 = new Car("Audi", "A1", "Red", 220d);
		Car c2 = new Car("Audi", "A2", "Yellow", 440d);
		Car c3 = new Car("Audi", "A3", "White", 560d);
		Car c4 = new Car("Audi", "A4", "Blue", 220d);
		Car c999 = new Car("Audi", "A999", "Black", 280d);

//		Đổi tên model xe --> tất cả từ Audi sang MG
		c1.setModel("MG");
		c2.setModel("MG");
		c3.setModel("MG");
		c4.setModel("MG");
		c999.setModel("MG");
//		CarAdv.model = "Mec";
		System.out.println(c1); // code side:sử dụng mảng rồi duyệt
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c999);

		/*
		 * Hiện tại mỗi model được quản lý trong phạm vi của từng đối tượng Mỗi đối
		 * tượng sẽ được lưu trữ model riêng cuản nó
		 * 
		 * Vấn đề: Bài toán yêu cầu: Tất cả các xe của hệ thống đều có chung 1 giá trị
		 * --->Tất cả các đối tượng của class car phải sử dụng chung 1 giá trị model
		 * 
		 * Trong class, nếu muốn thuộc tính nào sử dụng chung cho tất cả các đối tượng
		 * --> static nếu thuộc tính quản lý riêng cho từng đối tượng: non-static
		 * 
		 */

	}
}
