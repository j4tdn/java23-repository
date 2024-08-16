package view;

import bean.CarAdv;

public class Ex04UsingStaticAttribute {
	
	public static void main(String[] args) {
		CarAdv c1 = new CarAdv("A1", "Red", 220d);
		CarAdv c2 = new CarAdv("A2", "Green", 320d);
		CarAdv c3 = new CarAdv("A3", "Blue", 420d);
		CarAdv c4 = new CarAdv("A4", "White", 120d);
		
		// c2.setModel("Audi");
		// c2.model = "Audi";
		CarAdv.model = "Audi";
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		
		// c4.setModel("MG"); // cập nhật model cho tất cả các đối tượng
		CarAdv.model = "MG";
		c4.setName("A444"); // cập nhật cho c4
		
		// thuộc tính non-static: thuộc phạm vi của đối tượng
		// --> mỗi đối tượng quản lý riêng
		
		// thuộc tính static: thuộc phạm vi của class
		// --> các đối tượng dùng chung giá trị
		// --> ko nên lấy biến, gọi hàm setter để cập nhật giá trị
		// 	   gây hiểu nhầm là đang cập nhật cho riêng nó
		// --> nên lấy class gọi để cập nhật
		
		System.out.println("=== Modified value of static attribute ===");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		
	
		// attribute
		
		// non-static: thuộc phạm vi đối tượng
		// --> bắt buộc gọi thông qua đối tượng 
		
        // static: thuộc phạm vi class
		// --> có thể gọi qua class, đối tượng thuộc class
		// --> nên gọi thông qua class
		// --> gọi thông qua đối tượng --> warning
	
	}

}
