package inheritance.multiple.iinterface;

public class Child implements Father, Mother{

	@Override
	public void cooking() {
		// TODO Auto-generated method stub
		//Father.super.cooking();
		System.out.println("Child no cook");
	}
	
}
