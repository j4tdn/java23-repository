package view;

import bean.Car;

public class Ex03IdeaOfStaticAttribute {
	
	public static void main(String[] args) {
		// Tạo ra N xe Audi có màu sắc khác nhau
		Car c1 = new Car("Audi", "A1", "Red", 220d);
		Car c2 = new Car("Audi", "A2", "Yellow", 440d);
		Car c3 = new Car("Audi", "A3", "White", 560d);
		Car c4 = new Car("Audi", "A4", "Blue", 220d);
		Car c999 = new Car("Audi", "A999", "Black", 280d);
		
		// Đổi tên model xe --> Tất cả từ Audi -> Chuyển sang MG
		// c1.setModel("MG"); // code sai: sử dụng mảng r duyệt
		c2.setModel("MG");
		// c3.setModel("MG");
		// c4.setModel("MG");
		// c999.setModel("MG");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("c999 --> " + c999);
		
		// Hiện tại thuộc tính model đc quản lý trong phạm vi của từng đối tượng
		// Mỗi đối tượng sẽ lưu trữ model riêng của nó
		
		// Vấn đề
		// Bài toán yêu cầu: Tất cả các xe của hệ thống đều có chugn 1 giá trị
		// --> Tất cả các đối tượng của class Car phải sử dụng chung 1 giá trị cho model
		
		// Trong class, nếu muốn thuộc tính nào sử dụng chung cho tất cả cá đối tượng --> static
		//              nếu thuộc tính mà quản lý riêng cho từng đối tượng --> non-static 
	}

}
