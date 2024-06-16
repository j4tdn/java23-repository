package view;

import bean.Car;

public class Ex03IdeaOfStaticAttribute {

	public static void main(String[] args) {
		// Tạo ra N(1000) xe Audi có màu sắc khác nhau
		Car c1 = new Car("Audi", "A1", "Red", 220d);
		Car c2 = new Car("Audi", "A2", "Yellow", 440d);
		Car c3 = new Car("Audi", "A3", "White", 560d);
		Car c4 = new Car("Audi", "A4", "Blue", 220d);
		Car c999 = new Car("Audi", "A999", "Black", 280d);
		
		//Đổi tên model xe --> Tất cả từ Audi -> chuyển sang MG
//		c1.setModel("MG"); // code side: sử dụng mảng rồi duyệt
		c2.setModel("MG");
//		c3.setModel("MG");
//		c4.setModel("MG");
//		c999.setModel("MG");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c1 --> " + c2);
		System.out.println("c1 --> " + c3);
		System.out.println("c1 --> " + c4);
		System.out.println("c1 --> " + c999);
		
		// Hiện tại thuộc tính model được quản lý trong phạm vi của từng đối tượg
		// Mỗi đối tượng sẽ lưu trữ model riêng của nó
		
		// Vấn đề
		// Bài toán yêu cầu: Tất cả các xe của hệ thống đều có chung 1 giá trị
		// --> Tất cả các đối tượng của class Car phải sử dụng chung 1 giá trị cho model.
	}
	
}
