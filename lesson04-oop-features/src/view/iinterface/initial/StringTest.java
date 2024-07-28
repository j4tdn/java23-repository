package view.iinterface.initial;

public interface StringTest {
	
	boolean isLower(String text);
	
	boolean isUpper(String text);
	
	static boolean isEmpty(String text) {
		return text.length() == 0;
	}
	
}
