package inheritance.multiple.iinterface;

public class Child implements Father, Mother{

	@Override
	public void cooking() {
		// Father.super.cooking();
		// Mother.super.cooking();
		System.out.println("Child#No_cook");
	}
	
}
