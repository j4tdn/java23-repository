package oop;


public class Ex01 {
	public static void main(String[] args) {
		Car c1= new Car("A","A1","Yellow",2000d);
		Car c2= new Car("A","A2","Red",4000d);
		Car c3= new Car("A","A3","Green",3000d);
		
		c1.setName("B1");
		
		System.out.println("c1->"+c1);
		System.out.println("c2->"+c2);
		System.out.println("c3->"+c3);
	}
}
