package inheritance.iinterface;

public class ZInheritanceInterfaceDemo {
	public static void main(String[] args) {
		 //s1 luc compile la Shape 
		//s2 luc runtime la Circle
		
		Shape s1 = new Circle();
		s1.calS();
		s1.paint();
		
		System.out.println("====");
		
		// anonymous class
		Shape s2 = new Shape() {
			
			@Override
			public void paint() {
				// TODO Auto-generated method stub
				System.out.println("Test s2 paint");
			}
			
			@Override
			public void calS() {
				// TODO Auto-generated method stub
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
