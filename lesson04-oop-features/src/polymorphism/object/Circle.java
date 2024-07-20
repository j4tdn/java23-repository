package polymorphism.object;

public class Circle extends Shape {
	@Override //có override cũng được, k có cũng được, nhưng nên có để biết
	void calS() {
		System.out.println("Circle#calS ...");
	}

	@Override 
	void paint() {
		System.out.println("Circle#paint ...");
	}
	
	void setBackground() {
		System.out.println("Circle#setBackground ...");
	}
}
