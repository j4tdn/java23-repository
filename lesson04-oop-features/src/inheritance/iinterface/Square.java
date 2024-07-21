package inheritance.iinterface;

public class Square implements Shape{

	@Override
	public void calS() {
		System.out.println("Square cals ...");
	}

	@Override
	public void paint() {
		System.out.println("Square paint ...");
	}
	
}
