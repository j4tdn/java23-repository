package view;

import bean.Car;

public class Ex01BasicOopDemo {

	public static void main(String[] args) {
		
		// Car: model, name, color, price
		// Yeu cau: Tao 3 doi tuong Car co du lieu bat ky va in ra
		// Khi in bien KDL doi tuong -> tu dong goi ham toString cua class Object
		//                           -> ten package.class@hash
		// Neu muon in ra gia tri cua o nho HEAP ma bien doi tuong dan tro den
		// --> override ham toString
		
		Car c1 = new Car("A", "A1", "Yellow", 2000d);
		Car c2 = new Car("A", "A2", "Red", 4000d);
		Car c3 = new Car("A", "A3", "Green", 3000d);
		
		// Cap nhat ten cua xe c2 thanh A22
		 // c2.name = "A22";
		c2.setName("A22");
		// Cap nhat gia cua xe c3 thanh 6000
		//c3.price = 6000d;
		c3.setPrice(6000d);
		// Cap nhat gap doi  gia ban cho xe c1
		//c1.price = c1.price * 2;
		//c1.setPrice(c1.getPrice() * 2);
		c1.doublePrice();
		
		System.out.println("c1 -> " + c1);
		System.out.println("c2 -> " + c2);
		System.out.println("c3 -> " + c3);
		
		/*
		FOP: data(no restriction, tat ca deu truy cap dc, khong phan quyen)
		OOP: data(access modifier, moi class can quan ly du lieu 'rieng' cua no)
		     VD: Car: model, color, price
		         Item: id, name, price
		--> class, cho thuoc tinh co access modifier thanh private
		    quan ly rieng thong tin cho tung doi tuong
		
		Van de
		1. Cac thuoc tinh trong class Car dang de access modifier la 'public'
		   --> dung o dau cung dc 
		   
		   + su dung private attribute de class ben ngoai ko the truy cap truc tiep thuoc tinh ben trong class
		   + nhung trong thuc te minh van muon class ben ngoai co the lay/cap nhat gia tri cho
		     cac thuoc tinh ben trong class
		VD: Cong ty
		    Nhan vien: chua tt private
		    
		+ setter --> cho phep cap nhat gia tri cua thuoc tinh private
		+ getter --> lay gia tri cua thuoc tinh private   
		
		Cau hoi: Vi sao ko cho cac thuoc tinh cua class la public de truy cap de dang
		         ma phai cho private roi khai bao getter, setter de lay/cap nhat gia tri
		 */
	}
}
