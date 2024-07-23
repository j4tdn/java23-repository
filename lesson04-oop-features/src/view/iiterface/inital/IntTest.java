package view.iiterface.inital;

@FunctionalInterface
public interface IntTest {
	
	boolean test(int number);
	
	default int doubleVal(int number) {
		return number * number;
	}
	
}