package view;

import bean.Car;

public class Ex03IdeaOfStaticAttribute {

	public static void main(String[] args) {
		
		// Tao ra N(1000) xe Audi co mau sac khac nhau
		Car c1 = new Car("Audi", "A1", "Red", 220d);
		Car c2 = new Car("Audi", "A2", "Yellow", 440d);
		Car c3 = new Car("Audi", "A3", "White", 560d);
		Car c4 = new Car("Audi", "A4", "Blue", 220d);
		Car c999 = new Car("Audi", "A999", "Black", 280d);
		
		// Doi ten model xe --> Tat ca tu Audi -> MG
		c1.setModel("MG"); // code side: su dung mảng roi duyet
		c2.setModel("MG");
		c3.setModel("MG");
		c4.setModel("MG");
		c999.setModel("MG");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("c999 --> " + c999);
		
		// Hien tai thuoc tinh model dc quan ly trong pham vi tung doi tuong
		// Moi doi tuong se luu tru model rieng cua no
		
		// Van de
		// Bai toan yeu cau: Tat ca cac xe ca he thong deu co chung 1 gia tri
		// --> Tat ca doi tuong cua class Car phai su dung chung 1 gia tri cho model
		
		// Trong class, neu muon thuoc tinh nao su dung chung cho tat ca doi tuong --> static
		//              neu thuoc tinh ma quan ly rieng cho tung doi tuong --> non static
	}
}
