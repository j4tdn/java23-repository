package view;

import bean.Car;

public class Ex03OIdeaOfStaticAttribute {

	public static void main(String[] args) {
		// Tạo ra N(1000) xe Audi có màu sắc khác nhau
		Car c1 = new Car("Audi", "A1", "Red", 220d);
		Car c2 = new Car("Audi", "A2", "Yellow", 440d);
		Car c3 = new Car("Audi", "A3", "White", 560d);
		Car c4 = new Car("Audi", "A4", "Blue", 560d);
		Car c999 = new Car("Audi", "A999", "Black", 280d);
		
		// Đổi model xe từ Audi -> MG
		// code side: sử dụng mảng rồi duyệt
		// c1.setModel("MG");
		c2.setModel("MG");
		// c3.setModel("MG");
		// c4.setModel("MG");
		// c999.setModel("MG");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("c999 --> " + c999);
		
		// Hiện tại thuộc tính model được quản lý trong phạm vi của từng đối tượng
		// Mỗi đối tượng sẽ lưu trữ model riêng của nó
		
		// Vấm đề
		// Bài toán yêu cầu tất cả các xe của hệ thống đều có chung 1 giá trị
		// --> Tất cả các đối tượng của class Car phải sử dụng chung 1 giá trị cho model
		
		// Trong 1 class, nếu muốn thuộc tính nào sử dụng chung cho tất cả các đối tượng --> static
		//				  nếu thuộc tính sử dụng riêng để quản lý riêng --> non-static
		
	}
	
}
