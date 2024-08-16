package exception;

public class NumberFormatException extends Exception{
	
	public NumberFormatException() {
		super ("Format age exception");
	}
	
	public NumberFormatException(String message) {
		super (message);
	} 

}
