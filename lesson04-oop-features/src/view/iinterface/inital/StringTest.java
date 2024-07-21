package view.iinterface.inital;

public interface StringTest {
	
	boolean islower(String text);
	
	boolean isUpperCase(String text);
	
	static boolean isEmpty(String text) {
		return text.length() == 0;
	}
	
}
