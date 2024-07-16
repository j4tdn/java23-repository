package polymorphism.object;

public class Circle extends Shape {
	@Override
	void calS() {
		System.out.println("Circle#calS ...");
	}

	@Override
	void paint() {
		System.out.println("Circle#paint ...");
	}
	
	void setBackround() {
		System.out.println("Circle#setBackground ...");
	}
	
}
