package inheritance.multiple.iinterface;

public interface Father {
	
	default void running() {
		System.out.println("Father#running");
	}
	
	default void cooking() {
		System.out.println("Father#cooking");
	}
}