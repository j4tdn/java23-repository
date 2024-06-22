package view;

import bean.Car;

public class Ex03IdeaOfStaticAttribute {
	public static void main(String[] args) {
		//(N) mẫu xe
		Car c1 = new Car("Audi", "A1", "Red", 220d);
		Car c2 = new Car("Audi", "A2", "Red", 240d);
		Car c3 = new Car("Audi", "A3", "Red", 250d);
		Car c4 = new Car("Audi", "A4", "Red", 270d);
		Car c999 = new Car("Audi", "A999", "Red", 320d);
		
		//Đổi tên model xe 
		c1.setModel("MG"); //nên sử dụng mảng cho toàn bộ!
		
		//Hiện tại thuộc tính model đang được lưu theo TỪNG đối tượng
		//Mỗi đối tượng sẽ lưu trữ từng loại
		
		//Vấn đề:
		//Bài toán yêu cầu: tất cả hệ thống xe phải có cùng model (chung giá trị)
		//->> 
	}
}
