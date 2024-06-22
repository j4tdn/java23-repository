package view;

import bean.CarAdvance;

public class Ex04UsingStaticAttribute {
	public static void main(String[] args) {
		CarAdvance c1 = new CarAdvance("A1", "Red", 220d);
		CarAdvance c2 = new CarAdvance("A2", "Green", 570d);
		CarAdvance c3 = new CarAdvance("A3", "Blue", 275d);
		CarAdvance c4 = new CarAdvance("A4", "White", 240d);	
	
		CarAdvance.model ="Audi";
		System.out.println("c1 --> "+ c1);
		System.out.println("c2 --> "+ c2);
		System.out.println("c3 --> "+ c3);
		System.out.println("c4 --> "+ c4);
		
		CarAdvance.model ="MG"; 
//		c4.setModel("MG");// cập nhật model cho tất cả đối tương
		c4.setName("A444"); // cập nhật cho c4
		
		// thuộc tính non-static: thuộc phạm vi của đối tượng
		// --> mỗi đối tượng quản lý riêng
		
		// Thuộc tính static: thuộc phạm vi của lớp 
		// --> các đối tượng dùng chung giá trị 
		// --> k nên lấy biến, gọi hàm setter để cập nhật giá trị
		// 	gây hiểu nhầm là đang cập nhật cho riêng nó
		//  --> nên lấy class gọi để cập nhật
		
		System.out.println("=== Modify value of static attribute ====");
		
		System.out.println("c1 --> "+ c1);
		System.out.println("c2 --> "+ c2);
		System.out.println("c3 --> "+ c3);
		System.out.println("c4 --> "+ c4);
		
		// attribute 
		// non-static: thuộc phạm vi của đối tượng
		// --> bắt buộc gọi thông qua đối tượng
		
		// static: thuộc phạm vi class
		// --> có thể gọi qua class/ đối tượng thuộc class
		// --> nên gọi thông qua class
		// --> gọi thông qua đối tượng <=> warning 
		
	}
	
}
