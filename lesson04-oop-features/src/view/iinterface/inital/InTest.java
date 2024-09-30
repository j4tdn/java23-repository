package view.iinterface.inital;
//function interface
public interface InTest {

	boolean test (int number);
	
	default int doubleVal(int number) {
		return number * number;
	}
}
