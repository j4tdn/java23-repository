package view.iiterface.inital;

public interface StringTest {

	boolean isLowerCase(String text);

	
	boolean isUpperCase(String text);
	
	static boolean isEmpty(String text) {
		return text.length();
	}
}
