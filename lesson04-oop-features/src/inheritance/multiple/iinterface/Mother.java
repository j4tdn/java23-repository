package inheritance.multiple.iinterface;

public interface Mother {
	
	default void playBadminton() {
		System.out.println("MotherBadminton");
	}
	
	default void cooking() {
		System.out.println("Mother#cooking");
	}
}
