package inheritance.iinterface;

public class ZInheritanceInterfaceDemo {
	public static void main(String[] args) {
		//s1 compile là shape
		//s2 lúc runtime là circle
		Shape s1 = new Circle();
		s1.calS();
		s1.paint();
		
		//anonymous class
		Shape s2 = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Test s2 paint");
			}
			
			@Override
			public void calS() {
				System.out.println("Test s2 cals");
			}
		};
		
		s2.calS();
		s2.paint();
		
		//implementation class
		Shape s3 = new Square();
		s3.calS();
		s3.paint();
	}
}
