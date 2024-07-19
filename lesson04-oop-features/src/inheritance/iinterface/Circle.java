package inheritance.iinterface;

public class Circle implements Shape{
	
	@Override
	public void calS() {
		System.out.println("Cricle --> calS ....");
	}
	
	@Override
	public void paint() {
		System.out.println("Cricle --> paint ....");
	}
}
