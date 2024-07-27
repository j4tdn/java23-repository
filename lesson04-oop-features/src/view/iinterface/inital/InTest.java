package view.iinterface.inital;

public interface InTest {

	boolean test (int number);
	
	default int doubleVal(int number) {
		return number * number;
	}
}
