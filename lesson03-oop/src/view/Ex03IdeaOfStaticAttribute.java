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

		// Đổi tên model xe --> Tất cả từ Audi sang MG
		c1.setModel("MG"); // code side: sử dụng mảng rồi duyệt
		c2.setModel("MG");
		c3.setModel("MG");
		c4.setModel("MG");
		c999.setModel("MG");
		
		//Hiện tại thuộc tính model dc quản lý trong phạm vi từng đối tượng 
		//Mỗi đối tượng sẽ dc lưu trữ model riêng của nó
		
		//Vấn đề:
		//Bài toán yêu câu:	tất cả các xe của hệ thống đều có chung 1 giá trị 
		// 	--> Tất cả đối tượng xe của class Car phải sử dụng chung 1 giá trị cho model
		
		//* Trong class, nếu muốn thuộc tính nào sử dụng chung cho tất cả các đối tượng  --> thì dùng static --> (Tạo ra ô nhớ dùng chung cho tất cả đổi tượng của thuộc tính đó)   
		//			   , nếu thuộc tính nào  mà quản lý riêng cho từng đối tượng ---> dùng non-static -->(Lưu trữ riêng biệt từng ô nhớ của mỗi đối tượng) 
	}

}
