package exception;

public class InvalidPasswordException extends Exception {
	
	public InvalidPasswordException() {
		super ("Invalid age exception");
	}
	
	public InvalidPasswordException(String message) {
		super (message);
	}
}
