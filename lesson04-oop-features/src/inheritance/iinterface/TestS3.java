package inheritance.iinterface;

public class TestS3 implements Shape {

	@Override
	public void paint() {
		System.out.println("Test s2 paint");
	}
	
	@Override
	public void calS() {
		System.out.println("Test s2 calS");
	}
}
