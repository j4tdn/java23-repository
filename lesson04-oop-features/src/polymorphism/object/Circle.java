package polymorphism.object;

public class Circle extends Shape{
	@Override
	void calS() {
		System.out.println("Circla#calS...");
	}
	@Override
	void paint() {
		System.out.println("Circle#paint ...");
	}
	void setBackground() {
		System.out.println("Circle#setBackground...");
	}
}
