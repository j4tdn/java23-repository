package view;

import bean.CarAdv;

public class Ex04UsingStaticAttribute {

	public static void main(String[] args) {
		CarAdv c1= new CarAdv("A1", "Red", 220d);
		CarAdv c2 = new CarAdv("A2", "Green", 220d);
		CarAdv c3 = new CarAdv("A3", "Blue", 220d);
		CarAdv c4 = new CarAdv("A4", "White", 220d);
		
		// c2.setModel("Audi");
		// c2.model = "Audi";
		CarAdv.model = "Audi";
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		
		//c4.setModel("MG"); 	// cập nhật model cho tất cả các đối tượng
		CarAdv.model = "MG";
		c4.setName("A444");	// cập nhật cho C4
		
		// Thuộc tính non-static: thuộc phạm vi của đối tượng 
		// --> mỗi đối tượng quan lý riên
		
		// Thuộc tính static: thuộc phạm vi của class
		// --> các đối tượng dùng chung giá trị
		// --> không nên lấy biến/gọi hàm setter để cập nhật giá trị vì nó sẽ gây hiểu nhầm
		//	   là đang cập nhật cho riêng nó.
		// --> nến lấy class để cập nhật giá trị
		
		System.out.println("=== Modified value of static attribute ===");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		
		
		// Attribute
		// Non-static: thuộc phạm vi của đối tượng
		// Bắt buộc gọi thông qua đối tượng
		
		// Static thuộc phạm vi của class
		// có thể gọi thông qua class, đối tượng thuộc class nhưng nên gọi thông qua class
		// --> gọi thông qua đối tượng --> warning
		
	}
	
}
