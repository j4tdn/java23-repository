package view;

import bean.CarAdv;

public class Ex04UsingStaticAttribute {
	
	public static void main(String[] args) {
		CarAdv c1 = new CarAdv(null, "A1", "Red", 220d);
		CarAdv c2 = new CarAdv(null, "A2", "Green", 320d);
		CarAdv c3 = new CarAdv(null, "A3", "Blue", 420d);
		CarAdv c4 = new CarAdv(null, "A4", "White", 120d);
		
		//c2.setModel("Audi");
		//c2.model = "Audi";
		CarAdv.model = "Audi";
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		
		//c4.setModel("MG"); // cập nhập model cho tất cả đối tượng
		CarAdv.model = "MG";
		c4.setName("A444"); // cập nhập cho c4
		
		// thuộc tính non-static thuộc phạm vi của đối tượng
		// --> mỗi đối tượng quản lý riêng
		
		// thuộc tính static: thuộc phạm vi của class
		// --> các đối tượng dùng chung giá trị
		// --> ko nên lấy biến, gọi hàm setter để cập nhập giá trị
		// 	   gây hiểu nhầm là đang cập nhập cho riêng nó
		// --> nên lấy class gọi để cập nhập
		
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
