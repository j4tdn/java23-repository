package inheritance.multiple.cclass;

public class Child extends Father/*, Mother*/ implements Ancestor, GrandFather{

	@Override
	public void drinking() {
		System.out.println("Child drinking");
	}

	@Override
	public void eating() {
		System.out.println("");
	}
	
	
	
}
