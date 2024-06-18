package view;

import bean.Car;

public class EX01BacsicOopDemo {
	public static void main(String[] args) {
		Car c1= new Car("A","A1","Yellow",200d);
		Car c2= new Car("A","A2","Red",400d);
		Car c3= new Car("A","A3","Green",300d);
		
		
		c2.setName("A22");
		c3.setPrice(600d);
		
		c1.doublePrice();
		System.out.println("c1-->"+c1);
		System.out.println("c2-->"+c2);
		System.out.println("c3-->"+c3);
		
	}
}
