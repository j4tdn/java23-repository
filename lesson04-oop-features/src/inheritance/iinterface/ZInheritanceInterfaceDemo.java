package inheritance.iinterface;

public class ZInheritanceInterfaceDemo {
	
	public static void main(String[] args) {
		// s1 lúc comiple là Shape
		// s2 lúc runtime là Circle
		Shape s1 = new Circle(); 
		s1.calS();
		s1.paint();
		
		System.out.println("=====");
		
		// anonymous class
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
		
		System.out.println("=====");
		
		// implementation class
		Shape s3 = new TestS3();
		s3.calS();
		s3.paint();
	}
	
}
