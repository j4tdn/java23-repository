package view;

import bean.CarAdv;

public class Ex04UsingStaticAttribute {
	

	public static void main(String[] args) {
	CarAdv c1 = new CarAdv("A1", "Red", 220d);
	CarAdv c2 = new CarAdv("A2", "Green", 440d);
	CarAdv c3 = new CarAdv("A3", "White", 560d);
	CarAdv c4 = new CarAdv("A4", "Blue", 220d);
	
	//c2.setModel("Audi");
	c2.model = "Audi";	// dùng dc nhưng ko nên, nên dùng class để gọi
	System.out.println("c1 ---> "+ c1);
	System.out.println("c2 ---> "+ c2);
	System.out.println("c3 ---> "+ c3);
	System.out.println("c4 ---> "+ c4);
	
//	c4.setModel("MG");	// cập nhật chung cho tất cả các đối tượng
	
	CarAdv.model = "MG";
	c4.setName("A444");	// cập nhật cho c4
	
	// thuộc tính non-static: thuộc phạm vi của đối tượng	--> mỗi đối tượng quản lý riêng
	// thuộc tính static: thuộc phạm vi của class	
	//		--> các đối tượng có chung giá trị
	//		--> ko nên lấy biến, gọi hàm setter để cập nhật giá trị dễ gây hiểu lầm là đang cập nhật cho nó (đối tượng) 
	//		--> nên lấy class gọi để cập nhật giá trị
	
	System.out.println("\n--------- Modified value of static attribute --------------\n");
	System.out.println("c1 ---> "+ c1);
	System.out.println("c2 ---> "+ c2);
	System.out.println("c3 ---> "+ c3);
	System.out.println("c4 ---> "+ c4);
	
	// attribute
	
	// non-static:	thuộc phạm vi đối tượng	--> bắt buộc gọi qua đối tượng
	
	// static:	thuộc phạm vi class	-->	có thể gọi qua đối tượng thuộc class, gọi qua class
	// 			--> nên gọi qua class, ko nên gọi qua đối tượng(Warning)
	
	}

}
