package exception;

public class InvalidAgeException extends Exception {

	public InvalidAgeException() {
		super("Invalid age exception");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
}
