package inheritance.iinterface;

// implements class
public class TestS3 implements Shape {
	@Override
	public void calS() {
		System.out.println("Test s3 paint");
	}

	@Override
	public void paint() {
		System.out.println("Test s3 calS");
	}
}
