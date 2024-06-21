package view;

import bean.Car;

public class Ex03IdeaOfStaticAttribute {
	public static void main(String[] args) {
		//Tạo ra N xe Audi có màu sắc khác nhau
		Car c1=new Car("Audi","A1","Red",220d);
		Car c2=new Car("Audi","A2","Yellow",440d);
		Car c3=new Car("Audi","A3","white",560d);
		Car c4=new Car("Audi","A4","Blue",220d);
		Car c999=new Car("Audi","A999","Black",280d);
		
		//Đổi tên model xe ->Tất cả từ Audi -> chuyển sang MG
		c1.setModel("MG");//code side :Sử dụng mảng roòi duyệt
		c2.setModel("MG");
		c3.setModel("MG");
		c4.setModel("MG");
		c999.setModel("MG");
		
		System.out.println("c1->"+c1);
		System.out.println("c2->"+c2);
		System.out.println("c3->"+c3);
		System.out.println("c4->"+c4);
		System.out.println("c999->"+c999);
		
		//hiện tại thuộc tính model đc quản lý trong phạm vi của từng đối tượng
		//Mỗi đối tượng 

	}
}
