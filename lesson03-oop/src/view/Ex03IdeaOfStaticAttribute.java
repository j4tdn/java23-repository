package view;

import bean.Car;

public class Ex03IdeaOfStaticAttribute {
	public static void main(String[] args) {
		
		// tạo ra N xe Audi có màu sắc khác nhau
		
		Car c1 = new Car("Audi", "A1", "Red", 220d);
		Car c2 = new Car("Audi", "A2", "Yellow", 270d);
		Car c3 = new Car("Audi", "A3", "White", 520d);
		Car c4 = new Car("Audi", "A4", "Blue", 720d);
		Car c999 = new Car("Audi", "A999", "Black", 290d);

		// Đổi tên model xe --> Tất cả từ Audi chuyển sang MG
		c1.setModel("MG");
		c2.setModel("MG");
		c3.setModel("MG");
		c4.setModel("MG");
		c999.setModel("MG");
		
		// Hiện tại thuộc tính model trong phạm vi của từng đối tượng
		// Mỗi đối tượng sẽ lưu trữ model riêng của nó
		
		// Vấn đề
		// Bài toán yêu cầu: Tất cả xe của hệ thống đều có chung 1 giá trị
		// --> Tất cả các đối tượng của class Car phải sử dụng chung 1 giá trị cho model
		
		// Trong class, nếu muốn thuộc tính nào sử dụng chung cho tất cả các đối tương -> static
		// 			nếu muốn thuộc tính quản lý riêng cho từng object - > non-static
	}
}
