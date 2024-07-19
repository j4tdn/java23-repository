package inheritance.iinterface;

public class ZInheritanceInterfaceDemo {
	public static void main(String[] args) {
		// s1 lúc compile là shape
		// s1 lúc runtime là circle
		Shape s1 = new Circle();
		s1.calS();
		s1.paint();
		
		System.out.println("==========");

		// sử dụng anonyous class
		Shape s2 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Test s2 paint");
			}
			
			@Override
			public void calS() {
				System.out.println("Test s2 calS");
			}
		};
		
		s2.calS();
		s2.paint();
		
		Shape s3 = new TestS3();
		s3.calS();
		s3.paint();
	}
}
