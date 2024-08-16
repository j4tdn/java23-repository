package exception;

public class FormatEmailException extends Exception {
	
	public FormatEmailException () {
		super ("Format age Excemtion");
	}
	
	public FormatEmailException (String message) {
		super (message);
	}
}
