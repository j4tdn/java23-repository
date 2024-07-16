package inheritance.iinterface;

public class Square implements Shape {
	@Override
	public void calS() {
		System.out.println("Circle --> calS...");
	}

	@Override
	public void paint() {
		System.out.println("Circle --> paint...");
	}
}
