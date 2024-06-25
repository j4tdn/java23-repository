package view;

import bean.Car;

public class Ex03IdeaStaticAttribute {

	public static void main(String[] args) {
		Car c1 = new Car("Audi", "A1", "Red", 200d);
		Car c2 = new Car("Audi", "A2", "Yellow", 200d);
		Car c3 = new Car("Audi", "A3", "White", 180d);
		Car c4 = new Car("Audi", "A4", "Blue", 220d);
		Car c999 = new Car("Audi", "A999", "Black", 280d);

		c1.setModel("MG");
		c2.setModel("MG");
		c3.setModel("MG");
		c4.setModel("MG");
		c999.setModel("MG");
		System.out.println("c1 -->" + c1);
		System.out.println("c2 -->" + c2);
		System.out.println("c3 -->" + c3);
		System.out.println("c4 -->" + c4);
		System.out.println("c999 -->" + c999);
	}
}
