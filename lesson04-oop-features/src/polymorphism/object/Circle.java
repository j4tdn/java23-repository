package polymorphism.object;

public class Circle extends Shape{
	@Override
	void calS() {
		System.out.println("Circle#calS ...");
	}
	
	@Override
	void paint() {
		System.out.println("Circle#paint ...");
	}
	
	void setBackGround() {
		System.out.println("Circle#setBG");
	}
}
