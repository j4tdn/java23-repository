package inheritance.multiple.iinterface;

public interface Father {

	default void running() {
		System.out.println("Father#Running");
	}

	// void test();
	
	default void cooking() {
		System.out.println("Father#cooking");
	}
	
}
