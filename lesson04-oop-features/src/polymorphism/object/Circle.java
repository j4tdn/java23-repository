package polymorphism.object;

public class Circle extends Shape {
	
	@Override
	void callS() {
		System.out.println("Circle#calS...");
	}
	@Override
	void Pain() {
		System.out.println("Circle#paint ...");
	}
	void setBackground() {
		System.out.println("Circle#setBackground ...");
	}
}
