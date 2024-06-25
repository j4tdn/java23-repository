package view;

import bean.CarAdv;

public class Ex04UsingStaticAttribute {

	public static void main(String[] args) {
		CarAdv c1 = new CarAdv("A1", "Red", 220d);
		CarAdv c2 = new CarAdv("A1", "Red", 220d);
		CarAdv c3 = new CarAdv("A1", "Red", 220d);
		CarAdv c4 = new CarAdv("A1", "Red", 220d);
		
		//c2.setModel("Audi");
		c2.model = "Audi";
		System.out.println("c1 -->" + c1);
		System.out.println("c2 -->" + c2);
		System.out.println("c3 -->" + c3);
		System.out.println("c4 -->" + c4);

		
		CarAdv.model = "MG";
		//c4.setModel("MG");
		c4.setName("A444");
		// thuộc tính non-static: thuộc phạm vi của đối tượng
		// --> mỗi đối tượng quản lý riêng
		
		//thuộc tính static: thuộc phạm vi của class
		// --> các đối tượng dùng chung giá trị
		// --> ko nên lấy biến, gọi hàm setter để cập nhật giá trị 
		//     gây hiểu nhầm là đang cập nhật giá trị riêng của nó 
		// --> nên lấy class gọi để cập nhật giá trị
		
		System.out.println("===");
		System.out.println("c1 -->" + c1);
		System.out.println("c2 -->" + c2);
		System.out.println("c3 -->" + c3);
		System.out.println("c4 -->" + c4);

	}
}
